// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * News generated by hbm2java
 */
@Entity
@Table(name="K_NEWS"
    ,schema="KBSTRI"
)
public class News  implements java.io.Serializable {

    // Fields    

     private Integer newsId;
     private String articleTitle;
     private String articleContents;
     private String articleCategoryName;
     private String internalYn;
     private String articleUrl;
     private Set<RelatedNews> relatedNewses = new HashSet<RelatedNews>(0);

     // Constructors

    /** default constructor */
    public News() {
    }

	/** minimal constructor */
    public News(Integer newsId) {
        this.newsId = newsId;
    }
    /** full constructor */
    public News(Integer newsId, String articleTitle, String articleContents, String articleCategoryName, String internalYn, String articleUrl, Set<RelatedNews> relatedNewses) {
       this.newsId = newsId;
       this.articleTitle = articleTitle;
       this.articleContents = articleContents;
       this.articleCategoryName = articleCategoryName;
       this.internalYn = internalYn;
       this.articleUrl = articleUrl;
       this.relatedNewses = relatedNewses;
    }
   
    // Property accessors
     @Id
    
    @Column(name="NEWS_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getNewsId() {
        return this.newsId;
    }
    
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }
    
    @Column(name="ARTICLE_TITLE", unique=false, nullable=true, insertable=true, updatable=true)
    public String getArticleTitle() {
        return this.articleTitle;
    }
    
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
    
    @Column(name="ARTICLE_CONTENTS", unique=false, nullable=true, insertable=true, updatable=true)
    public String getArticleContents() {
        return this.articleContents;
    }
    
    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents;
    }
    
    @Column(name="ARTICLE_CATEGORY_NAME", unique=false, nullable=true, insertable=true, updatable=true)
    public String getArticleCategoryName() {
        return this.articleCategoryName;
    }
    
    public void setArticleCategoryName(String articleCategoryName) {
        this.articleCategoryName = articleCategoryName;
    }
    
    @Column(name="INTERNAL_YN", unique=false, nullable=true, insertable=true, updatable=true, length=1)
    public String getInternalYn() {
        return this.internalYn;
    }
    
    public void setInternalYn(String internalYn) {
        this.internalYn = internalYn;
    }
    
    @Column(name="ARTICLE_URL", unique=false, nullable=true, insertable=true, updatable=true)
    public String getArticleUrl() {
        return this.articleUrl;
    }
    
    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="news")
    public Set<RelatedNews> getRelatedNewses() {
        return this.relatedNewses;
    }
    
    public void setRelatedNewses(Set<RelatedNews> relatedNewses) {
        this.relatedNewses = relatedNewses;
    }




}


