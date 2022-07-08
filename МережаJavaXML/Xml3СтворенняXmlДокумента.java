package МережаJavaXML;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


//У даній програмі показано як програмно створювати XML файл
public class Xml3СтворенняXmlДокумента {
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, TransformerException {
      //Блок створення за допомогою якого можна задати теги атрибути структуру xml файла
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        Element font = document.createElement("font");
        Text text = document.createTextNode("TimesNewRoman");
        document.appendChild(root);
        root.appendChild(font);
        font.appendChild(text);
        font.setAttribute("size","20");

        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.transform(new DOMSource(document),new StreamResult(new FileOutputStream("temp.xml")));

    }
}
