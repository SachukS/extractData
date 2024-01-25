
package com.example.extractdata.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salt-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salt-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drugbank-id" type="{http://www.drugbank.ca}drugbank-drug-salt-id-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unii" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cas-number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inchikey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="average-mass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="monoisotopic-mass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salt-type", namespace = "http://www.drugbank.ca", propOrder = {
    "drugbankId",
    "name",
    "unii",
    "casNumber",
    "inchikey",
    "averageMass",
    "monoisotopicMass"
})
public class SaltType {

    @XmlElement(name = "drugbank-id", namespace = "http://www.drugbank.ca")
    protected List<DrugbankDrugSaltIdType> drugbankId;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String unii;
    @XmlElement(name = "cas-number", namespace = "http://www.drugbank.ca", required = true)
    protected String casNumber;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String inchikey;
    @XmlElement(name = "average-mass", namespace = "http://www.drugbank.ca")
    protected Float averageMass;
    @XmlElement(name = "monoisotopic-mass", namespace = "http://www.drugbank.ca")
    protected Float monoisotopicMass;

    /**
     * Gets the value of the drugbankId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the drugbankId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugbankId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugbankDrugSaltIdType }
     * 
     * 
     */
    public List<DrugbankDrugSaltIdType> getDrugbankId() {
        if (drugbankId == null) {
            drugbankId = new ArrayList<DrugbankDrugSaltIdType>();
        }
        return this.drugbankId;
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
     * Gets the value of the unii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnii() {
        return unii;
    }

    /**
     * Sets the value of the unii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnii(String value) {
        this.unii = value;
    }

    /**
     * Gets the value of the casNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasNumber() {
        return casNumber;
    }

    /**
     * Sets the value of the casNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    /**
     * Gets the value of the inchikey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInchikey() {
        return inchikey;
    }

    /**
     * Sets the value of the inchikey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInchikey(String value) {
        this.inchikey = value;
    }

    /**
     * Gets the value of the averageMass property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageMass() {
        return averageMass;
    }

    /**
     * Sets the value of the averageMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageMass(Float value) {
        this.averageMass = value;
    }

    /**
     * Gets the value of the monoisotopicMass property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMonoisotopicMass() {
        return monoisotopicMass;
    }

    /**
     * Sets the value of the monoisotopicMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMonoisotopicMass(Float value) {
        this.monoisotopicMass = value;
    }

}
