
package com.example.extractdata.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This is the root element type for the DrugBank database schema.
 * 
 * <p>Java class for drugbank-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drugbank-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drug" type="{http://www.drugbank.ca}drug-type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="exported-on" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drugbank-type", namespace = "http://www.drugbank.ca", propOrder = {
    "drug"
})
public class DrugbankType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected List<DrugType> drug;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "exported-on", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exportedOn;

    /**
     * Gets the value of the drug property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the drug property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrug().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugType }
     * 
     * 
     */
    public List<DrugType> getDrug() {
        if (drug == null) {
            drug = new ArrayList<DrugType>();
        }
        return this.drug;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the exportedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportedOn() {
        return exportedOn;
    }

    /**
     * Sets the value of the exportedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportedOn(XMLGregorianCalendar value) {
        this.exportedOn = value;
    }

}
