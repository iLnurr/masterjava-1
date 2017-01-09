# Онлайн проекта  <a href="https://github.com/JavaWebinar/masterjava">Masterjava</a>.

Fix:
- Fix WSDL Schema  
- <a href="http://stackoverflow.com/a/10601916/548473">Fix thread safe JAX-WS client call</a>

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW8

---------------------

##  Message Context. Access to Message Context
- <a href="https://jax-ws.java.net/articles/MessageContext.html">Message Context in JAX-WS</a>
- <a href="http://www.mkyong.com/webservices/jax-ws/application-authentication-with-jax-ws/">Application Authentication with JAX-WS</a>
  - <a href="http://examples.javacodegeeks.com/enterprise-java/jws/container-authentication-with-jax-ws/">Container Authentication</a>

#### Асинхронный вызов через <a href="https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-annotations-example/#1_8">@OneWay </a>

## JAX-WS Handlers

- <a href="https://jax-ws.java.net/articles/handlers_introduction.html">Handlers in JAX-WS</a>
  - <a href="https://www.mkyong.com/webservices/jax-ws/jax-ws-soap-handler-in-server-side/">SOAP handler sample</a>
  - <a href="http://www.javaworld.com/article/2077679/soa/get-a-handle-on-the-jax-ws-api-s-handler-framework.html">Message Context</a>  
  - Логирование SOAP на стороне клиента и сервера
  

## Домашнее задание
  - Сделать Handler статистики трафика веб-сервиса
  - Сделать авторизацию в `mailService` через `SoapServerSecurityHandler` 

#### Optional
  - Вынести уровень логирования веб-сервисов и креденшелы авторизации в конфигурацию  
    