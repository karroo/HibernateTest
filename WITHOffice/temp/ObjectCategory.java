// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ObjectCategory generated by hbm2java
 */
@Entity
@Table(name="T_OBJECTCATEGORY"
    ,schema="KBSTRI"
)
public class ObjectCategory  implements java.io.Serializable {

    // Fields    

     private ObjectCategoryId id;
     private Object object;
     private String categoryname;
     private String depth1;
     private String depth2;
     private String depth3;
     private String depth4;
     private Integer allowposcount;
     private Integer allowphotocount;
     private Integer allowfilecount;
     private Integer allowtextcount;
     private Integer allowcontentscount;
     private Integer allowurlcount;
     private Integer articlecount;
     private Set<Article> articles = new HashSet<Article>(0);
     private Set<Content> contents = new HashSet<Content>(0);

     // Constructors

    /** default constructor */
    public ObjectCategory() {
    }

	/** minimal constructor */
    public ObjectCategory(ObjectCategoryId id, Object object, Integer allowposcount, Integer allowphotocount, Integer allowfilecount, Integer allowtextcount, Integer allowcontentscount, Integer allowurlcount, Integer articlecount) {
        this.id = id;
        this.object = object;
        this.allowposcount = allowposcount;
        this.allowphotocount = allowphotocount;
        this.allowfilecount = allowfilecount;
        this.allowtextcount = allowtextcount;
        this.allowcontentscount = allowcontentscount;
        this.allowurlcount = allowurlcount;
        this.articlecount = articlecount;
    }
    /** full constructor */
    public ObjectCategory(ObjectCategoryId id, Object object, String categoryname, String depth1, String depth2, String depth3, String depth4, Integer allowposcount, Integer allowphotocount, Integer allowfilecount, Integer allowtextcount, Integer allowcontentscount, Integer allowurlcount, Integer articlecount, Set<Article> articles, Set<Content> contents) {
       this.id = id;
       this.object = object;
       this.categoryname = categoryname;
       this.depth1 = depth1;
       this.depth2 = depth2;
       this.depth3 = depth3;
       this.depth4 = depth4;
       this.allowposcount = allowposcount;
       this.allowphotocount = allowphotocount;
       this.allowfilecount = allowfilecount;
       this.allowtextcount = allowtextcount;
       this.allowcontentscount = allowcontentscount;
       this.allowurlcount = allowurlcount;
       this.articlecount = articlecount;
       this.articles = articles;
       this.contents = contents;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="objid", column=@Column(name="OBJID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="categoryid", column=@Column(name="CATEGORYID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public ObjectCategoryId getId() {
        return this.id;
    }
    
    public void setId(ObjectCategoryId id) {
        this.id = id;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="OBJID", unique=false, nullable=false, insertable=false, updatable=false)
    public Object getObject() {
        return this.object;
    }
    
    public void setObject(Object object) {
        this.object = object;
    }
    
    @Column(name="CATEGORYNAME", unique=false, nullable=true, insertable=true, updatable=true)
    public String getCategoryname() {
        return this.categoryname;
    }
    
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
    
    @Column(name="DEPTH1", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getDepth1() {
        return this.depth1;
    }
    
    public void setDepth1(String depth1) {
        this.depth1 = depth1;
    }
    
    @Column(name="DEPTH2", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getDepth2() {
        return this.depth2;
    }
    
    public void setDepth2(String depth2) {
        this.depth2 = depth2;
    }
    
    @Column(name="DEPTH3", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getDepth3() {
        return this.depth3;
    }
    
    public void setDepth3(String depth3) {
        this.depth3 = depth3;
    }
    
    @Column(name="DEPTH4", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getDepth4() {
        return this.depth4;
    }
    
    public void setDepth4(String depth4) {
        this.depth4 = depth4;
    }
    
    @Column(name="ALLOWPOSCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getAllowposcount() {
        return this.allowposcount;
    }
    
    public void setAllowposcount(Integer allowposcount) {
        this.allowposcount = allowposcount;
    }
    
    @Column(name="ALLOWPHOTOCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getAllowphotocount() {
        return this.allowphotocount;
    }
    
    public void setAllowphotocount(Integer allowphotocount) {
        this.allowphotocount = allowphotocount;
    }
    
    @Column(name="ALLOWFILECOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getAllowfilecount() {
        return this.allowfilecount;
    }
    
    public void setAllowfilecount(Integer allowfilecount) {
        this.allowfilecount = allowfilecount;
    }
    
    @Column(name="ALLOWTEXTCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getAllowtextcount() {
        return this.allowtextcount;
    }
    
    public void setAllowtextcount(Integer allowtextcount) {
        this.allowtextcount = allowtextcount;
    }
    
    @Column(name="ALLOWCONTENTSCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getAllowcontentscount() {
        return this.allowcontentscount;
    }
    
    public void setAllowcontentscount(Integer allowcontentscount) {
        this.allowcontentscount = allowcontentscount;
    }
    
    @Column(name="ALLOWURLCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getAllowurlcount() {
        return this.allowurlcount;
    }
    
    public void setAllowurlcount(Integer allowurlcount) {
        this.allowurlcount = allowurlcount;
    }
    
    @Column(name="ARTICLECOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getArticlecount() {
        return this.articlecount;
    }
    
    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="objectCategory")
    public Set<Article> getArticles() {
        return this.articles;
    }
    
    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="objectCategory")
    public Set<Content> getContents() {
        return this.contents;
    }
    
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }




}


