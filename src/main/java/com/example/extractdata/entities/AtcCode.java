package com.example.extractdata.entities;

import com.example.extractdata.generated.AtcCodeType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@Entity
@Table(name = "atc_code")
public class AtcCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "atc_id")
    private List<AtcCodeLevel> level;
    @Column(name = "code")
    private String code;

    public AtcCode(AtcCodeType atcCodeType) {
        this.level = atcCodeType.getLevel().stream().map(AtcCodeLevel::new).collect(Collectors.toList());
        this.code = atcCodeType.getCode();
    }

    public AtcCode() {

    }
}
