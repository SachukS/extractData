
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product-country-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="product-country-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="Canada"/&gt;
 *     &lt;enumeration value="EU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "product-country-type", namespace = "http://www.drugbank.ca")
@XmlEnum
public enum ProductCountryType {

    US("US"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    EU("EU");
    private final String value;

    ProductCountryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCountryType fromValue(String v) {
        for (ProductCountryType c: ProductCountryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
