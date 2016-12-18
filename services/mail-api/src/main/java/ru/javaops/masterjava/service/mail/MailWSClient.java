package ru.javaops.masterjava.service.mail;

import com.google.common.io.Resources;
import lombok.extern.slf4j.Slf4j;
import ru.javaops.web.WsClient;

import javax.xml.namespace.QName;
import java.util.Set;

/**
 * gkislin
 * 28.11.2016
 */
@Slf4j
public class MailWSClient {
    private static final WsClient<MailService> WS_CLIENT;

    static {
        WS_CLIENT = new WsClient<MailService>(Resources.getResource("wsdl/mailService.wsdl"),
                new QName("http://mail.javaops.ru/", "MailServiceImplService"),
                MailService.class);

        WS_CLIENT.init("mail", "/mail/mailService?wsdl");
    }


    public static String sendBulkMail(final Set<Addressee> to, final Set<Addressee> cc, final String subject, final String body) {
        log.info("Send mail to '" + to + "' cc '" + cc + "' subject '" + subject + (log.isDebugEnabled() ? "\nbody=" + body : ""));
        String status = WS_CLIENT.getPort().sendBulkMail(to, cc, subject, body);
        log.info("Sent with status: " + status);
        return status;
    }

    public static GroupResult sendIndividualMails(final Set<Addressee> to, final String subject, final String body) {
        log.info("Send mail to '" + to + "' subject '" + subject + (log.isDebugEnabled() ? "\nbody=" + body : ""));
        GroupResult result = WS_CLIENT.getPort().sendIndividualMails(to, subject, body);
        log.info("Sent with result: " + result);
        return result;
    }
}
