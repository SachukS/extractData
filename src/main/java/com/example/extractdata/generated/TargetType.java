
package com.example.extractdata.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for target-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="target-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.drugbank.ca}interactant-group"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "target-type", namespace = "http://www.drugbank.ca", propOrder = {
    "id",
    "name",
    "organism",
    "actions",
    "references",
    "knownAction",
    "polypeptide"
})
public class TargetType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String id;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String organism;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ActionListType actions;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ReferenceListType references;
    @XmlElement(name = "known-action", namespace = "http://www.drugbank.ca", required = true)
    @XmlSchemaType(name = "string")
    protected KnownActionType knownAction;
    @XmlElement(namespace = "http://www.drugbank.ca")
    protected List<PolypeptideType> polypeptide;
    @XmlAttribute(name = "position")
    protected BigInteger position;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the organism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganism() {
        return organism;
    }

    /**
     * Sets the value of the organism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganism(String value) {
        this.organism = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListType }
     *     
     */
    public ActionListType getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListType }
     *     
     */
    public void setActions(ActionListType value) {
        this.actions = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceListType }
     *     
     */
    public ReferenceListType getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceListType }
     *     
     */
    public void setReferences(ReferenceListType value) {
        this.references = value;
    }

    /**
     * Gets the value of the knownAction property.
     * 
     * @return
     *     possible object is
     *     {@link KnownActionType }
     *     
     */
    public KnownActionType getKnownAction() {
        return knownAction;
    }

    /**
     * Sets the value of the knownAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownActionType }
     *     
     */
    public void setKnownAction(KnownActionType value) {
        this.knownAction = value;
    }

    /**
     * Gets the value of the polypeptide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the polypeptide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolypeptide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolypeptideType }
     * 
     * 
     */
    public List<PolypeptideType> getPolypeptide() {
        if (polypeptide == null) {
            polypeptide = new ArrayList<PolypeptideType>();
        }
        return this.polypeptide;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

}
