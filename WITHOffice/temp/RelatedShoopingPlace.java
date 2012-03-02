// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RelatedShoopingPlace generated by hbm2java
 */
@Entity
@Table(name="K_RELATED_SHOOTING_PLACE"
    ,schema="KBSTRI"
)
public class RelatedShoopingPlace  implements java.io.Serializable {

    // Fields    

     private RelatedShoopingPlaceId id;
     private ShootingPlace shootingPlace;
     private Content content;
     private Integer startTime;
     private Integer endTime;

     // Constructors

    /** default constructor */
    public RelatedShoopingPlace() {
    }

	/** minimal constructor */
    public RelatedShoopingPlace(RelatedShoopingPlaceId id, ShootingPlace shootingPlace, Content content) {
        this.id = id;
        this.shootingPlace = shootingPlace;
        this.content = content;
    }
    /** full constructor */
    public RelatedShoopingPlace(RelatedShoopingPlaceId id, ShootingPlace shootingPlace, Content content, Integer startTime, Integer endTime) {
       this.id = id;
       this.shootingPlace = shootingPlace;
       this.content = content;
       this.startTime = startTime;
       this.endTime = endTime;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="contentId", column=@Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="placeId", column=@Column(name="PLACE_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public RelatedShoopingPlaceId getId() {
        return this.id;
    }
    
    public void setId(RelatedShoopingPlaceId id) {
        this.id = id;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="PLACE_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public ShootingPlace getShootingPlace() {
        return this.shootingPlace;
    }
    
    public void setShootingPlace(ShootingPlace shootingPlace) {
        this.shootingPlace = shootingPlace;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="CONTENT_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public Content getContent() {
        return this.content;
    }
    
    public void setContent(Content content) {
        this.content = content;
    }
    
    @Column(name="START_TIME", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    
    @Column(name="END_TIME", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }




}


