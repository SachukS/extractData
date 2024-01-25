
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product-source-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="product-source-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FDA NDC"/&gt;
 *     &lt;enumeration value="DPD"/&gt;
 *     &lt;enumeration value="EMA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "product-source-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum ProductSourceType {

    @XmlEnumValue("FDA NDC")
    FDA_NDC("FDA NDC"),
    DPD("DPD"),
    EMA("EMA");
    private final String value;

    ProductSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSourceType fromValue(String v) {
        for (ProductSourceType c: ProductSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
