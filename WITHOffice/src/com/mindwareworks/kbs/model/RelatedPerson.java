package com.mindwareworks.kbs.model;
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
 * RelatedPerson generated by hbm2java
 */
@Entity
@Table(name="K_RELATED_PERSON"
    ,schema="KBSTRI"
)
public class RelatedPerson  implements java.io.Serializable {

    // Fields    

     private RelatedPersonId id;
     private Content content;
     private Person person;
     private String castingName;
     private String role;
     private String castDescription;
     private String castingImagePath;

     // Constructors

    /** default constructor */
    public RelatedPerson() {
    }

	/** minimal constructor */
    public RelatedPerson(RelatedPersonId id, Content content, Person person) {
        this.id = id;
        this.content = content;
        this.person = person;
    }
    /** full constructor */
    public RelatedPerson(RelatedPersonId id, Content content, Person person, String castingName, String role, String castDescription, String castingImagePath) {
       this.id = id;
       this.content = content;
       this.person = person;
       this.castingName = castingName;
       this.role = role;
       this.castDescription = castDescription;
       this.castingImagePath = castingImagePath;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="personId", column=@Column(name="PERSON_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="contentId", column=@Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public RelatedPersonId getId() {
        return this.id;
    }
    
    public void setId(RelatedPersonId id) {
        this.id = id;
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
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="PERSON_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Column(name="CASTING_NAME", unique=false, nullable=true, insertable=true, updatable=true)
    public String getCastingName() {
        return this.castingName;
    }
    
    public void setCastingName(String castingName) {
        this.castingName = castingName;
    }
    
    @Column(name="ROLE", unique=false, nullable=true, insertable=true, updatable=true)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    @Column(name="CAST_DESCRIPTION", unique=false, nullable=true, insertable=true, updatable=true)
    public String getCastDescription() {
        return this.castDescription;
    }
    
    public void setCastDescription(String castDescription) {
        this.castDescription = castDescription;
    }
    
    @Column(name="CASTING_IMAGE_PATH", unique=false, nullable=true, insertable=true, updatable=true)
    public String getCastingImagePath() {
        return this.castingImagePath;
    }
    
    public void setCastingImagePath(String castingImagePath) {
        this.castingImagePath = castingImagePath;
    }




}


