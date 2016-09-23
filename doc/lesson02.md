# <a href="https://github.com/JavaWebinar/masterjava">Многопоточность. Веб-сервисы. XML. Распределенные приложения</a>.

<a href="https://www.youtube.com/watch?v=eq3KiAH4IBI&ab_channel=IntelliJIDEA">42 IntelliJ IDEA Tips and Tricks</a>

## Разбор HW1:

## Java Microbenchmark JMH (от Алексея Шипилева)
- <a href="http://tutorials.jenkov.com/java-performance/jmh.html">JMH - Java Microbenchmark Harness</a>, <a href="http://java-performance.info/jmh/">Java Performance Tuning Guide</a>
- <a href="https://github.com/artyushov/idea-jmh-plugin">idea-jmh-plugin</a>, <a href="http://stackoverflow.com/questions/37720692/exception-while-trying-to-acquire-a-jmh-lock/#39562747">Exception while trying to acquire a JMH lock</a>

## Формат XML. Работа с XML в Java
- <a href="http://genberm.narod.ru/xml/lections/xml/introduction.html">История создания</a>. <a href="http://www.duct-tape-architect.ru/?p=315">XML формат и технологии</a>
- <a href="http://stackoverflow.com/questions/33746/xml-attribute-vs-xml-element#33757">Attribute vs Element</a>. 
- <a href="http://genberm.narod.ru/xml/schema/schema0/2.7.html">sequence/ choice/ all/ group</a>. <a href="https://jaxb.java.net/tutorial/section_2_2_15-Referring-to-Another-XML-Element.html"> Referring to Another XML Element</a>
- <a href="http://www.vogella.com/tutorials/JavaXML/article.html">Работа с XML в Java</a>.
- <a href="http://www.ibm.com/developerworks/ru/library/x-jaxp/">JAXP: вспомогательный слой над SAX и DOM API</a>
- <a href="https://www.ibm.com/developerworks/ru/library/x-javaxmlvalidapi/">Валидации XML</a>
- StAX: <a href="https://www.ibm.com/developerworks/ru/library/x-stax1/">XMLStreamReader</a>, <a href="https://www.ibm.com/developerworks/ru/library/x-stax2/">XMLEventReader</a>
- XPath: <a href="http://www.ibm.com/developerworks/ru/library/x-javaxpathapi/">Java XPath API</a>
- <a href="https://msdn.microsoft.com/ru-ru/library/ms256086">Примеры XPath</a> 
- <a href="http://www.ibm.com/developerworks/ru/library/x-jaxp2">Преобразование XSLT</a>, <a href="http://stackoverflow.com/questions/3360017/why-does-xslt-output-all-text-by-default">Default XSLT output</a>
- <a href="http://stackoverflow.com/questions/676250/different-ways-of-loading-a-file-as-an-inputstream#676273">Different ways of loading a file as an InputStream</a>
- Справочник:
  - <a href="https://ru.wikipedia.org/wiki/JAXP">JAXP</a>, <a href="https://ru.wikipedia.org/wiki/XML">XML</a>, <a href="https://ru.wikipedia.org/wiki/Document_Object_Model">DOM</a>, <a href="https://ru.wikipedia.org/wiki/SAX">SAX</a>
  - <a href="https://ru.wikipedia.org/wiki/Xerces">Xerces</a>, <a href="https://ru.wikipedia.org/wiki/Xalan">Xalan</a>, <a href="https://ru.wikipedia.org/wiki/XSLT">XSLT</a>, <a href="https://ru.wikipedia.org/wiki/XSL">XSL</a>
  - <a href="https://ru.wikipedia.org/wiki/Java_Architecture_for_XML_Binding">JAXB</a>, <a href="https://en.wikipedia.org/wiki/StAX">StAX</a>  
  - <a href="http://genberm.narod.ru/">Справочник по XML</a>
  - <a href="https://www.w3.org/TR/xslt#built-in-rule">XSL Transformations (XSLT)</a>
  
## Домашнее задание
- Дополнить XML схему 
  - проектами (название, описание)
  - группами (название, тип:REGISTERING/CURRENT/FINISHED), которые принадлежат проекту.
  - участниками, которые могут принадлежать разным группам
- Сделать xml с тестовыми данными.
- Реализовать консольное приложение, которые принимает как параметры имя проекта и путь к xml и генерирует на выходе html файл с таблицей его участников (можно через <a href="http://www.vogella.com/tutorials/JavaXML/article.html#javastax_write">StaxWriter</a>).

#### Optional
- Сделать максимальное количество реализаций на основе всех технологий (без DOM и SAX).