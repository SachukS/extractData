
package com.example.extractdata.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reference-list-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reference-list-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="articles" type="{http://www.drugbank.ca}article-list-type"/&gt;
 *         &lt;element name="textbooks" type="{http://www.drugbank.ca}textbook-list-type"/&gt;
 *         &lt;element name="links" type="{http://www.drugbank.ca}link-list-type"/&gt;
 *         &lt;element name="attachments" type="{http://www.drugbank.ca}attachment-list-type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reference-list-type", namespace = "http://www.drugbank.ca", propOrder = {
    "articles",
    "textbooks",
    "links",
    "attachments"
})
public class ReferenceListType {

    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected ArticleListType articles;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected TextbookListType textbooks;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected LinkListType links;
    @XmlElement(namespace = "http://www.drugbank.ca", required = true)
    protected AttachmentListType attachments;

    /**
     * Gets the value of the articles property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleListType }
     *     
     */
    public ArticleListType getArticles() {
        return articles;
    }

    /**
     * Sets the value of the articles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleListType }
     *     
     */
    public void setArticles(ArticleListType value) {
        this.articles = value;
    }

    /**
     * Gets the value of the textbooks property.
     * 
     * @return
     *     possible object is
     *     {@link TextbookListType }
     *     
     */
    public TextbookListType getTextbooks() {
        return textbooks;
    }

    /**
     * Sets the value of the textbooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextbookListType }
     *     
     */
    public void setTextbooks(TextbookListType value) {
        this.textbooks = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link LinkListType }
     *     
     */
    public LinkListType getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkListType }
     *     
     */
    public void setLinks(LinkListType value) {
        this.links = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachments(AttachmentListType value) {
        this.attachments = value;
    }

}
