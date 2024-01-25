
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for external-link-resource-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="external-link-resource-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RxList"/&gt;
 *     &lt;enumeration value="PDRhealth"/&gt;
 *     &lt;enumeration value="Drugs.com"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "external-link-resource-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum ExternalLinkResourceType {

    @XmlEnumValue("RxList")
    RX_LIST("RxList"),
    @XmlEnumValue("PDRhealth")
    PD_RHEALTH("PDRhealth"),
    @XmlEnumValue("Drugs.com")
    DRUGS_COM("Drugs.com");
    private final String value;

    ExternalLinkResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalLinkResourceType fromValue(String v) {
        for (ExternalLinkResourceType c: ExternalLinkResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
