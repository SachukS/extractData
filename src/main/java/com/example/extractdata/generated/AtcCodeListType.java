
package com.example.extractdata.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atc-code-list-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atc-code-list-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atc-code" type="{http://www.drugbank.ca}atc-code-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atc-code-list-type", namespace = "http://www.drugbank.ca", propOrder = {
    "atcCode"
})
public class AtcCodeListType {

    @XmlElement(name = "atc-code", namespace = "http://www.drugbank.ca")
    protected List<AtcCodeType> atcCode;

    /**
     * Gets the value of the atcCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atcCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtcCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtcCodeType }
     * 
     * 
     */
    public List<AtcCodeType> getAtcCode() {
        if (atcCode == null) {
            atcCode = new ArrayList<AtcCodeType>();
        }
        return this.atcCode;
    }

}
