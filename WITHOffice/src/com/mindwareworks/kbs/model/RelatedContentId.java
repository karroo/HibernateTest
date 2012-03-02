package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RelatedContentId generated by hbm2java
 */
@Embeddable
public class RelatedContentId  implements java.io.Serializable {

    // Fields    

     private Integer relatedContentId;
     private Integer contentId;

     // Constructors

    /** default constructor */
    public RelatedContentId() {
    }

    /** full constructor */
    public RelatedContentId(Integer relatedContentId, Integer contentId) {
       this.relatedContentId = relatedContentId;
       this.contentId = contentId;
    }
   
    // Property accessors

    @Column(name="RELATED_CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getRelatedContentId() {
        return this.relatedContentId;
    }
    
    public void setRelatedContentId(Integer relatedContentId) {
        this.relatedContentId = relatedContentId;
    }

    @Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }




}

