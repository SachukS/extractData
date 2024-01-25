
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for state-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="state-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="solid"/&gt;
 *     &lt;enumeration value="liquid"/&gt;
 *     &lt;enumeration value="gas"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "state-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum StateType {

    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("liquid")
    LIQUID("liquid"),
    @XmlEnumValue("gas")
    GAS("gas");
    private final String value;

    StateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateType fromValue(String v) {
        for (StateType c: StateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
