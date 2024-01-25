
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculated-property-source-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="calculated-property-source-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ChemAxon"/&gt;
 *     &lt;enumeration value="ALOGPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "calculated-property-source-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum CalculatedPropertySourceType {

    @XmlEnumValue("ChemAxon")
    CHEM_AXON("ChemAxon"),
    ALOGPS("ALOGPS");
    private final String value;

    CalculatedPropertySourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedPropertySourceType fromValue(String v) {
        for (CalculatedPropertySourceType c: CalculatedPropertySourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
