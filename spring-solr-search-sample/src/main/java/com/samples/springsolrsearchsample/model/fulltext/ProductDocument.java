package com.samples.springsolrsearchsample.model.fulltext;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "product_info")
public class ProductDocument {

    @Id
    @Indexed(name = "id", type = "String")
    private String id;

    @Indexed(name = "name", type = "String")
    private String name;

    @Indexed(name = "longDesc", type = "String")
    private String longDescription;

    @Indexed(name = "shortDesc", type = "String")
    private String shortDesc;

    @Indexed(name = "expiryDate", type = "Date")
    private LocalDateTime expiryDate;

    public ProductDocument() {
        super();
    }

    public ProductDocument(String id, String name, String longDescription, String shortDesc, LocalDateTime expiryDate) {
        this.id = id;
        this.name = name;
        this.longDescription = longDescription;
        this.shortDesc = shortDesc;
        this.expiryDate = expiryDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductDocument productDocument = (ProductDocument) o;

        if (id != null ? !id.equals(productDocument.id) : productDocument.id != null) return false;
        if (name != null ? !name.equals(productDocument.name) : productDocument.name != null) return false;
        if (longDescription != null ? !longDescription.equals(productDocument.longDescription) : productDocument.longDescription != null)
            return false;
        if (shortDesc != null ? !shortDesc.equals(productDocument.shortDesc) : productDocument.shortDesc != null) return false;
        return expiryDate != null ? expiryDate.equals(productDocument.expiryDate) : productDocument.expiryDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (longDescription != null ? longDescription.hashCode() : 0);
        result = 31 * result + (shortDesc != null ? shortDesc.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductDocument{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
