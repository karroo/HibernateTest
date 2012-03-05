// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RelatedShoopingPlaceId generated by hbm2java
 */
@Embeddable
public class RelatedShoopingPlaceId  implements java.io.Serializable {

    // Fields    

     private Integer contentId;
     private Integer placeId;

     // Constructors

    /** default constructor */
    public RelatedShoopingPlaceId() {
    }

    /** full constructor */
    public RelatedShoopingPlaceId(Integer contentId, Integer placeId) {
       this.contentId = contentId;
       this.placeId = placeId;
    }
   
    // Property accessors

    @Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    @Column(name="PLACE_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getPlaceId() {
        return this.placeId;
    }
    
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }




}


