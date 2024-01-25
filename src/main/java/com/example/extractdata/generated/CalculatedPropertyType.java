
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculated-property-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculated-property-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kind" type="{http://www.drugbank.ca}calculated-property-kind-type"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source" type="{http://www.drugbank.ca}calculated-property-source-type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated-property-type", namespace = "http://www.drugbank.ca", propOrder = {
    "kind",
    "value",
    "source"
})
public class CalculatedPropertyType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected CalculatedPropertyKindType kind;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String value;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected CalculatedPropertySourceType source;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedPropertyKindType }
     *     
     */
    public CalculatedPropertyKindType getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedPropertyKindType }
     *     
     */
    public void setKind(CalculatedPropertyKindType value) {
        this.kind = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedPropertySourceType }
     *     
     */
    public CalculatedPropertySourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedPropertySourceType }
     *     
     */
    public void setSource(CalculatedPropertySourceType value) {
        this.source = value;
    }

}
