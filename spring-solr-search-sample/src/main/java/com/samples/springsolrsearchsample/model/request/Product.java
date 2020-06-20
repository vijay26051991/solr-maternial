package com.samples.springsolrsearchsample.model.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    private String productId;

    private String name;

    private String shortDesc;

    private String longDesc;

    private LocalDateTime expiryDate;

    public Product() {
        super();
    }

    @JsonCreator
    public Product(
            @JsonProperty("productId") String productId,
            @JsonProperty("name") String name,
            @JsonProperty("shortDesc") String shortDesc,
            @JsonProperty("longDesc") String longDesc,
            @JsonProperty("expiryDate") LocalDateTime expiryDate) {
        this.productId = productId;
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.expiryDate = expiryDate;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != null ? !productId.equals(product.productId) : product.productId != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (shortDesc != null ? !shortDesc.equals(product.shortDesc) : product.shortDesc != null) return false;
        if (longDesc != null ? !longDesc.equals(product.longDesc) : product.longDesc != null) return false;
        return expiryDate != null ? expiryDate.equals(product.expiryDate) : product.expiryDate == null;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortDesc != null ? shortDesc.hashCode() : 0);
        result = 31 * result + (longDesc != null ? longDesc.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
