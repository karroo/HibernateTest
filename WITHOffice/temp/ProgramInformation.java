// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


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
 * ProgramInformation generated by hbm2java
 */
@Entity
@Table(name="K_PROGRAM_INFORMATION"
    ,schema="KBSTRI"
)
public class ProgramInformation  implements java.io.Serializable {

    // Fields    

     private ProgramInformationId id;
     private Member member;
     private Integer fileid;
     private String informationTitle;
     private String informationContents;
     private Integer photoid;

     // Constructors

    /** default constructor */
    public ProgramInformation() {
    }

	/** minimal constructor */
    public ProgramInformation(ProgramInformationId id, Member member) {
        this.id = id;
        this.member = member;
    }
    /** full constructor */
    public ProgramInformation(ProgramInformationId id, Member member, Integer fileid, String informationTitle, String informationContents, Integer photoid) {
       this.id = id;
       this.member = member;
       this.fileid = fileid;
       this.informationTitle = informationTitle;
       this.informationContents = informationContents;
       this.photoid = photoid;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="memberid", column=@Column(name="MEMBERID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="contentId", column=@Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public ProgramInformationId getId() {
        return this.id;
    }
    
    public void setId(ProgramInformationId id) {
        this.id = id;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="MEMBERID", unique=false, nullable=false, insertable=false, updatable=false)
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
    
    @Column(name="FILEID", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getFileid() {
        return this.fileid;
    }
    
    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }
    
    @Column(name="INFORMATION_TITLE", unique=false, nullable=true, insertable=true, updatable=true)
    public String getInformationTitle() {
        return this.informationTitle;
    }
    
    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle;
    }
    
    @Column(name="INFORMATION_CONTENTS", unique=false, nullable=true, insertable=true, updatable=true)
    public String getInformationContents() {
        return this.informationContents;
    }
    
    public void setInformationContents(String informationContents) {
        this.informationContents = informationContents;
    }
    
    @Column(name="PHOTOID", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getPhotoid() {
        return this.photoid;
    }
    
    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }




}


