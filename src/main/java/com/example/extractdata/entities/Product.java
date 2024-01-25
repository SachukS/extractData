package com.example.extractdata.entities;

import com.example.extractdata.generated.ProductType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String name;
    private String labeller;
    private String ndcId;
    private String ndcProductCode;
    private String dpdId;
    private String emaProductCode;
    private String emaMaNumber;
    private String startedMarketingOn;
    private String endedMarketingOn;
    private String dosageForm;
    private String strength;
    private String route;
    private String fdaApplicationNumber;
    private boolean generic;
    private boolean overTheCounter;
    private boolean approved;
    @Enumerated(EnumType.STRING)
    private ProductCountryEnum country;
    @Enumerated(EnumType.STRING)
    private ProductSourceEnum source;

    public Product(ProductType productType) {
        this.name = productType.getName();
        this.labeller = productType.getLabeller();
        this.ndcId = productType.getNdcId();
        this.ndcProductCode = productType.getNdcProductCode();
        this.dpdId = productType.getDpdId();
        this.emaProductCode = productType.getEmaProductCode();
        this.emaMaNumber = productType.getEmaMaNumber();
        this.startedMarketingOn = productType.getStartedMarketingOn();
        this.endedMarketingOn = productType.getEndedMarketingOn();
        this.dosageForm = productType.getDosageForm();
        this.strength = productType.getStrength();
        this.route = productType.getRoute();
        this.fdaApplicationNumber = productType.getFdaApplicationNumber();
        this.generic = productType.isGeneric();
        this.overTheCounter = productType.isOverTheCounter();
        this.approved = productType.isApproved();
        this.country = ProductCountryEnum.fromValue(productType.getCountry().value());
        this.source = ProductSourceEnum.fromValue(productType.getSource().value());
    }

    public Product() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return generic == product.generic && overTheCounter == product.overTheCounter && approved == product.approved && Objects.equals(name, product.name) && Objects.equals(labeller, product.labeller) && Objects.equals(ndcId, product.ndcId) && Objects.equals(ndcProductCode, product.ndcProductCode) && Objects.equals(dpdId, product.dpdId) && Objects.equals(emaProductCode, product.emaProductCode) && Objects.equals(emaMaNumber, product.emaMaNumber) && Objects.equals(startedMarketingOn, product.startedMarketingOn) && Objects.equals(endedMarketingOn, product.endedMarketingOn) && Objects.equals(dosageForm, product.dosageForm) && Objects.equals(strength, product.strength) && Objects.equals(route, product.route) && Objects.equals(fdaApplicationNumber, product.fdaApplicationNumber) && country == product.country && source == product.source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labeller, ndcId, ndcProductCode, dpdId, emaProductCode, emaMaNumber, startedMarketingOn, endedMarketingOn, dosageForm, strength, route, fdaApplicationNumber, generic, overTheCounter, approved, country, source);
    }
}
