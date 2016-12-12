# Онлайн проекта  <a href="https://github.com/JavaWebinar/masterjava">Masterjava</a>.

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW5

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/drive/folders/0B9Ye2auQ_NsFNkV5d1pkb21XeG8">Реализация `MailSender`</a>
- <a href="https://yandex.ru/blog/company/66296">List-Unsubcribe</a>
- <a href="https://aws.amazon.com/ru/ses/">Amazon Simple Email Service</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFT3VocUpKSzZlRTg">Сохранение результатов отправки в DB</a>
- <a href="http://stackoverflow.com/a/25322753/548473">Resolving Maven circular dependencies</a>
- <a href="http://maven.apache.org/guides/mini/guide-attached-tests.html">Guide to using attached tests</a>


## <a href="https://ru.wikipedia.org/wiki/SOAP">SOAP</a>
- <a href="http://www.ibm.com/developerworks/webservices/library/ws-whichwsdl/">Стили WSDL</a>
- Кастомизация WSDL

### <a href="https://en.wikipedia.org/wiki/Apache_CXF">CXF</a>
- <a href="https://youtrack.jetbrains.com/issue/IDEA-149473">IDEA bug of CXF integration</a>
- <a href="http://stackoverflow.com/a/23012746/548473">accessExternalSchema property restriction</a>
- <a href="http://cxf.apache.org/docs/servlet-transport.html#ServletTransport-UsingtheservlettransportwithoutSpring">Using the servlet transport without Spring</a>

### <a href="https://www.mkyong.com/tutorials/jax-ws-tutorials/">JAX-WS + Tomcat</a> 
- <a href="http://stackoverflow.com/a/16254037/548473">Metro = JAX-WS RI + WSIT</a>, <a href="https://wsit.java.net/">Web Services Interoperability Technologies (WSIT)</a>
- <a href="https://www.mkyong.com/webservices/jax-ws/deploy-jax-ws-web-services-on-tomcat/">Deploy JAX-WS web services on Tomcat</a>
- <a href="http://ics.upjs.sk/~novotnyr/blog/2068/deploying-jax-ws-services-on-java-7-and-tomcat-7">Deploying JAX-WS Services without web.xml</a>

### Создание клиента почтового сервиса

- <a href="http://stackoverflow.com/questions/5158537/jaxws-how-to-change-the-endpoint-address">Dynamically Change a Web Service Endpoint URL</a>

----------------

## Домашнее задание
- Расшарить wsdl для всех модей в `\apps\masterjava\config\wsdl`   
- Реализовать отправку почты каждому участнику, используя `MailService` (перенести из модуля `test`) с `subject` и `body`.
 
#### Optional
- Сделать простой интерфейс для отправки почты пользователям из модуля `web`
