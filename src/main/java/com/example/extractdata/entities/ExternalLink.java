package com.example.extractdata.entities;

import com.example.extractdata.generated.ExternalLinkType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Embeddable
public class ExternalLink {
    @Enumerated(EnumType.STRING)
    private ExternalLinkResourceEnum resource;
    private String url;

    public ExternalLink(ExternalLinkType externalLinkType) {
        this.resource = ExternalLinkResourceEnum.fromValue(externalLinkType.getResource().value());
        this.url = externalLinkType.getUrl();
    }

    public ExternalLink() {

    }
}
