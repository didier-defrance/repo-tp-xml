package fr.afcepf.atod18.xml.v1_sans_ns;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TestDom {

    
    public static void main(String[] args) {
        
       try {
        InputStream in =(InputStream)
              Thread.currentThread().getContextClassLoader()
              .getResourceAsStream("v1_sans_ns/commande.xml"); 
            DocumentBuilderFactory docBuilderFactory=
                     DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder =
                docBuilderFactory.newDocumentBuilder();
            Document docXml= docBuilder.parse(in);
            Element balisePrincipale= 
                docXml.getDocumentElement();
            System.out.println(balisePrincipale.getNodeName());
            Element eltClient = (Element)
               docXml.getElementsByTagName("client").item(0);
            Element eltNomClient = (Element)
             eltClient.getElementsByTagName("nom").item(0);
            String nom = 
                eltNomClient.getFirstChild().getNodeValue();
            System.out.println("nom client = "+nom);
        } catch (Exception e) {
        e.printStackTrace();
        } 
    }

}
