package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RelatedProductId generated by hbm2java
 */
@Embeddable
public class RelatedProductId  implements java.io.Serializable {

    // Fields    

     private Integer productId;
     private Integer contentId;

     // Constructors

    /** default constructor */
    public RelatedProductId() {
    }

    /** full constructor */
    public RelatedProductId(Integer productId, Integer contentId) {
       this.productId = productId;
       this.contentId = contentId;
    }
   
    // Property accessors

    @Column(name="PRODUCT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }




}

