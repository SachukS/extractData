
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reaction-enzyme-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reaction-enzyme-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drugbank-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uniprot-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reaction-enzyme-type", namespace = "http://www.drugbank.ca", propOrder = {
    "drugbankId",
    "name",
    "uniprotId"
})
public class ReactionEnzymeType {

    @XmlElement(name = "drugbank-id", namespace = "http://www.drugbank.ca", required = true)
    protected String drugbankId;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(name = "uniprot-id", namespace = "http://www.drugbank.ca", required = true)
    protected String uniprotId;

    /**
     * Gets the value of the drugbankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugbankId() {
        return drugbankId;
    }

    /**
     * Sets the value of the drugbankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugbankId(String value) {
        this.drugbankId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the uniprotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniprotId() {
        return uniprotId;
    }

    /**
     * Sets the value of the uniprotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniprotId(String value) {
        this.uniprotId = value;
    }

}
