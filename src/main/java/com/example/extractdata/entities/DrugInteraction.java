package com.example.extractdata.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Getter
@Setter
@ToString
@Embeddable
public class DrugInteraction {
    private String drugbankId;
    private String name;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    public DrugInteraction(String drugbankId, String name, String description) {
        this.drugbankId = drugbankId;
        this.name = name;
        this.description = description;
    }

    public DrugInteraction() {

    }
}
