
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drug-interaction-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drug-interaction-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drugbank-id" type="{http://www.drugbank.ca}drugbank-drug-salt-id-type"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drug-interaction-type", namespace = "http://www.drugbank.ca", propOrder = {
    "drugbankId",
    "name",
    "description"
})
public class DrugInteractionType {

    @XmlElement(name = "drugbank-id", namespace = "http://www.drugbank.ca", required = true)
    protected DrugbankDrugSaltIdType drugbankId;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String description;

    /**
     * Gets the value of the drugbankId property.
     * 
     * @return
     *     possible object is
     *     {@link DrugbankDrugSaltIdType }
     *     
     */
    public DrugbankDrugSaltIdType getDrugbankId() {
        return drugbankId;
    }

    /**
     * Sets the value of the drugbankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugbankDrugSaltIdType }
     *     
     */
    public void setDrugbankId(DrugbankDrugSaltIdType value) {
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
