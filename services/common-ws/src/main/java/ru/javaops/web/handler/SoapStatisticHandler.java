package ru.javaops.web.handler;

import com.sun.xml.ws.api.handler.MessageHandlerContext;
import ru.javaops.web.Statistics;

/**
 * User: GKislin
 * Date: 27.04.2009
 */

public class SoapStatisticHandler extends SoapBaseHandler {

    private static final String PAYLOAD = "PAYLOAD";
    private static final String START_TIME = "START_TIME";

    public boolean handleMessage(MessageHandlerContext context) {
        if (!isOutbound(context)) {
            String payload = context.getMessage().getPayloadLocalPart();
            context.put(PAYLOAD, payload);
            context.put(START_TIME, System.currentTimeMillis());
        } else {
            // Doesn't work for @Oneway methods
            Statistics.count((String) context.get(PAYLOAD), (Long) context.get(START_TIME), Statistics.RESULT.SUCCESS);
        }
        return true;
    }

    public boolean handleFault(MessageHandlerContext context) {
        Statistics.count((String) context.get(PAYLOAD), (Long) context.get(START_TIME), Statistics.RESULT.FAIL);
        return true;
    }
}