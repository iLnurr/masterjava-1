# <a href="https://github.com/JavaWebinar/masterjava">Многопоточность. Веб-сервисы. XML. Распределенные приложения</a>.

## Разбор Домашнего Задания-9:

## Формат XML. Работа с XML в Java
- <a href="http://genberm.narod.ru/xml/lections/xml/introduction.html">История создания</a>. <a href="http://www.duct-tape-architect.ru/?p=315">XML формат и технологии</a>
- <a href="http://stackoverflow.com/questions/33746/xml-attribute-vs-xml-element#33757">Attribute vs Element</a>. 
- <a href="http://genberm.narod.ru/xml/schema/schema0/2.7.html">sequence/ choice/ all/ group</a>. <a href="https://jaxb.java.net/tutorial/section_2_2_15-Referring-to-Another-XML-Element.html"> Referring to Another XML Element</a>
- <a href="http://www.vogella.com/tutorials/JavaXML/article.html">Работа с XML в Java</a>.
- <a href="http://www.ibm.com/developerworks/ru/library/x-jaxp/">JAXP: вспомогательный слой над SAX и DOM API</a>
- <a href="https://www.ibm.com/developerworks/ru/library/x-javaxmlvalidapi/">Валидации XML</a>
- StAX: <a href="https://www.ibm.com/developerworks/ru/library/x-stax1/">XMLStreamReader</a>, <a href="https://www.ibm.com/developerworks/ru/library/x-stax2/">XMLEventReader</a>
- XPath: <a href="http://www.ibm.com/developerworks/ru/library/x-javaxpathapi/">Java XPath API</a> 
- <a href="http://www.ibm.com/developerworks/ru/library/x-jaxp2">Преобразование XSLT</a>
- Справочник:
  - <a href="https://ru.wikipedia.org/wiki/JAXP">JAXP</a>, <a href="https://ru.wikipedia.org/wiki/XML">XML</a>, <a href="https://ru.wikipedia.org/wiki/Document_Object_Model">DOM</a>, <a href="https://ru.wikipedia.org/wiki/SAX">SAX</a>
  - <a href="https://ru.wikipedia.org/wiki/Xerces">Xerces</a>, <a href="https://ru.wikipedia.org/wiki/Xalan">Xalan</a>, <a href="https://ru.wikipedia.org/wiki/XSLT">XSLT</a>, <a href="https://ru.wikipedia.org/wiki/XSL">XSL</a>
  - <a href="https://ru.wikipedia.org/wiki/Java_Architecture_for_XML_Binding">JAXB</a>, <a href="https://en.wikipedia.org/wiki/StAX">StAX</a>  
  - <a href="http://genberm.narod.ru/">Справочник по XML</a>
  
## Домашнее задание
- Дополнить XML схему 
  - проектами (название, описание)
  - группами (название, тип:REGISTERING/CURRENT/FINISHED), которые принадлежат проекту.
  - участниками, которые могут принадлежать разным группам
- Сделать xml с тестовыми данными.
- Реализовать консольное приложение, которые принимает как параметры имя проекта и путь к xml и генерирует на выходе html файл с таблицей его участников (можно через <a href="http://www.vogella.com/tutorials/JavaXML/article.html#javastax_write">StaxWriter</a>).

## Optional
- Сделать максимальное количество реализаций на основе всех технологий (без DOM и SAX).
