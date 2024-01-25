
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patent-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patent-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pediatric-extension" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patent-type", namespace = "http://www.drugbank.ca", propOrder = {
    "number",
    "country",
    "approved",
    "expires",
    "pediatricExtension"
})
public class PatentType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String number;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String country;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String approved;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String expires;
    @XmlElement(name = "pediatric-extension", namespace = "http://www.drugbank.ca")
    protected boolean pediatricExtension;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproved(String value) {
        this.approved = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpires(String value) {
        this.expires = value;
    }

    /**
     * Gets the value of the pediatricExtension property.
     * 
     */
    public boolean isPediatricExtension() {
        return pediatricExtension;
    }

    /**
     * Sets the value of the pediatricExtension property.
     * 
     */
    public void setPediatricExtension(boolean value) {
        this.pediatricExtension = value;
    }

}
