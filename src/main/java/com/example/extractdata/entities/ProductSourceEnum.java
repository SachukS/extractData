package com.example.extractdata.entities;

public enum ProductSourceEnum {
    FDA_NDC("FDA NDC"),
    DPD("DPD"),
    EMA("EMA");
    private final String value;

    ProductSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSourceEnum fromValue(String v) {
        for (ProductSourceEnum c: ProductSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
