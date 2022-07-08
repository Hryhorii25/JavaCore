package МережаJavaXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

//XHTML (англ. Extensible Hypertext Markup Language, укр. Розширювана мова розмітки гіпертексту) — мова розмітки,
// що має таку саму виразну силу як і HTML але відповідає синтаксичним правилам XML.

///В даній темі розглянуто роботу з xhtml файлами.
public class Xml1Begin {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        ///Даний блок коду це  програмний доступ до xml файла з яким можна працювати програмно тобто змінювати вміс xml файлу
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("1.xml")); // document програмний XML файл з яким уже можна працювати через методи
     ///



        ////Блок коду виводу усіх тегів з XML файлу
        Element element = document.getDocumentElement();
        printElements(element.getChildNodes());


        }

        private static void printElements(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element)
               System.out.println(((Element)nodeList.item(i)).getTagName() );
            if (nodeList.item(i).hasChildNodes()){
                printElements(nodeList.item(i).getChildNodes());
            }
        }
    };
}



//System.out.println(nodeList.item(i).getAttributes()); Виводить атриути




