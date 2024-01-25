package com.example.extractdata.entities;

public enum ExternalLinkResourceEnum {

    RX_LIST("RxList"),
    PD_RHEALTH("PDRhealth"),
    DRUGS_COM("Drugs.com");
    private final String value;

    ExternalLinkResourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalLinkResourceEnum fromValue(String v) {
        for (ExternalLinkResourceEnum c: ExternalLinkResourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
