# Онлайн проекта  <a href="https://github.com/JavaWebinar/masterjava">Masterjava</a>.

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW5

## Миграция DB.
  - <a href="http://www.liquibase.org">Liquibase</a> (<a href="http://www.dropwizard.io/0.7.1/docs/manual/migrations.html">Dropwizard Migrations</a>)
  - <a href="https://flywaydb.org/">Flyway</a> (<a href="http://stackoverflow.com/questions/37385823/liquibase-vs-flyway-which-one-to-use">Liquibase vs FLyway which one to use?</a>)
  - <a href="http://www.mybatis.org/migrations/">MyBatis Migrations</a>

- <a href="https://habrahabr.ru/post/314048/">Техника безопасности при работе с PostgreSQL</a>
- <a href="https://docs.google.com/document/d/1ul1jH7sccyQVqpjItdFo_OQI9YxJV3V5hxqI7xa-YPM">DB Migration rules</a>

## Масштабирование DB

## Веб-сервисы
- <a href="http://www.4stud.info/networking/web-services.html">Веб-сервисы</a>. <a href="https://ru.wikipedia.org/wiki/SOAP">SOAP</a>.
- <a href="http://uamaxuajava.blogspot.ru/2015/11/soap.html">SOAP Шпаргалка</a>
- <a href="https://ru.wikipedia.org/wiki/WSDL">WSDL</a>. <a href="https://en.wikipedia.org/wiki/Java_API_for_RESTful_Web_Services">JAX-RS</a>, <a href="https://jersey.java.net/documentation/latest/wadl.html">WADL</a>

#### REST vs SOAP
- <a href="https://habrahabr.ru/post/131343/">REST vs SOAP. Часть 1</a>
- <a href="https://habrahabr.ru/post/131343/">Часть 2. Как проще и эффективнее организовать общение платформ</a>
- <a href="http://static.ccm2.net/ccm.net/faq/images/0-pdpEtRZG-web.png">Web Services Standards</a>. 
- Примеры:
  - <a href="http://unixforum.org/index.php?showtopic=131451">Полезные веб-сервисы.</a>
  - <a href="http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx">Веб-сервис Центробанка, для получения ежедневных данных.</a>
  - <a href="http://api.yandex.ru/speller/doc/dg/concepts/api-overview.xml">Яндекса проверки правописания.</a>
  - <a href="https://www.flightstats.com/developers/bin/view/Web+Services/WSDL">Ряд веб сервисов авиастатистики, для мониторинга полетов, сведений о погоде, и.т.п.</a>

#### Java реализация. WSDL
- <a href="http://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services">Java API for XML Web Services</a>
- <a href="http://stackoverflow.com/a/3314458/548473">JAX-RPC vs JAX-WS</a>. <a href="http://stackoverflow.com/questions/11566609/difference-between-jax-ws-axis2-and-cxf">JAX-WS, Axis2 and CXF</a>
- <a href="http://stackoverflow.com/questions/11566609/difference-between-jax-ws-axis2-cxf">Difference between Jax-ws, axis2, cxf</a>
- Деплой и тестирование через <a href="http://www.soapui.org/">SoapUI</a>.
- <a href="http://www.ibm.com/developerworks/webservices/library/ws-whichwsdl/" target="_blank">Стили WSDL</a>

----------------
## Домашнее задание
- Реализовать `MailSender` с конфигурированием параметров (например чз yandex)  
 - <a href="https://commons.apache.org/proper/commons-email">Commons Email</a>
- Сохранят результат отправки писем в DB
- Протестировать отправку почты через SoapUI
