// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RelatedRecipeId generated by hbm2java
 */
@Embeddable
public class RelatedRecipeId  implements java.io.Serializable {

    // Fields    

     private Integer recipeId;
     private Integer contentId;

     // Constructors

    /** default constructor */
    public RelatedRecipeId() {
    }

    /** full constructor */
    public RelatedRecipeId(Integer recipeId, Integer contentId) {
       this.recipeId = recipeId;
       this.contentId = contentId;
    }
   
    // Property accessors

    @Column(name="RECIPE_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getRecipeId() {
        return this.recipeId;
    }
    
    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }




}


