package fr.afcepf.atod18.xml.v1_sans_ns;

import java.io.FileInputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TransformApp {

    
    public static void main(String[] args) {
        try{
            String chemin="C:\\Users\\stagiaire\\git\\repo-tp-xml\\tp_xml_xslt\\src\\main\\resources\\v1_sans_ns\\";
            String ficSource=chemin+"commande.xml";
            String ficXslt=chemin+"commande.xslt";
            String ficRes=chemin+"commande.html";
            TransformerFactory tFactory =TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(
            new StreamSource( new FileInputStream(ficXslt)));
            transformer.transform(new StreamSource(new FileInputStream(ficSource)),
            new StreamResult(ficRes));
            
        } catch(Exception ex) { 
            ex.printStackTrace();
         }
  
    }

}
