package com.example.extractdata.entities;

import com.example.extractdata.generated.AtcCodeLevelType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "atc_code_level")
public class AtcCodeLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String value;

    @Column(name = "code")
    private String code;

    public AtcCodeLevel(AtcCodeLevelType atcCodeLevelType) {
        this.value = atcCodeLevelType.getValue();
        this.code = atcCodeLevelType.getCode();
    }

    public AtcCodeLevel() {

    }
}
