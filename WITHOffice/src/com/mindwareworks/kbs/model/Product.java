package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name="K_PRODUCT"
    ,schema="KBSTRI"
)
@org.hibernate.annotations.GenericGenerator(name = "sequence", strategy = "sequence", parameters = { @org.hibernate.annotations.Parameter(name = "sequence", value = "SEQ_PRODUCT") })
public class Product  implements java.io.Serializable {

    // Fields    

	
     private Integer productId;
     private String productName;
     private String mainImagePath;
     private String detailImagePath;
     private String productDescription;
     private Integer productPrice;
     private String sponsorName;
     private String sponsorUrl;
     private String purchaseUrl;
     private Set<RelatedProduct> relatedProducts = new HashSet<RelatedProduct>(0);

     // Constructors

    /** default constructor */
    public Product() {
    }

	/** minimal constructor */
    public Product(Integer productId) {
        this.productId = productId;
    }
    
    public Product(String productName, String mainImagePath,
			String detailImagePath, String productDescription,
			Integer productPrice, String sponsorName, String sponsorUrl,
			String purchaseUrl) {
		this.productName = productName;
		this.mainImagePath = mainImagePath;
		this.detailImagePath = detailImagePath;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.sponsorName = sponsorName;
		this.sponsorUrl = sponsorUrl;
		this.purchaseUrl = purchaseUrl;
	}

	// Property accessors
     @Id
    @GeneratedValue(generator="sequence")
    @Column(name="PRODUCT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    @Column(name="PRODUCT_NAME", unique=false, nullable=true, insertable=true, updatable=true)
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    @Column(name="MAIN_IMAGE_PATH", unique=false, nullable=true, insertable=true, updatable=true)
    public String getMainImagePath() {
        return this.mainImagePath;
    }
    
    public void setMainImagePath(String mainImagePath) {
        this.mainImagePath = mainImagePath;
    }
    
    @Column(name="DETAIL_IMAGE_PATH", unique=false, nullable=true, insertable=true, updatable=true)
    public String getDetailImagePath() {
        return this.detailImagePath;
    }
    
    public void setDetailImagePath(String detailImagePath) {
        this.detailImagePath = detailImagePath;
    }
    
    @Column(name="PRODUCT_DESCRIPTION", unique=false, nullable=true, insertable=true, updatable=true)
    public String getProductDescription() {
        return this.productDescription;
    }
    
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    @Column(name="PRODUCT_PRICE", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getProductPrice() {
        return this.productPrice;
    }
    
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }
    
    @Column(name="SPONSOR_NAME", unique=false, nullable=true, insertable=true, updatable=true)
    public String getSponsorName() {
        return this.sponsorName;
    }
    
    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }
    
    @Column(name="SPONSOR_URL", unique=false, nullable=true, insertable=true, updatable=true)
    public String getSponsorUrl() {
        return this.sponsorUrl;
    }
    
    public void setSponsorUrl(String sponsorUrl) {
        this.sponsorUrl = sponsorUrl;
    }
    
    @Column(name="PURCHASE_URL", unique=false, nullable=true, insertable=true, updatable=true)
    public String getPurchaseUrl() {
        return this.purchaseUrl;
    }
    
    public void setPurchaseUrl(String purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
    }
    
    @OneToMany(mappedBy="product")
    @org.hibernate.annotations.BatchSize(size=10)
	public Set<RelatedProduct> getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(Set<RelatedProduct> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

	


}


