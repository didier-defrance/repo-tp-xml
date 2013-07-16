package fr.afcepf.atod18.xml.v2_avec_ns;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import fr.afcpef.commande.CmdeType;

public class TestJaxb2 {

    public static void main(String[] args) {
       try {
        JAXBContext jctx = 
           JAXBContext.newInstance("fr.afcpef.commande");
        Unmarshaller um = jctx.createUnmarshaller();
        InputStream in =(InputStream)
        Thread.currentThread().getContextClassLoader()
        .getResourceAsStream("v2_avec_ns/commande.xml"); 
        JAXBElement<CmdeType> eltCmde = 
            (JAXBElement<CmdeType>)um.unmarshal(in);
        CmdeType cmde = eltCmde.getValue();
        System.out.println("numero cmde:"+cmde.getNum());
        System.out.println("nom client:"+
                cmde.getClient().getNom());
    } catch (Exception e) {
            e.printStackTrace();
    }
    }

}
