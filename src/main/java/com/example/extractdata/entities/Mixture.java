package com.example.extractdata.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@Table(name = "mixture")
public class Mixture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String name;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String ingredients;

    public Mixture(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Mixture() {

    }
}
