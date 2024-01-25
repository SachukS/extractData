package com.example.extractdata.entities;

public enum GroupEnum {
    APPROVED("approved"),
    ILLICIT("illicit"),
    EXPERIMENTAL("experimental"),
    WITHDRAWN("withdrawn"),
    NUTRACEUTICAL("nutraceutical"),
    INVESTIGATIONAL("investigational"),
    VET_APPROVED("vet_approved");
    private final String value;

    GroupEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupEnum fromValue(String v) {
        for (GroupEnum c: GroupEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
