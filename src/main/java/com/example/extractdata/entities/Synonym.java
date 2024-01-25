package com.example.extractdata.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Embeddable
public class Synonym {
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String value;
    private String language;
    private String coder;

    public Synonym() {
    }

    public Synonym(String value, String language, String coder) {
        this.value = value;
        this.language = language;
        this.coder = coder;
    }
}
