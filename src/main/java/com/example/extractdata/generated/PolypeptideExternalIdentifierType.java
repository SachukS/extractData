
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for polypeptide-external-identifier-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="polypeptide-external-identifier-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resource" type="{http://www.drugbank.ca}polypeptide-external-identifier-resource-type"/&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "polypeptide-external-identifier-type", namespace = "http://www.drugbank.ca", propOrder = {
    "resource",
    "identifier"
})
public class PolypeptideExternalIdentifierType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected PolypeptideExternalIdentifierResourceType resource;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String identifier;

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link PolypeptideExternalIdentifierResourceType }
     *     
     */
    public PolypeptideExternalIdentifierResourceType getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypeptideExternalIdentifierResourceType }
     *     
     */
    public void setResource(PolypeptideExternalIdentifierResourceType value) {
        this.resource = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
