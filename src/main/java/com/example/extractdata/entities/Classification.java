package com.example.extractdata.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "classification")
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String description;
    private String directParent;
    private String kingdom;
    private String superclass;
    private String clazz;
    private String subclass;
    @ElementCollection
    @CollectionTable(name = "alternative_parent", joinColumns = @JoinColumn(name = "classification_id"))
    @Column(name = "parent")
    private List<String> alternativeParent;
    @ElementCollection
    @CollectionTable(name = "substit", joinColumns = @JoinColumn(name = "classification_id"))
    @Column(name = "substituent")
    private List<String> substituent;

    public Classification() {
    }

    public Classification(String description, String directParent, String kingdom, String superclass, String clazz, String subclass, List<String> alternativeParent, List<String> substituent) {
        this.description = description;
        this.directParent = directParent;
        this.kingdom = kingdom;
        this.superclass = superclass;
        this.clazz = clazz;
        this.subclass = subclass;
        this.alternativeParent = alternativeParent;
        this.substituent = substituent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classification that = (Classification) o;
        return Objects.equals(description, that.description) && Objects.equals(directParent, that.directParent) && Objects.equals(kingdom, that.kingdom) && Objects.equals(superclass, that.superclass) && Objects.equals(clazz, that.clazz) && Objects.equals(subclass, that.subclass) && Objects.equals(alternativeParent, that.alternativeParent) && Objects.equals(substituent, that.substituent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, directParent, kingdom, superclass, clazz, subclass, alternativeParent, substituent);
    }
}
