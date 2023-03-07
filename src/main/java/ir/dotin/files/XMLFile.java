package ir.dotin.files;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLFile {
    private File file;

    public XMLFile(File file) {
        this.file = file;
    }

    private Document instantiateXMLFile(File file) throws IOException, SAXException, ParserConfigurationException {
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder builder = factory.newDocumentBuilder();
       Document document = builder.parse(file);
       document.getDocumentElement().normalize();
       return document;
    }

//    public NodeList readXMLFile(File file) throws IOException, SAXException {
//
//    }


    public File getFile() {
        return file;
    }
}
