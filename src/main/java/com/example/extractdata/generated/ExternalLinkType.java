
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for external-link-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="external-link-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resource" type="{http://www.drugbank.ca}external-link-resource-type"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "external-link-type", namespace = "http://www.drugbank.ca", propOrder = {
    "resource",
    "url"
})
public class ExternalLinkType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalLinkResourceType resource;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String url;

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalLinkResourceType }
     *     
     */
    public ExternalLinkResourceType getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalLinkResourceType }
     *     
     */
    public void setResource(ExternalLinkResourceType value) {
        this.resource = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
