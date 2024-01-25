
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for external-identifier-resource-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="external-identifier-resource-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UniProtKB"/&gt;
 *     &lt;enumeration value="Wikipedia"/&gt;
 *     &lt;enumeration value="ChEBI"/&gt;
 *     &lt;enumeration value="ChEMBL"/&gt;
 *     &lt;enumeration value="PubChem Compound"/&gt;
 *     &lt;enumeration value="PubChem Substance"/&gt;
 *     &lt;enumeration value="Drugs Product Database (DPD)"/&gt;
 *     &lt;enumeration value="KEGG Compound"/&gt;
 *     &lt;enumeration value="KEGG Drug"/&gt;
 *     &lt;enumeration value="ChemSpider"/&gt;
 *     &lt;enumeration value="BindingDB"/&gt;
 *     &lt;enumeration value="National Drug Code Directory"/&gt;
 *     &lt;enumeration value="GenBank"/&gt;
 *     &lt;enumeration value="Therapeutic Targets Database"/&gt;
 *     &lt;enumeration value="PharmGKB"/&gt;
 *     &lt;enumeration value="PDB"/&gt;
 *     &lt;enumeration value="IUPHAR"/&gt;
 *     &lt;enumeration value="Guide to Pharmacology"/&gt;
 *     &lt;enumeration value="ZINC"/&gt;
 *     &lt;enumeration value="RxCUI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "external-identifier-resource-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum ExternalIdentifierResourceType {

    @XmlEnumValue("UniProtKB")
    UNI_PROT_KB("UniProtKB"),
    @XmlEnumValue("Wikipedia")
    WIKIPEDIA("Wikipedia"),
    @XmlEnumValue("ChEBI")
    CH_EBI("ChEBI"),
    @XmlEnumValue("ChEMBL")
    CH_EMBL("ChEMBL"),
    @XmlEnumValue("PubChem Compound")
    PUB_CHEM_COMPOUND("PubChem Compound"),
    @XmlEnumValue("PubChem Substance")
    PUB_CHEM_SUBSTANCE("PubChem Substance"),
    @XmlEnumValue("Drugs Product Database (DPD)")
    DRUGS_PRODUCT_DATABASE_DPD("Drugs Product Database (DPD)"),
    @XmlEnumValue("KEGG Compound")
    KEGG_COMPOUND("KEGG Compound"),
    @XmlEnumValue("KEGG Drug")
    KEGG_DRUG("KEGG Drug"),
    @XmlEnumValue("ChemSpider")
    CHEM_SPIDER("ChemSpider"),
    @XmlEnumValue("BindingDB")
    BINDING_DB("BindingDB"),
    @XmlEnumValue("National Drug Code Directory")
    NATIONAL_DRUG_CODE_DIRECTORY("National Drug Code Directory"),
    @XmlEnumValue("GenBank")
    GEN_BANK("GenBank"),
    @XmlEnumValue("Therapeutic Targets Database")
    THERAPEUTIC_TARGETS_DATABASE("Therapeutic Targets Database"),
    @XmlEnumValue("PharmGKB")
    PHARM_GKB("PharmGKB"),
    PDB("PDB"),
    IUPHAR("IUPHAR"),
    @XmlEnumValue("Guide to Pharmacology")
    GUIDE_TO_PHARMACOLOGY("Guide to Pharmacology"),
    ZINC("ZINC"),
    @XmlEnumValue("RxCUI")
    RX_CUI("RxCUI");
    private final String value;

    ExternalIdentifierResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalIdentifierResourceType fromValue(String v) {
        for (ExternalIdentifierResourceType c: ExternalIdentifierResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
