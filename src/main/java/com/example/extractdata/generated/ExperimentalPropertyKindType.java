
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experimental-property-kind-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="experimental-property-kind-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Water Solubility"/&gt;
 *     &lt;enumeration value="Melting Point"/&gt;
 *     &lt;enumeration value="Boiling Point"/&gt;
 *     &lt;enumeration value="logP"/&gt;
 *     &lt;enumeration value="logS"/&gt;
 *     &lt;enumeration value="Hydrophobicity"/&gt;
 *     &lt;enumeration value="Isoelectric Point"/&gt;
 *     &lt;enumeration value="caco2 Permeability"/&gt;
 *     &lt;enumeration value="pKa"/&gt;
 *     &lt;enumeration value="Molecular Weight"/&gt;
 *     &lt;enumeration value="Molecular Formula"/&gt;
 *     &lt;enumeration value="Radioactivity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "experimental-property-kind-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum ExperimentalPropertyKindType {

    @XmlEnumValue("Water Solubility")
    WATER_SOLUBILITY("Water Solubility"),
    @XmlEnumValue("Melting Point")
    MELTING_POINT("Melting Point"),
    @XmlEnumValue("Boiling Point")
    BOILING_POINT("Boiling Point"),
    @XmlEnumValue("logP")
    LOG_P("logP"),
    @XmlEnumValue("logS")
    LOG_S("logS"),
    @XmlEnumValue("Hydrophobicity")
    HYDROPHOBICITY("Hydrophobicity"),
    @XmlEnumValue("Isoelectric Point")
    ISOELECTRIC_POINT("Isoelectric Point"),
    @XmlEnumValue("caco2 Permeability")
    CACO_2_PERMEABILITY("caco2 Permeability"),
    @XmlEnumValue("pKa")
    P_KA("pKa"),
    @XmlEnumValue("Molecular Weight")
    MOLECULAR_WEIGHT("Molecular Weight"),
    @XmlEnumValue("Molecular Formula")
    MOLECULAR_FORMULA("Molecular Formula"),
    @XmlEnumValue("Radioactivity")
    RADIOACTIVITY("Radioactivity");
    private final String value;

    ExperimentalPropertyKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExperimentalPropertyKindType fromValue(String v) {
        for (ExperimentalPropertyKindType c: ExperimentalPropertyKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
