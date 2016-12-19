package ru.javaops.web;

import com.typesafe.config.Config;
import ru.javaops.masterjava.config.Configs;
import ru.javaops.web.handler.SoapServerSecurityHandler;

import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * gkislin
 * 28.11.2016
 */
public class WsClient<T> {
    public static Config HOSTS;

    private final Class<T> serviceClass;
    private final Service service;

    private T port;

    static {
        HOSTS = Configs.getConfig("hosts.conf", "hosts");
    }

    public WsClient(URL wsdlUrl, QName qname, Class<T> serviceClass) {
        this.serviceClass = serviceClass;
        this.service = Service.create(wsdlUrl, qname);
    }

    public void init(String host, String endpointAddress, String user, String password) {
        init(host, endpointAddress);
        String authHeader = SoapServerSecurityHandler.encodeBasicAuthHeader(user, password);
        if (user != null && password != null) {
            setAuth(port, user, password);
        }
    }

    public void init(String host, String endpointAddress) {
        port = service.getPort(serviceClass);
        BindingProvider bp = (BindingProvider) port;
        Map<String, Object> requestContext = bp.getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, HOSTS.getString(host) + endpointAddress);
    }

    public static <T> void setAuth(T port, String user, String password) {
        Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, user);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
    }

    public static <T> void setHandler(T port, Handler handler) {
        Binding binding = ((BindingProvider) port).getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(handler);
        binding.setHandlerChain(handlerList);
    }

    public T getPort() {
        return port;
    }
}
