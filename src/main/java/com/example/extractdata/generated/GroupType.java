
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for group-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="group-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="approved"/&gt;
 *     &lt;enumeration value="illicit"/&gt;
 *     &lt;enumeration value="experimental"/&gt;
 *     &lt;enumeration value="withdrawn"/&gt;
 *     &lt;enumeration value="nutraceutical"/&gt;
 *     &lt;enumeration value="investigational"/&gt;
 *     &lt;enumeration value="vet_approved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "group-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum GroupType {

    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("illicit")
    ILLICIT("illicit"),
    @XmlEnumValue("experimental")
    EXPERIMENTAL("experimental"),
    @XmlEnumValue("withdrawn")
    WITHDRAWN("withdrawn"),
    @XmlEnumValue("nutraceutical")
    NUTRACEUTICAL("nutraceutical"),
    @XmlEnumValue("investigational")
    INVESTIGATIONAL("investigational"),
    @XmlEnumValue("vet_approved")
    VET_APPROVED("vet_approved");
    private final String value;

    GroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupType fromValue(String v) {
        for (GroupType c: GroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
