package ru.javaops.masterjava.service.mail;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.io.Resources;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.event.Level;
import ru.javaops.ExceptionType;
import ru.javaops.web.WebStateException;
import ru.javaops.web.WsClient;
import ru.javaops.web.handler.SoapClientLoggingHandler;

import javax.xml.namespace.QName;
import java.util.Set;

import static ru.javaops.web.WsClient.HOSTS;

/**
 * gkislin
 * 28.11.2016
 */
@Slf4j
public class MailWSClient {
    private static final WsClient<MailService> WS_CLIENT;
    private static final SoapClientLoggingHandler LOGGING_HANDLER = new SoapClientLoggingHandler(Level.DEBUG);

    static {
        WS_CLIENT = new WsClient<MailService>(Resources.getResource("wsdl/mailService.wsdl"),
                new QName("http://mail.javaops.ru/", "MailServiceImplService"),
                MailService.class);

        WS_CLIENT.init("mail", "/mail/mailService?wsdl",
                HOSTS.getString("mail.ws.user"), HOSTS.getString("mail.ws.password"));
    }

    private static MailService getPort() {
        MailService port = WS_CLIENT.getPort();
        WsClient.setHandler(port, LOGGING_HANDLER);
        return port;
    }

    public static String getAuthHeader() {
        return authHeader;
    }

    public static String sendBulkMail(final Set<Addressee> to, final Set<Addressee> cc, final String subject, final String body) throws WebStateException {
        log.info("Send mail to '" + to + "' cc '" + cc + "' subject '" + subject + (log.isDebugEnabled() ? "\nbody=" + body : ""));
        String status;
        try {
            status = getPort().sendBulkMail(to, cc, subject, body);
        } catch (Exception e) {
            throw new WebStateException(ExceptionType.NETWORK, e);
        }
        log.info("Sent with status: " + status);
        return status;
    }

    public static GroupResult sendIndividualMails(final Set<Addressee> to, final String subject, final String body) throws WebStateException {
        log.info("Send mail to '" + to + "' subject '" + subject + (log.isDebugEnabled() ? "\nbody=" + body : ""));
        GroupResult result;
        try {
            result = getPort().sendIndividualMails(to, subject, body);
        } catch (Exception e) {
            throw new WebStateException(ExceptionType.NETWORK, e);
        }
        log.info("Sent with result: " + result);
        return result;
    }

    public static Set<Addressee> split(String addressees) {
        Iterable<String> split = Splitter.on(',').trimResults().omitEmptyStrings().split(addressees);
        return ImmutableSet.copyOf(Iterables.transform(split, Addressee::new));
    }
}