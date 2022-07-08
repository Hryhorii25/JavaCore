package МережаJavaXML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

//SAX це метод роботи з xml файлом через JAVA головна особливість якого що xml файл загружається
// в програму частинами а не зразу повністю за рахунок цього даний метод роботи з xml швидший
public class Xml2SaxПідхід {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {



       //Блок коду для доступу до xml файлу через SAX
        DefaultHandler handler = new  DefaultHandler(){
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                super.startElement(uri, localName, qName, attributes);
            }
            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                String str = "";
                for (int i = 0; i<length;i++){
                    str+= ch[start+i];
                }
                System.out.println(str);
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("1.xml"),handler);

    }
}
