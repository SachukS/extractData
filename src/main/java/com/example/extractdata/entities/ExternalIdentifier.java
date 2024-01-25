package com.example.extractdata.entities;


import com.example.extractdata.generated.ExternalIdentifierType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Embeddable
public class ExternalIdentifier {
    @Enumerated(EnumType.STRING)
    private ExternalIdentifierResourceEnum resource;
    private String identifier;

    public ExternalIdentifier(ExternalIdentifierType externalIdentifierType) {
        this.resource = ExternalIdentifierResourceEnum.fromValue(externalIdentifierType.getResource().value());
        this.identifier = externalIdentifierType.getIdentifier();
    }

    public ExternalIdentifier() {

    }
}
