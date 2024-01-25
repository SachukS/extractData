package com.example.extractdata.entities;

import com.example.extractdata.generated.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String drugbankId;
    private String name;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String description;
    private String casNumber;
    private String unii;
    private Float averageMass;
    private Float monoisotopicMass;
    @Enumerated(EnumType.STRING)
    private StateEnum state;
    @ElementCollection()
    @CollectionTable(name = "group_list", joinColumns = @JoinColumn(name = "drug_id"))
    @Column(name = "group_name")
    @Enumerated(EnumType.STRING)
    private List<GroupEnum> groups;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String indication;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String pharmacodynamics;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String mechanismOfAction;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String toxicity;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String metabolism;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String absorption;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String halfLife;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String proteinBinding;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String routeOfElimination;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String volumeOfDistribution;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String clearance;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "classification_id")
    private Classification classification;
    @ElementCollection
    @CollectionTable(name = "synonym", joinColumns = @JoinColumn(name = "drug_id"))
    private List<Synonym> synonyms;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "drug_id")
    private List<Product> products;
    @ElementCollection
    @CollectionTable(name = "international_brand", joinColumns = @JoinColumn(name = "drug_id"))
    @Column(name = "brand")
    private List<String> internationalBrands;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "drug_id")
    private List<Mixture> mixtures;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "drug_id")
    private List<AtcCode> atcCodes;

    private String fdaLabel;

    private String msds;
    @ElementCollection
    @CollectionTable(name = "food_interaction", joinColumns = @JoinColumn(name = "drug_id"))
    @Column(name = "food_name")
    @Type(type = "org.hibernate.type.TextType")
    private List<String> foodInteractions;
    @ElementCollection
    @CollectionTable(name = "drug_interaction", joinColumns = @JoinColumn(name = "drug_id"))
    private List<DrugInteraction> drugInteractions;

    @ElementCollection
    @CollectionTable(name = "external_identifier", joinColumns = @JoinColumn(name = "drug_id"))
    private List<ExternalIdentifier> externalIdentifiers;
    @ElementCollection
    @CollectionTable(name = "external_link", joinColumns = @JoinColumn(name = "drug_id"))
    private List<ExternalLink> externalLinks;
    @Temporal(TemporalType.DATE)
    @Column(name = "created", nullable = false)
    private Date created;
    @Temporal(TemporalType.DATE)
    @Column(name = "updated", nullable = false)
    private Date updated;

    public Drug(DrugType drugType) {
        this.drugbankId = drugType.getDrugbankId().stream().filter(DrugbankDrugSaltIdType::isPrimary).collect(Collectors.toList()).get(0).getValue();
        this.name = drugType.getName();
        this.description = drugType.getDescription();
        this.casNumber = drugType.getCasNumber();
        this.unii = drugType.getUnii();
        this.averageMass = drugType.getAverageMass();
        this.monoisotopicMass = drugType.getMonoisotopicMass();
        this.state = drugType.getState() == null ? null : StateEnum.fromValue(drugType.getState().value());
        this.groups = drugType.getGroups().getGroup().stream()
                .map(Enum::name)
                .map(GroupEnum::valueOf)
                .collect(Collectors.toList());
        this.indication = drugType.getIndication();
        this.pharmacodynamics = drugType.getPharmacodynamics();
        this.mechanismOfAction = drugType.getMechanismOfAction();
        this.toxicity = drugType.getToxicity();
        this.metabolism = drugType.getMetabolism();
        this.absorption = drugType.getAbsorption();
        this.halfLife = drugType.getHalfLife();
        this.proteinBinding = drugType.getProteinBinding();
        this.routeOfElimination = drugType.getRouteOfElimination();
        this.volumeOfDistribution = drugType.getVolumeOfDistribution();
        this.clearance = drugType.getClearance();
        this.classification = createClassificationFromDrugType(drugType.getClassification());
        this.synonyms = createSynonymsFromDrugType(drugType.getSynonyms());
        this.products = createProductsFromDrugType(drugType.getProducts());
        this.internationalBrands = drugType.getInternationalBrands().getInternationalBrand().stream().map(InternationalBrandType::getName).collect(Collectors.toList());
        this.mixtures = createMixturesFromDrugType(drugType.getMixtures());
        this.atcCodes = createAtcCodesFromDrugType(drugType.getAtcCodes());
        this.fdaLabel = drugType.getFdaLabel();
        this.msds = drugType.getMsds();
        this.foodInteractions = drugType.getFoodInteractions().getFoodInteraction();
        this.drugInteractions = createDrugInteractionsFromDrugType(drugType.getDrugInteractions());
        this.externalIdentifiers = createExternalIdentifiersFromDrugType(drugType.getExternalIdentifiers());
        this.externalLinks = createExternalLinksFromDrugType(drugType.getExternalLinks());
        this.created = convertXmlGregorianCalendarToUtilDate(drugType.getCreated());
        this.updated = convertXmlGregorianCalendarToUtilDate(drugType.getUpdated());
    }

    public Drug() {

    }

    public static Date convertXmlGregorianCalendarToUtilDate(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar != null) {
            return xmlGregorianCalendar.toGregorianCalendar().getTime();
        }
        return null;
    }

    private Classification createClassificationFromDrugType(ClassificationType classificationType) {
        if (classificationType != null)
            return new Classification(classificationType.getDescription(),
                    classificationType.getDirectParent(),
                    classificationType.getKingdom(),
                    classificationType.getSuperclass(),
                    classificationType.getClazz(),
                    classificationType.getSubclass(),
                    classificationType.getAlternativeParent(),
                    classificationType.getSubstituent());
        return null;
    }

    private List<Synonym> createSynonymsFromDrugType(SynonymListType synonymListType) {
        List<Synonym> synonyms = new ArrayList<>();
        synonymListType.getSynonym()
                .forEach(synonymType -> synonyms
                        .add(new Synonym(synonymType.getValue(), synonymType.getLanguage(), synonymType.getCoder())));
        return synonyms;
    }

    private List<Product> createProductsFromDrugType(ProductListType productListType) {
        List<Product> products = new ArrayList<>();
        productListType.getProduct().forEach(productType -> products.add(new Product(productType)));
        return products;
    }

    private List<Mixture> createMixturesFromDrugType(MixtureListType mixtureListType) {
        List<Mixture> mixtures = new ArrayList<>();
        mixtureListType.getMixture().forEach(mixtureType -> mixtures.add(new Mixture(mixtureType.getName(), mixtureType.getIngredients())));
        return mixtures;
    }

    private List<AtcCode> createAtcCodesFromDrugType(AtcCodeListType atcCodeListType) {
        List<AtcCode> atcCodes = new ArrayList<>();
        atcCodeListType.getAtcCode().forEach(atcCodeType -> atcCodes.add(new AtcCode(atcCodeType)));
        return atcCodes;
    }

    private List<DrugInteraction> createDrugInteractionsFromDrugType(DrugInteractionListType drugInteractionListType) {
        List<DrugInteraction> drugInteractions = new ArrayList<>();
        drugInteractionListType.getDrugInteraction().forEach(drugInteractionType -> drugInteractions.add(new DrugInteraction(drugInteractionType.getDrugbankId().getValue(), drugInteractionType.getName(), drugInteractionType.getDescription())));
        return drugInteractions;
    }

    private List<ExternalIdentifier> createExternalIdentifiersFromDrugType(ExternalIdentifierListType externalIdentifierListType) {
        List<ExternalIdentifier> externalIdentifiers = new ArrayList<>();
        externalIdentifierListType.getExternalIdentifier().forEach(externalIdentifierType -> externalIdentifiers.add(new ExternalIdentifier(externalIdentifierType)));
        return externalIdentifiers;
    }

    private List<ExternalLink> createExternalLinksFromDrugType(ExternalLinkListType externalLinkListType) {
        List<ExternalLink> externalLinks = new ArrayList<>();
        externalLinkListType.getExternalLink().forEach(externalLinkType -> externalLinks.add(new ExternalLink(externalLinkType)));
        return externalLinks;
    }
}
