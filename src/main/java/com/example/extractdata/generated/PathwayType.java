
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pathway-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pathway-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="smpdb-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="drugs" type="{http://www.drugbank.ca}pathway-drug-list-type"/&gt;
 *         &lt;element name="enzymes" type="{http://www.drugbank.ca}pathway-enzyme-list-type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pathway-type", namespace = "http://www.drugbank.ca", propOrder = {
    "smpdbId",
    "name",
    "category",
    "drugs",
    "enzymes"
})
public class PathwayType {

    @XmlElement(name = "smpdb-id", namespace = "http://www.drugbank.ca", required = true)
    protected String smpdbId;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String category;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PathwayDrugListType drugs;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PathwayEnzymeListType enzymes;

    /**
     * Gets the value of the smpdbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmpdbId() {
        return smpdbId;
    }

    /**
     * Sets the value of the smpdbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmpdbId(String value) {
        this.smpdbId = value;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the drugs property.
     * 
     * @return
     *     possible object is
     *     {@link PathwayDrugListType }
     *     
     */
    public PathwayDrugListType getDrugs() {
        return drugs;
    }

    /**
     * Sets the value of the drugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathwayDrugListType }
     *     
     */
    public void setDrugs(PathwayDrugListType value) {
        this.drugs = value;
    }

    /**
     * Gets the value of the enzymes property.
     * 
     * @return
     *     possible object is
     *     {@link PathwayEnzymeListType }
     *     
     */
    public PathwayEnzymeListType getEnzymes() {
        return enzymes;
    }

    /**
     * Sets the value of the enzymes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathwayEnzymeListType }
     *     
     */
    public void setEnzymes(PathwayEnzymeListType value) {
        this.enzymes = value;
    }

}
