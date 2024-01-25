
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for polypeptide-external-identifier-resource-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="polypeptide-external-identifier-resource-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UniProtKB"/&gt;
 *     &lt;enumeration value="UniProt Accession"/&gt;
 *     &lt;enumeration value="HUGO Gene Nomenclature Committee (HGNC)"/&gt;
 *     &lt;enumeration value="Human Protein Reference Database (HPRD)"/&gt;
 *     &lt;enumeration value="GenAtlas"/&gt;
 *     &lt;enumeration value="GeneCards"/&gt;
 *     &lt;enumeration value="GenBank Gene Database"/&gt;
 *     &lt;enumeration value="GenBank Protein Database"/&gt;
 *     &lt;enumeration value="ChEMBL"/&gt;
 *     &lt;enumeration value="IUPHAR"/&gt;
 *     &lt;enumeration value="Guide to Pharmacology"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "polypeptide-external-identifier-resource-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum PolypeptideExternalIdentifierResourceType {

    @XmlEnumValue("UniProtKB")
    UNI_PROT_KB("UniProtKB"),
    @XmlEnumValue("UniProt Accession")
    UNI_PROT_ACCESSION("UniProt Accession"),
    @XmlEnumValue("HUGO Gene Nomenclature Committee (HGNC)")
    HUGO_GENE_NOMENCLATURE_COMMITTEE_HGNC("HUGO Gene Nomenclature Committee (HGNC)"),
    @XmlEnumValue("Human Protein Reference Database (HPRD)")
    HUMAN_PROTEIN_REFERENCE_DATABASE_HPRD("Human Protein Reference Database (HPRD)"),
    @XmlEnumValue("GenAtlas")
    GEN_ATLAS("GenAtlas"),
    @XmlEnumValue("GeneCards")
    GENE_CARDS("GeneCards"),
    @XmlEnumValue("GenBank Gene Database")
    GEN_BANK_GENE_DATABASE("GenBank Gene Database"),
    @XmlEnumValue("GenBank Protein Database")
    GEN_BANK_PROTEIN_DATABASE("GenBank Protein Database"),
    @XmlEnumValue("ChEMBL")
    CH_EMBL("ChEMBL"),
    IUPHAR("IUPHAR"),
    @XmlEnumValue("Guide to Pharmacology")
    GUIDE_TO_PHARMACOLOGY("Guide to Pharmacology");
    private final String value;

    PolypeptideExternalIdentifierResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolypeptideExternalIdentifierResourceType fromValue(String v) {
        for (PolypeptideExternalIdentifierResourceType c: PolypeptideExternalIdentifierResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
