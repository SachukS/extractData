package com.example.extractdata.entities;

public enum ExternalIdentifierResourceEnum {
    UNI_PROT_KB("UniProtKB"),
    WIKIPEDIA("Wikipedia"),
    CH_EBI("ChEBI"),
    CH_EMBL("ChEMBL"),
    PUB_CHEM_COMPOUND("PubChem Compound"),
    PUB_CHEM_SUBSTANCE("PubChem Substance"),
    DRUGS_PRODUCT_DATABASE_DPD("Drugs Product Database (DPD)"),
    KEGG_COMPOUND("KEGG Compound"),
    KEGG_DRUG("KEGG Drug"),
    CHEM_SPIDER("ChemSpider"),
    BINDING_DB("BindingDB"),
    NATIONAL_DRUG_CODE_DIRECTORY("National Drug Code Directory"),
    GEN_BANK("GenBank"),
    THERAPEUTIC_TARGETS_DATABASE("Therapeutic Targets Database"),
    PHARM_GKB("PharmGKB"),
    PDB("PDB"),
    IUPHAR("IUPHAR"),
    GUIDE_TO_PHARMACOLOGY("Guide to Pharmacology"),
    ZINC("ZINC"),
    RX_CUI("RxCUI");
    private final String value;

    ExternalIdentifierResourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalIdentifierResourceEnum fromValue(String v) {
        for (ExternalIdentifierResourceEnum c: ExternalIdentifierResourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
