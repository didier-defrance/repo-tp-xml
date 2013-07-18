package fr.afcepf.atod18.xml.v2_avec_ns;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import fr.afcepf.commande.CmdeType;
import fr.afcepf.produit.Produit;

public class TestJaxb2 {

    public static void main(String[] args) {
       try {
        JAXBContext jctx = 
           JAXBContext.newInstance("fr.afcepf.commande");
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
        
        Produit p1 = new Produit();
        p1.setLabel("bd 1"); 
        p1.setRef(BigInteger.valueOf(123));
        p1.setCategorie("livre");
        p1.setPrix(BigDecimal.valueOf(15.5));
        
        JAXBElement<Produit> produitElt = 
        	(new fr.afcepf.produit.ObjectFactory())
        	        .createProduit(p1);
        Marshaller m = jctx.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, 
        		      Boolean.TRUE);
        m.marshal(produitElt, new File("p1.xml"));
        
    } catch (Exception e) {
            e.printStackTrace();
    }
    }

}
