
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
 * <p>Java class for drug-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drug-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drugbank-id" type="{http://www.drugbank.ca}drugbank-drug-salt-id-type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cas-number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unii" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="average-mass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="monoisotopic-mass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.drugbank.ca}state-type" minOccurs="0"/&gt;
 *         &lt;element name="groups" type="{http://www.drugbank.ca}group-list-type"/&gt;
 *         &lt;element name="general-references" type="{http://www.drugbank.ca}reference-list-type"/&gt;
 *         &lt;element name="synthesis-reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pharmacodynamics" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mechanism-of-action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toxicity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metabolism" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="absorption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="half-life" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="protein-binding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="route-of-elimination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="volume-of-distribution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clearance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="classification" type="{http://www.drugbank.ca}classification-type" minOccurs="0"/&gt;
 *         &lt;element name="salts" type="{http://www.drugbank.ca}salt-list-type"/&gt;
 *         &lt;element name="synonyms" type="{http://www.drugbank.ca}synonym-list-type"/&gt;
 *         &lt;element name="products" type="{http://www.drugbank.ca}product-list-type"/&gt;
 *         &lt;element name="international-brands" type="{http://www.drugbank.ca}international-brand-list-type"/&gt;
 *         &lt;element name="mixtures" type="{http://www.drugbank.ca}mixture-list-type"/&gt;
 *         &lt;element name="packagers" type="{http://www.drugbank.ca}packager-list-type"/&gt;
 *         &lt;element name="manufacturers" type="{http://www.drugbank.ca}manufacturer-list-type"/&gt;
 *         &lt;element name="prices" type="{http://www.drugbank.ca}price-list-type"/&gt;
 *         &lt;element name="categories" type="{http://www.drugbank.ca}category-list-type"/&gt;
 *         &lt;element name="affected-organisms" type="{http://www.drugbank.ca}affected-organism-list-type"/&gt;
 *         &lt;element name="dosages" type="{http://www.drugbank.ca}dosage-list-type"/&gt;
 *         &lt;element name="atc-codes" type="{http://www.drugbank.ca}atc-code-list-type"/&gt;
 *         &lt;element name="ahfs-codes" type="{http://www.drugbank.ca}ahfs-code-list-type"/&gt;
 *         &lt;element name="pdb-entries" type="{http://www.drugbank.ca}pdb-entry-list-type"/&gt;
 *         &lt;element name="fda-label" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="msds" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="patents" type="{http://www.drugbank.ca}patent-list-type"/&gt;
 *         &lt;element name="food-interactions" type="{http://www.drugbank.ca}food-interaction-list-type"/&gt;
 *         &lt;element name="drug-interactions" type="{http://www.drugbank.ca}drug-interaction-list-type"/&gt;
 *         &lt;element name="sequences" type="{http://www.drugbank.ca}sequence-list-type" minOccurs="0"/&gt;
 *         &lt;element name="calculated-properties" type="{http://www.drugbank.ca}calculated-property-list-type" minOccurs="0"/&gt;
 *         &lt;element name="experimental-properties" type="{http://www.drugbank.ca}experimental-property-list-type"/&gt;
 *         &lt;element name="external-identifiers" type="{http://www.drugbank.ca}external-identifier-list-type"/&gt;
 *         &lt;element name="external-links" type="{http://www.drugbank.ca}external-link-list-type"/&gt;
 *         &lt;element name="pathways" type="{http://www.drugbank.ca}pathway-list-type"/&gt;
 *         &lt;element name="reactions" type="{http://www.drugbank.ca}reaction-list-type"/&gt;
 *         &lt;element name="snp-effects" type="{http://www.drugbank.ca}snp-effect-list-type"/&gt;
 *         &lt;element name="snp-adverse-drug-reactions" type="{http://www.drugbank.ca}snp-adverse-drug-reaction-list-type"/&gt;
 *         &lt;element name="targets" type="{http://www.drugbank.ca}target-list-type"/&gt;
 *         &lt;element name="enzymes" type="{http://www.drugbank.ca}enzyme-list-type"/&gt;
 *         &lt;element name="carriers" type="{http://www.drugbank.ca}carrier-list-type"/&gt;
 *         &lt;element name="transporters" type="{http://www.drugbank.ca}transporter-list-type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="small molecule"/&gt;
 *             &lt;enumeration value="biotech"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="created" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="updated" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drug-type", namespace = "http://www.drugbank.ca", propOrder = {
    "drugbankId",
    "name",
    "description",
    "casNumber",
    "unii",
    "averageMass",
    "monoisotopicMass",
    "state",
    "groups",
    "generalReferences",
    "synthesisReference",
    "indication",
    "pharmacodynamics",
    "mechanismOfAction",
    "toxicity",
    "metabolism",
    "absorption",
    "halfLife",
    "proteinBinding",
    "routeOfElimination",
    "volumeOfDistribution",
    "clearance",
    "classification",
    "salts",
    "synonyms",
    "products",
    "internationalBrands",
    "mixtures",
    "packagers",
    "manufacturers",
    "prices",
    "categories",
    "affectedOrganisms",
    "dosages",
    "atcCodes",
    "ahfsCodes",
    "pdbEntries",
    "fdaLabel",
    "msds",
    "patents",
    "foodInteractions",
    "drugInteractions",
    "sequences",
    "calculatedProperties",
    "experimentalProperties",
    "externalIdentifiers",
    "externalLinks",
    "pathways",
    "reactions",
    "snpEffects",
    "snpAdverseDrugReactions",
    "targets",
    "enzymes",
    "carriers",
    "transporters"
})
public class DrugType {

    @XmlElement(name = "drugbank-id", namespace = "http://www.drugbank.ca", required = true)
    protected List<DrugbankDrugSaltIdType> drugbankId;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String description;
    @XmlElement(name = "cas-number", namespace = "http://www.drugbank.ca", required = true)
    protected String casNumber;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String unii;
    @XmlElement(name = "average-mass", namespace = "http://www.drugbank.ca")
    protected Float averageMass;
    @XmlElement(name = "monoisotopic-mass", namespace = "http://www.drugbank.ca")
    protected Float monoisotopicMass;
    @XmlElement(namespace = "http://www.drugbank.ca")
    @XmlSchemaType(name = "string")
    protected StateType state;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected GroupListType groups;
    @XmlElement(name = "general-references", namespace = "http://www.drugbank.ca", required = true)
    protected ReferenceListType generalReferences;
    @XmlElement(name = "synthesis-reference", namespace = "http://www.drugbank.ca", required = true)
    protected String synthesisReference;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String indication;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String pharmacodynamics;
    @XmlElement(name = "mechanism-of-action", namespace = "http://www.drugbank.ca", required = true)
    protected String mechanismOfAction;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String toxicity;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String metabolism;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String absorption;
    @XmlElement(name = "half-life", namespace = "http://www.drugbank.ca", required = true)
    protected String halfLife;
    @XmlElement(name = "protein-binding", namespace = "http://www.drugbank.ca", required = true)
    protected String proteinBinding;
    @XmlElement(name = "route-of-elimination", namespace = "http://www.drugbank.ca", required = true)
    protected String routeOfElimination;
    @XmlElement(name = "volume-of-distribution", namespace = "http://www.drugbank.ca", required = true)
    protected String volumeOfDistribution;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected String clearance;
    @XmlElement(namespace = "http://www.drugbank.ca")
    protected ClassificationType classification;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected SaltListType salts;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected SynonymListType synonyms;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ProductListType products;
    @XmlElement(name = "international-brands", namespace = "http://www.drugbank.ca", required = true)
    protected InternationalBrandListType internationalBrands;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected MixtureListType mixtures;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PackagerListType packagers;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ManufacturerListType manufacturers;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PriceListType prices;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected CategoryListType categories;
    @XmlElement(name = "affected-organisms", namespace = "http://www.drugbank.ca", required = true)
    protected AffectedOrganismListType affectedOrganisms;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected DosageListType dosages;
    @XmlElement(name = "atc-codes", namespace = "http://www.drugbank.ca", required = true)
    protected AtcCodeListType atcCodes;
    @XmlElement(name = "ahfs-codes", namespace = "http://www.drugbank.ca", required = true)
    protected AhfsCodeListType ahfsCodes;
    @XmlElement(name = "pdb-entries", namespace = "http://www.drugbank.ca", required = true)
    protected PdbEntryListType pdbEntries;
    @XmlElement(name = "fda-label", namespace = "http://www.drugbank.ca")
    @XmlSchemaType(name = "anyURI")
    protected String fdaLabel;
    @XmlElement(namespace = "http://www.drugbank.ca")
    @XmlSchemaType(name = "anyURI")
    protected String msds;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PatentListType patents;
    @XmlElement(name = "food-interactions", namespace = "http://www.drugbank.ca", required = true)
    protected FoodInteractionListType foodInteractions;
    @XmlElement(name = "drug-interactions", namespace = "http://www.drugbank.ca", required = true)
    protected DrugInteractionListType drugInteractions;
    @XmlElement(namespace = "http://www.drugbank.ca")
    protected SequenceListType sequences;
    @XmlElement(name = "calculated-properties", namespace = "http://www.drugbank.ca")
    protected CalculatedPropertyListType calculatedProperties;
    @XmlElement(name = "experimental-properties", namespace = "http://www.drugbank.ca", required = true)
    protected ExperimentalPropertyListType experimentalProperties;
    @XmlElement(name = "external-identifiers", namespace = "http://www.drugbank.ca", required = true)
    protected ExternalIdentifierListType externalIdentifiers;
    @XmlElement(name = "external-links", namespace = "http://www.drugbank.ca", required = true)
    protected ExternalLinkListType externalLinks;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected PathwayListType pathways;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ReactionListType reactions;
    @XmlElement(name = "snp-effects", namespace = "http://www.drugbank.ca", required = true)
    protected SnpEffectListType snpEffects;
    @XmlElement(name = "snp-adverse-drug-reactions", namespace = "http://www.drugbank.ca", required = true)
    protected SnpAdverseDrugReactionListType snpAdverseDrugReactions;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected TargetListType targets;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected EnzymeListType enzymes;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected CarrierListType carriers;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected TransporterListType transporters;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "created", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "updated", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updated;

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

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link GroupListType }
     *     
     */
    public GroupListType getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupListType }
     *     
     */
    public void setGroups(GroupListType value) {
        this.groups = value;
    }

    /**
     * Gets the value of the generalReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceListType }
     *     
     */
    public ReferenceListType getGeneralReferences() {
        return generalReferences;
    }

    /**
     * Sets the value of the generalReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceListType }
     *     
     */
    public void setGeneralReferences(ReferenceListType value) {
        this.generalReferences = value;
    }

    /**
     * Gets the value of the synthesisReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynthesisReference() {
        return synthesisReference;
    }

    /**
     * Sets the value of the synthesisReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynthesisReference(String value) {
        this.synthesisReference = value;
    }

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(String value) {
        this.indication = value;
    }

    /**
     * Gets the value of the pharmacodynamics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacodynamics() {
        return pharmacodynamics;
    }

    /**
     * Sets the value of the pharmacodynamics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacodynamics(String value) {
        this.pharmacodynamics = value;
    }

    /**
     * Gets the value of the mechanismOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    /**
     * Sets the value of the mechanismOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismOfAction(String value) {
        this.mechanismOfAction = value;
    }

    /**
     * Gets the value of the toxicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToxicity() {
        return toxicity;
    }

    /**
     * Sets the value of the toxicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToxicity(String value) {
        this.toxicity = value;
    }

    /**
     * Gets the value of the metabolism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetabolism() {
        return metabolism;
    }

    /**
     * Sets the value of the metabolism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetabolism(String value) {
        this.metabolism = value;
    }

    /**
     * Gets the value of the absorption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsorption() {
        return absorption;
    }

    /**
     * Sets the value of the absorption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsorption(String value) {
        this.absorption = value;
    }

    /**
     * Gets the value of the halfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalfLife() {
        return halfLife;
    }

    /**
     * Sets the value of the halfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalfLife(String value) {
        this.halfLife = value;
    }

    /**
     * Gets the value of the proteinBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinBinding() {
        return proteinBinding;
    }

    /**
     * Sets the value of the proteinBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinBinding(String value) {
        this.proteinBinding = value;
    }

    /**
     * Gets the value of the routeOfElimination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteOfElimination() {
        return routeOfElimination;
    }

    /**
     * Sets the value of the routeOfElimination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteOfElimination(String value) {
        this.routeOfElimination = value;
    }

    /**
     * Gets the value of the volumeOfDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeOfDistribution() {
        return volumeOfDistribution;
    }

    /**
     * Sets the value of the volumeOfDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeOfDistribution(String value) {
        this.volumeOfDistribution = value;
    }

    /**
     * Gets the value of the clearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearance() {
        return clearance;
    }

    /**
     * Sets the value of the clearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearance(String value) {
        this.clearance = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType }
     *     
     */
    public ClassificationType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType }
     *     
     */
    public void setClassification(ClassificationType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the salts property.
     * 
     * @return
     *     possible object is
     *     {@link SaltListType }
     *     
     */
    public SaltListType getSalts() {
        return salts;
    }

    /**
     * Sets the value of the salts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltListType }
     *     
     */
    public void setSalts(SaltListType value) {
        this.salts = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link SynonymListType }
     *     
     */
    public SynonymListType getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynonymListType }
     *     
     */
    public void setSynonyms(SynonymListType value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ProductListType }
     *     
     */
    public ProductListType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductListType }
     *     
     */
    public void setProducts(ProductListType value) {
        this.products = value;
    }

    /**
     * Gets the value of the internationalBrands property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalBrandListType }
     *     
     */
    public InternationalBrandListType getInternationalBrands() {
        return internationalBrands;
    }

    /**
     * Sets the value of the internationalBrands property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalBrandListType }
     *     
     */
    public void setInternationalBrands(InternationalBrandListType value) {
        this.internationalBrands = value;
    }

    /**
     * Gets the value of the mixtures property.
     * 
     * @return
     *     possible object is
     *     {@link MixtureListType }
     *     
     */
    public MixtureListType getMixtures() {
        return mixtures;
    }

    /**
     * Sets the value of the mixtures property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixtureListType }
     *     
     */
    public void setMixtures(MixtureListType value) {
        this.mixtures = value;
    }

    /**
     * Gets the value of the packagers property.
     * 
     * @return
     *     possible object is
     *     {@link PackagerListType }
     *     
     */
    public PackagerListType getPackagers() {
        return packagers;
    }

    /**
     * Sets the value of the packagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagerListType }
     *     
     */
    public void setPackagers(PackagerListType value) {
        this.packagers = value;
    }

    /**
     * Gets the value of the manufacturers property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerListType }
     *     
     */
    public ManufacturerListType getManufacturers() {
        return manufacturers;
    }

    /**
     * Sets the value of the manufacturers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerListType }
     *     
     */
    public void setManufacturers(ManufacturerListType value) {
        this.manufacturers = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setPrices(PriceListType value) {
        this.prices = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryListType }
     *     
     */
    public CategoryListType getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryListType }
     *     
     */
    public void setCategories(CategoryListType value) {
        this.categories = value;
    }

    /**
     * Gets the value of the affectedOrganisms property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedOrganismListType }
     *     
     */
    public AffectedOrganismListType getAffectedOrganisms() {
        return affectedOrganisms;
    }

    /**
     * Sets the value of the affectedOrganisms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOrganismListType }
     *     
     */
    public void setAffectedOrganisms(AffectedOrganismListType value) {
        this.affectedOrganisms = value;
    }

    /**
     * Gets the value of the dosages property.
     * 
     * @return
     *     possible object is
     *     {@link DosageListType }
     *     
     */
    public DosageListType getDosages() {
        return dosages;
    }

    /**
     * Sets the value of the dosages property.
     * 
     * @param value
     *     allowed object is
     *     {@link DosageListType }
     *     
     */
    public void setDosages(DosageListType value) {
        this.dosages = value;
    }

    /**
     * Gets the value of the atcCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AtcCodeListType }
     *     
     */
    public AtcCodeListType getAtcCodes() {
        return atcCodes;
    }

    /**
     * Sets the value of the atcCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcCodeListType }
     *     
     */
    public void setAtcCodes(AtcCodeListType value) {
        this.atcCodes = value;
    }

    /**
     * Gets the value of the ahfsCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AhfsCodeListType }
     *     
     */
    public AhfsCodeListType getAhfsCodes() {
        return ahfsCodes;
    }

    /**
     * Sets the value of the ahfsCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AhfsCodeListType }
     *     
     */
    public void setAhfsCodes(AhfsCodeListType value) {
        this.ahfsCodes = value;
    }

    /**
     * Gets the value of the pdbEntries property.
     * 
     * @return
     *     possible object is
     *     {@link PdbEntryListType }
     *     
     */
    public PdbEntryListType getPdbEntries() {
        return pdbEntries;
    }

    /**
     * Sets the value of the pdbEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdbEntryListType }
     *     
     */
    public void setPdbEntries(PdbEntryListType value) {
        this.pdbEntries = value;
    }

    /**
     * Gets the value of the fdaLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdaLabel() {
        return fdaLabel;
    }

    /**
     * Sets the value of the fdaLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdaLabel(String value) {
        this.fdaLabel = value;
    }

    /**
     * Gets the value of the msds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsds() {
        return msds;
    }

    /**
     * Sets the value of the msds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsds(String value) {
        this.msds = value;
    }

    /**
     * Gets the value of the patents property.
     * 
     * @return
     *     possible object is
     *     {@link PatentListType }
     *     
     */
    public PatentListType getPatents() {
        return patents;
    }

    /**
     * Sets the value of the patents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentListType }
     *     
     */
    public void setPatents(PatentListType value) {
        this.patents = value;
    }

    /**
     * Gets the value of the foodInteractions property.
     * 
     * @return
     *     possible object is
     *     {@link FoodInteractionListType }
     *     
     */
    public FoodInteractionListType getFoodInteractions() {
        return foodInteractions;
    }

    /**
     * Sets the value of the foodInteractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodInteractionListType }
     *     
     */
    public void setFoodInteractions(FoodInteractionListType value) {
        this.foodInteractions = value;
    }

    /**
     * Gets the value of the drugInteractions property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionListType }
     *     
     */
    public DrugInteractionListType getDrugInteractions() {
        return drugInteractions;
    }

    /**
     * Sets the value of the drugInteractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionListType }
     *     
     */
    public void setDrugInteractions(DrugInteractionListType value) {
        this.drugInteractions = value;
    }

    /**
     * Gets the value of the sequences property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceListType }
     *     
     */
    public SequenceListType getSequences() {
        return sequences;
    }

    /**
     * Sets the value of the sequences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceListType }
     *     
     */
    public void setSequences(SequenceListType value) {
        this.sequences = value;
    }

    /**
     * Gets the value of the calculatedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedPropertyListType }
     *     
     */
    public CalculatedPropertyListType getCalculatedProperties() {
        return calculatedProperties;
    }

    /**
     * Sets the value of the calculatedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedPropertyListType }
     *     
     */
    public void setCalculatedProperties(CalculatedPropertyListType value) {
        this.calculatedProperties = value;
    }

    /**
     * Gets the value of the experimentalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalPropertyListType }
     *     
     */
    public ExperimentalPropertyListType getExperimentalProperties() {
        return experimentalProperties;
    }

    /**
     * Sets the value of the experimentalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalPropertyListType }
     *     
     */
    public void setExperimentalProperties(ExperimentalPropertyListType value) {
        this.experimentalProperties = value;
    }

    /**
     * Gets the value of the externalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIdentifierListType }
     *     
     */
    public ExternalIdentifierListType getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * Sets the value of the externalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIdentifierListType }
     *     
     */
    public void setExternalIdentifiers(ExternalIdentifierListType value) {
        this.externalIdentifiers = value;
    }

    /**
     * Gets the value of the externalLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalLinkListType }
     *     
     */
    public ExternalLinkListType getExternalLinks() {
        return externalLinks;
    }

    /**
     * Sets the value of the externalLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalLinkListType }
     *     
     */
    public void setExternalLinks(ExternalLinkListType value) {
        this.externalLinks = value;
    }

    /**
     * Gets the value of the pathways property.
     * 
     * @return
     *     possible object is
     *     {@link PathwayListType }
     *     
     */
    public PathwayListType getPathways() {
        return pathways;
    }

    /**
     * Sets the value of the pathways property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathwayListType }
     *     
     */
    public void setPathways(PathwayListType value) {
        this.pathways = value;
    }

    /**
     * Gets the value of the reactions property.
     * 
     * @return
     *     possible object is
     *     {@link ReactionListType }
     *     
     */
    public ReactionListType getReactions() {
        return reactions;
    }

    /**
     * Sets the value of the reactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactionListType }
     *     
     */
    public void setReactions(ReactionListType value) {
        this.reactions = value;
    }

    /**
     * Gets the value of the snpEffects property.
     * 
     * @return
     *     possible object is
     *     {@link SnpEffectListType }
     *     
     */
    public SnpEffectListType getSnpEffects() {
        return snpEffects;
    }

    /**
     * Sets the value of the snpEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnpEffectListType }
     *     
     */
    public void setSnpEffects(SnpEffectListType value) {
        this.snpEffects = value;
    }

    /**
     * Gets the value of the snpAdverseDrugReactions property.
     * 
     * @return
     *     possible object is
     *     {@link SnpAdverseDrugReactionListType }
     *     
     */
    public SnpAdverseDrugReactionListType getSnpAdverseDrugReactions() {
        return snpAdverseDrugReactions;
    }

    /**
     * Sets the value of the snpAdverseDrugReactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnpAdverseDrugReactionListType }
     *     
     */
    public void setSnpAdverseDrugReactions(SnpAdverseDrugReactionListType value) {
        this.snpAdverseDrugReactions = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link TargetListType }
     *     
     */
    public TargetListType getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetListType }
     *     
     */
    public void setTargets(TargetListType value) {
        this.targets = value;
    }

    /**
     * Gets the value of the enzymes property.
     * 
     * @return
     *     possible object is
     *     {@link EnzymeListType }
     *     
     */
    public EnzymeListType getEnzymes() {
        return enzymes;
    }

    /**
     * Sets the value of the enzymes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnzymeListType }
     *     
     */
    public void setEnzymes(EnzymeListType value) {
        this.enzymes = value;
    }

    /**
     * Gets the value of the carriers property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierListType }
     *     
     */
    public CarrierListType getCarriers() {
        return carriers;
    }

    /**
     * Sets the value of the carriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierListType }
     *     
     */
    public void setCarriers(CarrierListType value) {
        this.carriers = value;
    }

    /**
     * Gets the value of the transporters property.
     * 
     * @return
     *     possible object is
     *     {@link TransporterListType }
     *     
     */
    public TransporterListType getTransporters() {
        return transporters;
    }

    /**
     * Sets the value of the transporters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporterListType }
     *     
     */
    public void setTransporters(TransporterListType value) {
        this.transporters = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

}
