// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ShootingPlace generated by hbm2java
 */
@Entity
@Table(name="K_SHOOTING_PLACE"
    ,schema="KBSTRI"
)
public class ShootingPlace  implements java.io.Serializable {

    // Fields    

     private Integer placeId;
     private String shootingPlace;
     private String shootingPlaceTransportation;
     private String shootingPlaceContact;
     private String shootingPlaceDetail;
     private String shootingPlaceImagePath;
     private Integer posid;
     private Set<RelatedShoopingPlace> KRelatedShootingPlaces = new HashSet<RelatedShoopingPlace>(0);

     // Constructors

    /** default constructor */
    public ShootingPlace() {
    }

	/** minimal constructor */
    public ShootingPlace(Integer placeId) {
        this.placeId = placeId;
    }
    /** full constructor */
    public ShootingPlace(Integer placeId, String shootingPlace, String shootingPlaceTransportation, String shootingPlaceContact, String shootingPlaceDetail, String shootingPlaceImagePath, Integer posid, Set<RelatedShoopingPlace> KRelatedShootingPlaces) {
       this.placeId = placeId;
       this.shootingPlace = shootingPlace;
       this.shootingPlaceTransportation = shootingPlaceTransportation;
       this.shootingPlaceContact = shootingPlaceContact;
       this.shootingPlaceDetail = shootingPlaceDetail;
       this.shootingPlaceImagePath = shootingPlaceImagePath;
       this.posid = posid;
       this.KRelatedShootingPlaces = KRelatedShootingPlaces;
    }
   
    // Property accessors
     @Id
    
    @Column(name="PLACE_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getPlaceId() {
        return this.placeId;
    }
    
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }
    
    @Column(name="SHOOTING_PLACE", unique=false, nullable=true, insertable=true, updatable=true)
    public String getShootingPlace() {
        return this.shootingPlace;
    }
    
    public void setShootingPlace(String shootingPlace) {
        this.shootingPlace = shootingPlace;
    }
    
    @Column(name="SHOOTING_PLACE_TRANSPORTATION", unique=false, nullable=true, insertable=true, updatable=true)
    public String getShootingPlaceTransportation() {
        return this.shootingPlaceTransportation;
    }
    
    public void setShootingPlaceTransportation(String shootingPlaceTransportation) {
        this.shootingPlaceTransportation = shootingPlaceTransportation;
    }
    
    @Column(name="SHOOTING_PLACE_CONTACT", unique=false, nullable=true, insertable=true, updatable=true)
    public String getShootingPlaceContact() {
        return this.shootingPlaceContact;
    }
    
    public void setShootingPlaceContact(String shootingPlaceContact) {
        this.shootingPlaceContact = shootingPlaceContact;
    }
    
    @Column(name="SHOOTING_PLACE_DETAIL", unique=false, nullable=true, insertable=true, updatable=true)
    public String getShootingPlaceDetail() {
        return this.shootingPlaceDetail;
    }
    
    public void setShootingPlaceDetail(String shootingPlaceDetail) {
        this.shootingPlaceDetail = shootingPlaceDetail;
    }
    
    @Column(name="SHOOTING_PLACE_IMAGE_PATH", unique=false, nullable=true, insertable=true, updatable=true)
    public String getShootingPlaceImagePath() {
        return this.shootingPlaceImagePath;
    }
    
    public void setShootingPlaceImagePath(String shootingPlaceImagePath) {
        this.shootingPlaceImagePath = shootingPlaceImagePath;
    }
    
    @Column(name="POSID", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getPosid() {
        return this.posid;
    }
    
    public void setPosid(Integer posid) {
        this.posid = posid;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="shootingPlace")
    public Set<RelatedShoopingPlace> getKRelatedShootingPlaces() {
        return this.KRelatedShootingPlaces;
    }
    
    public void setKRelatedShootingPlaces(Set<RelatedShoopingPlace> KRelatedShootingPlaces) {
        this.KRelatedShootingPlaces = KRelatedShootingPlaces;
    }




}


