//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.18 at 11:33:47 AM CEST 
//


package fr.afcepf.commande;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmdeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmdeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://www.afcepf.fr/commande}clientType"/>
 *         &lt;element name="produits" type="{http://www.afcepf.fr/commande}listeProdType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmdeType", propOrder = {
    "client",
    "produits"
})
public class CmdeType {

    @XmlElement(required = true)
    protected ClientType client;
    @XmlElement(required = true)
    protected ListeProdType produits;
    @XmlAttribute(name = "num")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientType }
     *     
     */
    public ClientType getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType }
     *     
     */
    public void setClient(ClientType value) {
        this.client = value;
    }

    /**
     * Gets the value of the produits property.
     * 
     * @return
     *     possible object is
     *     {@link ListeProdType }
     *     
     */
    public ListeProdType getProduits() {
        return produits;
    }

    /**
     * Sets the value of the produits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListeProdType }
     *     
     */
    public void setProduits(ListeProdType value) {
        this.produits = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNum(BigInteger value) {
        this.num = value;
    }

}
