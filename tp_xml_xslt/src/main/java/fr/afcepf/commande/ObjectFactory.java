//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 12:42:36 PM CEST 
//


package fr.afcepf.commande;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.commande package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Commande_QNAME = new QName("http://www.afcepf.fr/commande", "commande");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.commande
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CmdeType }
     * 
     */
    public CmdeType createCmdeType() {
        return new CmdeType();
    }

    /**
     * Create an instance of {@link ClientType }
     * 
     */
    public ClientType createClientType() {
        return new ClientType();
    }

    /**
     * Create an instance of {@link ListeProdType }
     * 
     */
    public ListeProdType createListeProdType() {
        return new ListeProdType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmdeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.afcepf.fr/commande", name = "commande")
    public JAXBElement<CmdeType> createCommande(CmdeType value) {
        return new JAXBElement<CmdeType>(_Commande_QNAME, CmdeType.class, null, value);
    }

}
