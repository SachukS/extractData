
package com.example.extractdata.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snp-effect-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snp-effect-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="protein-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gene-symbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uniprot-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rs-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allele" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defining-change" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pubmed-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snp-effect-type", namespace = "http://www.drugbank.ca", propOrder = {
    "proteinNameAndGeneSymbolAndUniprotId"
})
public class SnpEffectType {

    @XmlElementRefs({
        @XmlElementRef(name = "protein-name", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gene-symbol", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uniprot-id", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rs-id", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "allele", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "defining-change", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pubmed-id", namespace = "http://www.drugbank.ca", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> proteinNameAndGeneSymbolAndUniprotId;

    /**
     * Gets the value of the proteinNameAndGeneSymbolAndUniprotId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the proteinNameAndGeneSymbolAndUniprotId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProteinNameAndGeneSymbolAndUniprotId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getProteinNameAndGeneSymbolAndUniprotId() {
        if (proteinNameAndGeneSymbolAndUniprotId == null) {
            proteinNameAndGeneSymbolAndUniprotId = new ArrayList<JAXBElement<String>>();
        }
        return this.proteinNameAndGeneSymbolAndUniprotId;
    }

}
