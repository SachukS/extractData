
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for polypeptide-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="polypeptide-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="general-function" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="specific-function" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gene-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cellular-location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transmembrane-regions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signal-regions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="theoretical-pi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="molecular-weight" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chromosome-location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organism"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="ncbi-taxonomy-id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="external-identifiers" type="{http://www.drugbank.ca}polypeptide-external-identifier-list-type"/&gt;
 *         &lt;element name="synonyms" type="{http://www.drugbank.ca}polypeptide-synonym-list-type"/&gt;
 *         &lt;element name="amino-acid-sequence" type="{http://www.drugbank.ca}sequence-type"/&gt;
 *         &lt;element name="gene-sequence" type="{http://www.drugbank.ca}sequence-type"/&gt;
 *         &lt;element name="pfams" type="{http://www.drugbank.ca}pfam-list-type"/&gt;
 *         &lt;element name="go-classifiers" type="{http://www.drugbank.ca}go-classifier-list-type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "polypeptide-type", namespace = "http://www.drugbank.ca", propOrder = {
    "name",
    "generalFunction",
    "specificFunction",
    "geneName",
    "locus",
    "cellularLocation",
    "transmembraneRegions",
    "signalRegions",
    "theoreticalPi",
    "molecularWeight",
    "chromosomeLocation",
    "organism",
    "externalIdentifiers",
    "synonyms",
    "aminoAcidSequence",
    "geneSequence",
    "pfams",
    "goClassifiers"
})
public class PolypeptideType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(name = "general-function", namespace = "http://www.drugbank.ca", required = true)
    protected String generalFunction;
    @XmlElement(name = "specific-function", namespace = "http://www.drugbank.ca", required = true)
    protected String specificFunction;
    @XmlElement(name = "gene-name", namespace = "http://www.drugbank.ca", required = true)
    protected String geneName;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String locus;
    @XmlElement(name = "cellular-location", namespace = "http://www.drugbank.ca", required = true)
    protected String cellularLocation;
    @XmlElement(name = "transmembrane-regions", namespace = "http://www.drugbank.ca", required = true)
    protected String transmembraneRegions;
    @XmlElement(name = "signal-regions", namespace = "http://www.drugbank.ca", required = true)
    protected String signalRegions;
    @XmlElement(name = "theoretical-pi", namespace = "http://www.drugbank.ca", required = true)
    protected String theoreticalPi;
    @XmlElement(name = "molecular-weight", namespace = "http://www.drugbank.ca", required = true)
    protected String molecularWeight;
    @XmlElement(name = "chromosome-location", namespace = "http://www.drugbank.ca", required = true)
    protected String chromosomeLocation;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PolypeptideType.Organism organism;
    @XmlElement(name = "external-identifiers", namespace = "http://www.drugbank.ca", required = true)
    protected PolypeptideExternalIdentifierListType externalIdentifiers;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PolypeptideSynonymListType synonyms;
    @XmlElement(name = "amino-acid-sequence", namespace = "http://www.drugbank.ca", required = true)
    protected SequenceType aminoAcidSequence;
    @XmlElement(name = "gene-sequence", namespace = "http://www.drugbank.ca", required = true)
    protected SequenceType geneSequence;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PfamListType pfams;
    @XmlElement(name = "go-classifiers", namespace = "http://www.drugbank.ca", required = true)
    protected GoClassifierListType goClassifiers;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "source", required = true)
    protected String source;

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
     * Gets the value of the generalFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralFunction() {
        return generalFunction;
    }

    /**
     * Sets the value of the generalFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralFunction(String value) {
        this.generalFunction = value;
    }

    /**
     * Gets the value of the specificFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificFunction() {
        return specificFunction;
    }

    /**
     * Sets the value of the specificFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificFunction(String value) {
        this.specificFunction = value;
    }

    /**
     * Gets the value of the geneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneName() {
        return geneName;
    }

    /**
     * Sets the value of the geneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneName(String value) {
        this.geneName = value;
    }

    /**
     * Gets the value of the locus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocus() {
        return locus;
    }

    /**
     * Sets the value of the locus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocus(String value) {
        this.locus = value;
    }

    /**
     * Gets the value of the cellularLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellularLocation() {
        return cellularLocation;
    }

    /**
     * Sets the value of the cellularLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellularLocation(String value) {
        this.cellularLocation = value;
    }

    /**
     * Gets the value of the transmembraneRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmembraneRegions() {
        return transmembraneRegions;
    }

    /**
     * Sets the value of the transmembraneRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmembraneRegions(String value) {
        this.transmembraneRegions = value;
    }

    /**
     * Gets the value of the signalRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalRegions() {
        return signalRegions;
    }

    /**
     * Sets the value of the signalRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalRegions(String value) {
        this.signalRegions = value;
    }

    /**
     * Gets the value of the theoreticalPi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheoreticalPi() {
        return theoreticalPi;
    }

    /**
     * Sets the value of the theoreticalPi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheoreticalPi(String value) {
        this.theoreticalPi = value;
    }

    /**
     * Gets the value of the molecularWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * Sets the value of the molecularWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMolecularWeight(String value) {
        this.molecularWeight = value;
    }

    /**
     * Gets the value of the chromosomeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromosomeLocation() {
        return chromosomeLocation;
    }

    /**
     * Sets the value of the chromosomeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromosomeLocation(String value) {
        this.chromosomeLocation = value;
    }

    /**
     * Gets the value of the organism property.
     * 
     * @return
     *     possible object is
     *     {@link PolypeptideType.Organism }
     *     
     */
    public PolypeptideType.Organism getOrganism() {
        return organism;
    }

    /**
     * Sets the value of the organism property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypeptideType.Organism }
     *     
     */
    public void setOrganism(PolypeptideType.Organism value) {
        this.organism = value;
    }

    /**
     * Gets the value of the externalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link PolypeptideExternalIdentifierListType }
     *     
     */
    public PolypeptideExternalIdentifierListType getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * Sets the value of the externalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypeptideExternalIdentifierListType }
     *     
     */
    public void setExternalIdentifiers(PolypeptideExternalIdentifierListType value) {
        this.externalIdentifiers = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link PolypeptideSynonymListType }
     *     
     */
    public PolypeptideSynonymListType getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypeptideSynonymListType }
     *     
     */
    public void setSynonyms(PolypeptideSynonymListType value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the aminoAcidSequence property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getAminoAcidSequence() {
        return aminoAcidSequence;
    }

    /**
     * Sets the value of the aminoAcidSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setAminoAcidSequence(SequenceType value) {
        this.aminoAcidSequence = value;
    }

    /**
     * Gets the value of the geneSequence property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getGeneSequence() {
        return geneSequence;
    }

    /**
     * Sets the value of the geneSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setGeneSequence(SequenceType value) {
        this.geneSequence = value;
    }

    /**
     * Gets the value of the pfams property.
     * 
     * @return
     *     possible object is
     *     {@link PfamListType }
     *     
     */
    public PfamListType getPfams() {
        return pfams;
    }

    /**
     * Sets the value of the pfams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PfamListType }
     *     
     */
    public void setPfams(PfamListType value) {
        this.pfams = value;
    }

    /**
     * Gets the value of the goClassifiers property.
     * 
     * @return
     *     possible object is
     *     {@link GoClassifierListType }
     *     
     */
    public GoClassifierListType getGoClassifiers() {
        return goClassifiers;
    }

    /**
     * Sets the value of the goClassifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoClassifierListType }
     *     
     */
    public void setGoClassifiers(GoClassifierListType value) {
        this.goClassifiers = value;
    }

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="ncbi-taxonomy-id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Organism {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ncbi-taxonomy-id")
        protected String ncbiTaxonomyId;

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
         * Gets the value of the ncbiTaxonomyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNcbiTaxonomyId() {
            return ncbiTaxonomyId;
        }

        /**
         * Sets the value of the ncbiTaxonomyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNcbiTaxonomyId(String value) {
            this.ncbiTaxonomyId = value;
        }

    }

}
