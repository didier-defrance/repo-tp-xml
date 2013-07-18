package fr.afcepf.atod18.xml.v2_avec_ns;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class TestDomAvecNs {

        static final String JAXP_SCHEMA_LANGUAGE=
        "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
        static final String W3C_XML_SCHEMA= 
        "http://www.w3.org/2001/XMLSchema";
        
    public static void main(String[] args) {
        
       try {
        InputStream in =(InputStream)
              Thread.currentThread().getContextClassLoader()
              .getResourceAsStream("v2_avec_ns/commande.xml"); 
            DocumentBuilderFactory docBuilderFactory=
                     DocumentBuilderFactory.newInstance();
            docBuilderFactory.setNamespaceAware(true);
            docBuilderFactory.setValidating(true);//via dtd ou xsd
            docBuilderFactory.setAttribute(JAXP_SCHEMA_LANGUAGE,
                                W3C_XML_SCHEMA);
            String nsCmde = "http://www.afcepf.fr/commande";
            DocumentBuilder docBuilder =
                docBuilderFactory.newDocumentBuilder();
            
            docBuilder.setErrorHandler(new ErrorHandler(){

            	@Override
				public void error(SAXParseException ex) throws SAXException {
					System.err.println("error:" + ex.getMessage());
					throw ex;
				}

				@Override
				public void fatalError(SAXParseException ex)
						throws SAXException {
					System.err.println("fatal error:" +ex.getMessage());
					throw ex;
				}

				@Override
				public void warning(SAXParseException ex) throws SAXException {
					System.err.println("warning:" + ex.getMessage());
					
				}

				
            	
            });
           
            //Document docXml= docBuilder.parse(in);
            Document docXml= docBuilder.parse("src/main/resources/v2_avec_ns/commande.xml");
            Element balisePrincipale= 
                docXml.getDocumentElement();
            System.out.println(balisePrincipale.getNodeName());
            Element eltClient = (Element)
             docXml.getElementsByTagNameNS(nsCmde,"client").item(0);
            Element eltNomClient = (Element)
             eltClient.getElementsByTagNameNS(nsCmde,"nom").item(0);
            String nom = 
                eltNomClient.getFirstChild().getNodeValue();
            System.out.println("nom client = "+nom);
        } catch (Exception e) {
        e.printStackTrace();
        } 
    }

}
