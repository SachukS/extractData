
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculated-property-kind-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="calculated-property-kind-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="logP"/&gt;
 *     &lt;enumeration value="logS"/&gt;
 *     &lt;enumeration value="Water Solubility"/&gt;
 *     &lt;enumeration value="IUPAC Name"/&gt;
 *     &lt;enumeration value="Traditional IUPAC Name"/&gt;
 *     &lt;enumeration value="Molecular Weight"/&gt;
 *     &lt;enumeration value="Monoisotopic Weight"/&gt;
 *     &lt;enumeration value="SMILES"/&gt;
 *     &lt;enumeration value="Molecular Formula"/&gt;
 *     &lt;enumeration value="InChI"/&gt;
 *     &lt;enumeration value="InChIKey"/&gt;
 *     &lt;enumeration value="Polar Surface Area (PSA)"/&gt;
 *     &lt;enumeration value="Refractivity"/&gt;
 *     &lt;enumeration value="Polarizability"/&gt;
 *     &lt;enumeration value="Rotatable Bond Count"/&gt;
 *     &lt;enumeration value="H Bond Acceptor Count"/&gt;
 *     &lt;enumeration value="H Bond Donor Count"/&gt;
 *     &lt;enumeration value="pKa (strongest acidic)"/&gt;
 *     &lt;enumeration value="pKa (strongest basic)"/&gt;
 *     &lt;enumeration value="Physiological Charge"/&gt;
 *     &lt;enumeration value="Number of Rings"/&gt;
 *     &lt;enumeration value="Bioavailability"/&gt;
 *     &lt;enumeration value="Rule of Five"/&gt;
 *     &lt;enumeration value="Ghose Filter"/&gt;
 *     &lt;enumeration value="MDDR-Like Rule"/&gt;
 *     &lt;enumeration value="Veber's Rule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "calculated-property-kind-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum CalculatedPropertyKindType {

    @XmlEnumValue("logP")
    LOG_P("logP"),
    @XmlEnumValue("logS")
    LOG_S("logS"),
    @XmlEnumValue("Water Solubility")
    WATER_SOLUBILITY("Water Solubility"),
    @XmlEnumValue("IUPAC Name")
    IUPAC_NAME("IUPAC Name"),
    @XmlEnumValue("Traditional IUPAC Name")
    TRADITIONAL_IUPAC_NAME("Traditional IUPAC Name"),
    @XmlEnumValue("Molecular Weight")
    MOLECULAR_WEIGHT("Molecular Weight"),
    @XmlEnumValue("Monoisotopic Weight")
    MONOISOTOPIC_WEIGHT("Monoisotopic Weight"),
    SMILES("SMILES"),
    @XmlEnumValue("Molecular Formula")
    MOLECULAR_FORMULA("Molecular Formula"),
    @XmlEnumValue("InChI")
    IN_CH_I("InChI"),
    @XmlEnumValue("InChIKey")
    IN_CH_I_KEY("InChIKey"),
    @XmlEnumValue("Polar Surface Area (PSA)")
    POLAR_SURFACE_AREA_PSA("Polar Surface Area (PSA)"),
    @XmlEnumValue("Refractivity")
    REFRACTIVITY("Refractivity"),
    @XmlEnumValue("Polarizability")
    POLARIZABILITY("Polarizability"),
    @XmlEnumValue("Rotatable Bond Count")
    ROTATABLE_BOND_COUNT("Rotatable Bond Count"),
    @XmlEnumValue("H Bond Acceptor Count")
    H_BOND_ACCEPTOR_COUNT("H Bond Acceptor Count"),
    @XmlEnumValue("H Bond Donor Count")
    H_BOND_DONOR_COUNT("H Bond Donor Count"),
    @XmlEnumValue("pKa (strongest acidic)")
    P_KA_STRONGEST_ACIDIC("pKa (strongest acidic)"),
    @XmlEnumValue("pKa (strongest basic)")
    P_KA_STRONGEST_BASIC("pKa (strongest basic)"),
    @XmlEnumValue("Physiological Charge")
    PHYSIOLOGICAL_CHARGE("Physiological Charge"),
    @XmlEnumValue("Number of Rings")
    NUMBER_OF_RINGS("Number of Rings"),
    @XmlEnumValue("Bioavailability")
    BIOAVAILABILITY("Bioavailability"),
    @XmlEnumValue("Rule of Five")
    RULE_OF_FIVE("Rule of Five"),
    @XmlEnumValue("Ghose Filter")
    GHOSE_FILTER("Ghose Filter"),
    @XmlEnumValue("MDDR-Like Rule")
    MDDR_LIKE_RULE("MDDR-Like Rule"),
    @XmlEnumValue("Veber's Rule")
    VEBER_S_RULE("Veber's Rule");
    private final String value;

    CalculatedPropertyKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedPropertyKindType fromValue(String v) {
        for (CalculatedPropertyKindType c: CalculatedPropertyKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
