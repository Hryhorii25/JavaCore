package МережаJavaXML;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//Створенн XML файлу через  SAX підхід
public class XML4СтворенняXMLSAX {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory  factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("temp2.xml"));
        writer.writeStartDocument();
        writer.writeStartElement("root");
        writer.writeStartElement("root");
    writer.writeAttribute("size", String.valueOf(20));
    writer.writeCharacters("TimesNewRoman");
    writer.writeEndElement();
    writer.writeEndElement();
    writer.writeEndDocument();
    }

}
