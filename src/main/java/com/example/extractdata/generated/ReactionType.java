
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reaction-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reaction-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="left-element" type="{http://www.drugbank.ca}reaction-element-type"/&gt;
 *         &lt;element name="right-element" type="{http://www.drugbank.ca}reaction-element-type"/&gt;
 *         &lt;element name="enzymes" type="{http://www.drugbank.ca}reaction-enzyme-list-type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reaction-type", namespace = "http://www.drugbank.ca", propOrder = {
    "sequence",
    "leftElement",
    "rightElement",
    "enzymes"
})
public class ReactionType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String sequence;
    @XmlElement(name = "left-element", namespace = "http://www.drugbank.ca", required = true)
    protected ReactionElementType leftElement;
    @XmlElement(name = "right-element", namespace = "http://www.drugbank.ca", required = true)
    protected ReactionElementType rightElement;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ReactionEnzymeListType enzymes;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the leftElement property.
     * 
     * @return
     *     possible object is
     *     {@link ReactionElementType }
     *     
     */
    public ReactionElementType getLeftElement() {
        return leftElement;
    }

    /**
     * Sets the value of the leftElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactionElementType }
     *     
     */
    public void setLeftElement(ReactionElementType value) {
        this.leftElement = value;
    }

    /**
     * Gets the value of the rightElement property.
     * 
     * @return
     *     possible object is
     *     {@link ReactionElementType }
     *     
     */
    public ReactionElementType getRightElement() {
        return rightElement;
    }

    /**
     * Sets the value of the rightElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactionElementType }
     *     
     */
    public void setRightElement(ReactionElementType value) {
        this.rightElement = value;
    }

    /**
     * Gets the value of the enzymes property.
     * 
     * @return
     *     possible object is
     *     {@link ReactionEnzymeListType }
     *     
     */
    public ReactionEnzymeListType getEnzymes() {
        return enzymes;
    }

    /**
     * Sets the value of the enzymes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactionEnzymeListType }
     *     
     */
    public void setEnzymes(ReactionEnzymeListType value) {
        this.enzymes = value;
    }

}
