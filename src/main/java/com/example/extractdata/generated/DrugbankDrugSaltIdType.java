
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * The DrugBank ID is used to uniquely identify a drug or salt entry. There is a primary ID and several secondary IDs that come from older ID formats or merged entries.
 * 
 * <p>Java class for drugbank-drug-salt-id-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drugbank-drug-salt-id-type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.drugbank.ca&gt;drugbank-drug-salt-id-value"&gt;
 *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drugbank-drug-salt-id-type", namespace = "http://www.drugbank.ca", propOrder = {
    "value"
})
public class DrugbankDrugSaltIdType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "primary")
    protected Boolean primary;

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
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrimary() {
        if (primary == null) {
            return false;
        } else {
            return primary;
        }
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

}
