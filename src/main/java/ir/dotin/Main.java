package ir.dotin;

import ir.dotin.files.XMLFile;
import ir.dotin.terminal.Transaction;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("src\\main\\resources\\terminal.xml"));
        document.getDocumentElement().normalize();

        Element root = document.getDocumentElement();
        String terminalId = root.getAttribute("id");
        String terminalType = root.getAttribute("type");
        System.out.println("Terminal id: " + terminalId);
        System.out.println("Terminal type: " + terminalType);

        Node node = document.getElementsByTagName("server").item(0);
        Element server = (Element) node;
        String port = server.getAttribute("port");
        String ip = server.getAttribute("ip");
        System.out.println("Server ip: " + ip);
        System.out.println("port: " + port);

        System.out.println("*************");
        NodeList nodeList = document.getElementsByTagName("transaction");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node1 = nodeList.item(i);
            Element transaction = (Element) node1;
            System.out.println(transaction.getAttribute("id"));
            System.out.println(transaction.getAttribute("type"));
            System.out.println(transaction.getAttribute("amount"));
            System.out.println(transaction.getAttribute("deposit"));
        }

        List<Transaction> transactions = new ArrayList<Transaction>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node _node = nodeList.item(i);
            Element element = (Element) _node;

            String id = element.getAttribute("id");
            String type = element.getAttribute("type");
            String amount = element.getAttribute("amount");
            String _amount = amount.replace(",", "");
            String deposit = element.getAttribute("deposit");

            Transaction transaction = new Transaction(id, type, _amount, deposit);
            transactions.add(transaction);
        }
        System.out.println();

//        System.out.println(transactions);

//        Node node =  document.getElementsByTagName("server").item(0);
//        Node node1 = document.getElementsByTagName("server").item(0);
//        Element element = (Element) node;
//        Element element1 = (Element) node;
//        System.out.println(element.getAttribute("ip"));
//        System.out.println(element1.getAttribute("port"));



    }
}
