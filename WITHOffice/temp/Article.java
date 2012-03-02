// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Article generated by hbm2java
 */
@Entity
@Table(name="T_ARTICLE"
    ,schema="KBSTRI"
)
public class Article  implements java.io.Serializable {

    // Fields    

     private Integer articleid;
     private ObjectCategory objectCategory;
     private Object object;
     private Integer pubtype;
     private Integer sourceid;
     private String title;
     private String articlebody;
     private Integer commentcount;
     private Integer likecount;
     private Integer textcount;
     private Integer positioncount;
     private Integer filecount;
     private Integer photocount;
     private Integer contentscount;
     private Boolean ishide;
     private Date regdate;
     private Integer lastphotoid;
     private Integer lastposid;
     private Integer lastfileid;
     private Integer lasttextid;
     private Integer lastcontentsid;
     private Integer statuscode;
     private Integer urlcount;
     private Integer lasturlid;
     private Set<Content> contents = new HashSet<Content>(0);

     // Constructors

    /** default constructor */
    public Article() {
    }

	/** minimal constructor */
    public Article(Integer articleid, Integer commentcount, Integer likecount, Integer textcount, Integer positioncount, Integer filecount, Integer photocount, Integer contentscount, Boolean ishide, Date regdate, Integer statuscode, Integer urlcount) {
        this.articleid = articleid;
        this.commentcount = commentcount;
        this.likecount = likecount;
        this.textcount = textcount;
        this.positioncount = positioncount;
        this.filecount = filecount;
        this.photocount = photocount;
        this.contentscount = contentscount;
        this.ishide = ishide;
        this.regdate = regdate;
        this.statuscode = statuscode;
        this.urlcount = urlcount;
    }
    /** full constructor */
    public Article(Integer articleid, ObjectCategory objectCategory, Object object, Integer pubtype, Integer sourceid, String title, String articlebody, Integer commentcount, Integer likecount, Integer textcount, Integer positioncount, Integer filecount, Integer photocount, Integer contentscount, Boolean ishide, Date regdate, Integer lastphotoid, Integer lastposid, Integer lastfileid, Integer lasttextid, Integer lastcontentsid, Integer statuscode, Integer urlcount, Integer lasturlid, Set<Content> contents) {
       this.articleid = articleid;
       this.objectCategory = objectCategory;
       this.object = object;
       this.pubtype = pubtype;
       this.sourceid = sourceid;
       this.title = title;
       this.articlebody = articlebody;
       this.commentcount = commentcount;
       this.likecount = likecount;
       this.textcount = textcount;
       this.positioncount = positioncount;
       this.filecount = filecount;
       this.photocount = photocount;
       this.contentscount = contentscount;
       this.ishide = ishide;
       this.regdate = regdate;
       this.lastphotoid = lastphotoid;
       this.lastposid = lastposid;
       this.lastfileid = lastfileid;
       this.lasttextid = lasttextid;
       this.lastcontentsid = lastcontentsid;
       this.statuscode = statuscode;
       this.urlcount = urlcount;
       this.lasturlid = lasturlid;
       this.contents = contents;
    }
   
    // Property accessors
     @Id
    
    @Column(name="ARTICLEID", unique=false, nullable=false, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getArticleid() {
        return this.articleid;
    }
    
    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumns( { 
        @JoinColumn(name="AUTHORID", unique=false, nullable=true, insertable=true, updatable=true), 
        @JoinColumn(name="CATEGORYID", unique=false, nullable=true, insertable=true, updatable=true) } )
    public ObjectCategory getObjectCategory() {
        return this.objectCategory;
    }
    
    public void setObjectCategory(ObjectCategory objectCategory) {
        this.objectCategory = objectCategory;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="AUTHORID", unique=false, nullable=true, insertable=false, updatable=false)
    public Object getObject() {
        return this.object;
    }
    
    public void setObject(Object object) {
        this.object = object;
    }
    
    @Column(name="PUBTYPE", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getPubtype() {
        return this.pubtype;
    }
    
    public void setPubtype(Integer pubtype) {
        this.pubtype = pubtype;
    }
    
    @Column(name="SOURCEID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getSourceid() {
        return this.sourceid;
    }
    
    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }
    
    @Column(name="TITLE", unique=false, nullable=true, insertable=true, updatable=true)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="ARTICLEBODY", unique=false, nullable=true, insertable=true, updatable=true)
    public String getArticlebody() {
        return this.articlebody;
    }
    
    public void setArticlebody(String articlebody) {
        this.articlebody = articlebody;
    }
    
    @Column(name="COMMENTCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getCommentcount() {
        return this.commentcount;
    }
    
    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }
    
    @Column(name="LIKECOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getLikecount() {
        return this.likecount;
    }
    
    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }
    
    @Column(name="TEXTCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getTextcount() {
        return this.textcount;
    }
    
    public void setTextcount(Integer textcount) {
        this.textcount = textcount;
    }
    
    @Column(name="POSITIONCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getPositioncount() {
        return this.positioncount;
    }
    
    public void setPositioncount(Integer positioncount) {
        this.positioncount = positioncount;
    }
    
    @Column(name="FILECOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getFilecount() {
        return this.filecount;
    }
    
    public void setFilecount(Integer filecount) {
        this.filecount = filecount;
    }
    
    @Column(name="PHOTOCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getPhotocount() {
        return this.photocount;
    }
    
    public void setPhotocount(Integer photocount) {
        this.photocount = photocount;
    }
    
    @Column(name="CONTENTSCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getContentscount() {
        return this.contentscount;
    }
    
    public void setContentscount(Integer contentscount) {
        this.contentscount = contentscount;
    }
    
    @Column(name="ISHIDE", unique=false, nullable=false, insertable=true, updatable=true, length=1)
    public Boolean getIshide() {
        return this.ishide;
    }
    
    public void setIshide(Boolean ishide) {
        this.ishide = ishide;
    }
    
    @Column(name="REGDATE", unique=false, nullable=false, insertable=true, updatable=true, length=7)
    public Date getRegdate() {
        return this.regdate;
    }
    
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    
    @Column(name="LASTPHOTOID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getLastphotoid() {
        return this.lastphotoid;
    }
    
    public void setLastphotoid(Integer lastphotoid) {
        this.lastphotoid = lastphotoid;
    }
    
    @Column(name="LASTPOSID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getLastposid() {
        return this.lastposid;
    }
    
    public void setLastposid(Integer lastposid) {
        this.lastposid = lastposid;
    }
    
    @Column(name="LASTFILEID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getLastfileid() {
        return this.lastfileid;
    }
    
    public void setLastfileid(Integer lastfileid) {
        this.lastfileid = lastfileid;
    }
    
    @Column(name="LASTTEXTID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getLasttextid() {
        return this.lasttextid;
    }
    
    public void setLasttextid(Integer lasttextid) {
        this.lasttextid = lasttextid;
    }
    
    @Column(name="LASTCONTENTSID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getLastcontentsid() {
        return this.lastcontentsid;
    }
    
    public void setLastcontentsid(Integer lastcontentsid) {
        this.lastcontentsid = lastcontentsid;
    }
    
    @Column(name="STATUSCODE", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getStatuscode() {
        return this.statuscode;
    }
    
    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }
    
    @Column(name="URLCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getUrlcount() {
        return this.urlcount;
    }
    
    public void setUrlcount(Integer urlcount) {
        this.urlcount = urlcount;
    }
    
    @Column(name="LASTURLID", unique=false, nullable=true, insertable=true, updatable=true, precision=126, scale=0)
    public Integer getLasturlid() {
        return this.lasturlid;
    }
    
    public void setLasturlid(Integer lasturlid) {
        this.lasturlid = lasturlid;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="article")
    public Set<Content> getContents() {
        return this.contents;
    }
    
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }




}

