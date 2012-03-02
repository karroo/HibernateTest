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
 * RelatedRecipe generated by hbm2java
 */
@Entity
@Table(name="K_RELATED_RECIPE"
    ,schema="KBSTRI"
)
public class RelatedRecipe  implements java.io.Serializable {

    // Fields    

     private RelatedRecipeId id;
     private Recipe recipe;
     private Content content;
     private Integer startTime;
     private Integer endTime;

     // Constructors

    /** default constructor */
    public RelatedRecipe() {
    }

	/** minimal constructor */
    public RelatedRecipe(RelatedRecipeId id, Recipe recipe, Content content) {
        this.id = id;
        this.recipe = recipe;
        this.content = content;
    }
    /** full constructor */
    public RelatedRecipe(RelatedRecipeId id, Recipe recipe, Content content, Integer startTime, Integer endTime) {
       this.id = id;
       this.recipe = recipe;
       this.content = content;
       this.startTime = startTime;
       this.endTime = endTime;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="recipeId", column=@Column(name="RECIPE_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="contentId", column=@Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public RelatedRecipeId getId() {
        return this.id;
    }
    
    public void setId(RelatedRecipeId id) {
        this.id = id;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="RECIPE_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public Recipe getRecipe() {
        return this.recipe;
    }
    
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
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

