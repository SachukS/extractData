
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labeller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ndc-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ndc-product-code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dpd-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ema-product-code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ema-ma-number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="started-marketing-on" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ended-marketing-on" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dosage-form" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="strength" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fda-application-number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="generic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="over-the-counter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="country" type="{http://www.drugbank.ca}product-country-type"/&gt;
 *         &lt;element name="source" type="{http://www.drugbank.ca}product-source-type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product-type", namespace = "http://www.drugbank.ca", propOrder = {
    "name",
    "labeller",
    "ndcId",
    "ndcProductCode",
    "dpdId",
    "emaProductCode",
    "emaMaNumber",
    "startedMarketingOn",
    "endedMarketingOn",
    "dosageForm",
    "strength",
    "route",
    "fdaApplicationNumber",
    "generic",
    "overTheCounter",
    "approved",
    "country",
    "source"
})
public class ProductType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String labeller;
    @XmlElement(name = "ndc-id", namespace = "http://www.drugbank.ca", required = true)
    protected String ndcId;
    @XmlElement(name = "ndc-product-code", namespace = "http://www.drugbank.ca", required = true)
    protected String ndcProductCode;
    @XmlElement(name = "dpd-id", namespace = "http://www.drugbank.ca", required = true, nillable = true)
    protected String dpdId;
    @XmlElement(name = "ema-product-code", namespace = "http://www.drugbank.ca", required = true, nillable = true)
    protected String emaProductCode;
    @XmlElement(name = "ema-ma-number", namespace = "http://www.drugbank.ca", required = true, nillable = true)
    protected String emaMaNumber;
    @XmlElement(name = "started-marketing-on", namespace = "http://www.drugbank.ca", required = true)
    protected String startedMarketingOn;
    @XmlElement(name = "ended-marketing-on", namespace = "http://www.drugbank.ca", required = true)
    protected String endedMarketingOn;
    @XmlElement(name = "dosage-form", namespace = "http://www.drugbank.ca", required = true)
    protected String dosageForm;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String strength;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String route;
    @XmlElement(name = "fda-application-number", namespace = "http://www.drugbank.ca", required = true)
    protected String fdaApplicationNumber;
    @XmlElement(namespace = "http://www.drugbank.ca")
    protected boolean generic;
    @XmlElement(name = "over-the-counter", namespace = "http://www.drugbank.ca")
    protected boolean overTheCounter;
    @XmlElement(namespace = "http://www.drugbank.ca")
    protected boolean approved;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected ProductCountryType country;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected ProductSourceType source;

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
     * Gets the value of the labeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeller() {
        return labeller;
    }

    /**
     * Sets the value of the labeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeller(String value) {
        this.labeller = value;
    }

    /**
     * Gets the value of the ndcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcId() {
        return ndcId;
    }

    /**
     * Sets the value of the ndcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcId(String value) {
        this.ndcId = value;
    }

    /**
     * Gets the value of the ndcProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcProductCode() {
        return ndcProductCode;
    }

    /**
     * Sets the value of the ndcProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcProductCode(String value) {
        this.ndcProductCode = value;
    }

    /**
     * Gets the value of the dpdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpdId() {
        return dpdId;
    }

    /**
     * Sets the value of the dpdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpdId(String value) {
        this.dpdId = value;
    }

    /**
     * Gets the value of the emaProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmaProductCode() {
        return emaProductCode;
    }

    /**
     * Sets the value of the emaProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmaProductCode(String value) {
        this.emaProductCode = value;
    }

    /**
     * Gets the value of the emaMaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmaMaNumber() {
        return emaMaNumber;
    }

    /**
     * Sets the value of the emaMaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmaMaNumber(String value) {
        this.emaMaNumber = value;
    }

    /**
     * Gets the value of the startedMarketingOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartedMarketingOn() {
        return startedMarketingOn;
    }

    /**
     * Sets the value of the startedMarketingOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartedMarketingOn(String value) {
        this.startedMarketingOn = value;
    }

    /**
     * Gets the value of the endedMarketingOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndedMarketingOn() {
        return endedMarketingOn;
    }

    /**
     * Sets the value of the endedMarketingOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndedMarketingOn(String value) {
        this.endedMarketingOn = value;
    }

    /**
     * Gets the value of the dosageForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageForm() {
        return dosageForm;
    }

    /**
     * Sets the value of the dosageForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageForm(String value) {
        this.dosageForm = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrength(String value) {
        this.strength = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the fdaApplicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdaApplicationNumber() {
        return fdaApplicationNumber;
    }

    /**
     * Sets the value of the fdaApplicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdaApplicationNumber(String value) {
        this.fdaApplicationNumber = value;
    }

    /**
     * Gets the value of the generic property.
     * 
     */
    public boolean isGeneric() {
        return generic;
    }

    /**
     * Sets the value of the generic property.
     * 
     */
    public void setGeneric(boolean value) {
        this.generic = value;
    }

    /**
     * Gets the value of the overTheCounter property.
     * 
     */
    public boolean isOverTheCounter() {
        return overTheCounter;
    }

    /**
     * Sets the value of the overTheCounter property.
     * 
     */
    public void setOverTheCounter(boolean value) {
        this.overTheCounter = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCountryType }
     *     
     */
    public ProductCountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCountryType }
     *     
     */
    public void setCountry(ProductCountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSourceType }
     *     
     */
    public ProductSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSourceType }
     *     
     */
    public void setSource(ProductSourceType value) {
        this.source = value;
    }

}
