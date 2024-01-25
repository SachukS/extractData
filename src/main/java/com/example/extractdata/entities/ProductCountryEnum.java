package com.example.extractdata.entities;

public enum ProductCountryEnum {
    US("US"),
    CANADA("Canada"),
    EU("EU");
    private final String value;

    ProductCountryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCountryEnum fromValue(String v) {
        for (ProductCountryEnum c: ProductCountryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
