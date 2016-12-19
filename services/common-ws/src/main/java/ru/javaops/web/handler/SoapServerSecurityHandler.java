package ru.javaops.web.handler;

import com.sun.xml.ws.api.handler.MessageHandlerContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@Slf4j
abstract public class SoapServerSecurityHandler extends SoapBaseHandler {
    public static final String AUTHORIZATION = "Authorization";

    private String authHeader;

    public SoapServerSecurityHandler(String authHeader) {
        this.authHeader = authHeader;
    }

    public SoapServerSecurityHandler(String user, String password) {
        this.authHeader = encodeBasicAuthHeader(user, password);
    }

    @Override
    public boolean handleMessage(MessageHandlerContext ctx) {
        if (!isOutbound(ctx)) {
            Map<String, List<String>> headers = (Map<String, List<String>>) ctx.get(MessageContext.HTTP_REQUEST_HEADERS);
            List<String> autHeader = headers.get(AUTHORIZATION);
            int code = getResponseCode((autHeader == null || autHeader.isEmpty() ? null : autHeader.get(0)), authHeader);
            if (code != 0) {
                ctx.put(MessageContext.HTTP_RESPONSE_CODE, code);
                throw new SecurityException();
            }
        }
        return true;
    }

    public static int getResponseCode(String header, String authHeader) {
        if (header == null) {
            log.warn("Unauthorized access");
            return HttpServletResponse.SC_UNAUTHORIZED;
        }
        if (!authHeader.equals(header)) {
            log.warn("Wrong password access");
            return HttpServletResponse.SC_FORBIDDEN;
        }
        return 0;
    }

    @Override
    public boolean handleFault(MessageHandlerContext context) {
        log.error("Error when authorization");
        return false;
    }

    public static String encodeBasicAuthHeader(String name, String passw) {
        String authString = name + ":" + passw;
        return "Basic " + DatatypeConverter.printBase64Binary(authString.getBytes());
    }
}
