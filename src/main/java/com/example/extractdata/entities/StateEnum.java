package com.example.extractdata.entities;

public enum StateEnum {

    SOLID("solid"),
    LIQUID("liquid"),
    GAS("gas");
    private final String value;

    StateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateEnum fromValue(String v) {
        for (StateEnum c: StateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
