package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Content generated by hbm2java
 */
@Entity
@Table(name="K_CONTENT"
    ,schema="KBSTRI"
)
@org.hibernate.annotations.BatchSize(size=10)
public class Content  implements java.io.Serializable {

    // Fields    

     private String contentId;
     private Article article;
     private ObjectCategory objectCategory;
     private String contentKind;
     private Caption caption;
     private Script script;
     private Set<ContentRanking> contentRankings = new HashSet<ContentRanking>(0);
     private Set<Member> contentSuggestion = new HashSet<Member>(0);
     private Set<Seamless> seamlesses = new HashSet<Seamless>(0);
     private Set<Program> programs = new HashSet<Program>(0);
     private Set<Segment> segments = new HashSet<Segment>(0);
     private Set<Event> events = new HashSet<Event>(0);
     private Set<ChannelItem> channelItems = new HashSet<ChannelItem>(0);
     private Set<Member> myVideo = new HashSet<Member>(0);
     private Set<RelatedQuiz> relatedQuizs = new HashSet<RelatedQuiz>(0);
     private Set<RelatedSurvey> relatedSurveies = new HashSet<RelatedSurvey>(0);
     private Set<RelatedContent> relatedContents = new HashSet<RelatedContent>(0);
     private Set<RelatedPerson> relatedPersons = new HashSet<RelatedPerson>(0);
     private Set<RelatedNews> relatedNewses = new HashSet<RelatedNews>(0);
     private Set<RelatedRecipe> relatedRecipes = new HashSet<RelatedRecipe>(0);
     private Set<RelatedShoopingPlace> relatedShootingPlaces = new HashSet<RelatedShoopingPlace>(0);
     private Set<RelatedProduct> relatedProducts = new HashSet<RelatedProduct>(0);
     private Set<Video> videos = new HashSet<Video>(0);

     // Constructors

    /** default constructor */
    public Content() {
    }

	/** minimal constructor */
    public Content(String contentId) {
        this.contentId = contentId;
    }
   
    // Property accessors
     @Id
    
    @Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="ARTICLEID", unique=false, nullable=true, insertable=true, updatable=true)
    public Article getArticle() {
        return this.article;
    }
    
    public void setArticle(Article article) {
        this.article = article;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumns( { 
        @JoinColumn(name="OBJID", unique=false, nullable=true, insertable=true, updatable=true), 
        @JoinColumn(name="CATEGORYID", unique=false, nullable=true, insertable=true, updatable=true) } )
    public ObjectCategory getObjectCategory() {
        return this.objectCategory;
    }
    
    public void setObjectCategory(ObjectCategory objectCategory) {
        this.objectCategory = objectCategory;
    }
    
    @Column(name="CONTENT_KIND", unique=false, nullable=true, insertable=true, updatable=true, length=1)
    public String getContentKind() {
        return this.contentKind;
    }
    
    public void setContentKind(String contentKind) {
        this.contentKind = contentKind;
    }
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinTable(
    		name="K_RELATED_CAPTION",
    		joinColumns = {@JoinColumn(name="content_id")},
    		inverseJoinColumns = {@JoinColumn(name="caption_id")}
    )
    public Caption getCaption() {
        return this.caption;
    }
    
    public void setCaption(Caption caption) {
        this.caption = caption;
    }
    @OneToOne(fetch=FetchType.LAZY)
    @JoinTable(
    		name="K_RELATED_SCRIPT",
    		joinColumns = {@JoinColumn(name="content_id")},
    		inverseJoinColumns = {@JoinColumn(name="script_id")}
    )
    public Script getScript() {
        return this.script;
    }
    
    public void setScript(Script script) {
        this.script = script;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="content")
    public Set<ContentRanking> getContentRankings() {
        return this.contentRankings;
    }
    
    public void setContentRankings(Set<ContentRanking> contentRankings) {
        this.contentRankings = contentRankings;
    }
    @ManyToMany
    @JoinTable(
    		name="K_CONTENT_SUGGESTION",
    		joinColumns={@JoinColumn(name="content_id")},
    		inverseJoinColumns ={@JoinColumn(name="memberId")}
    		
    )
    public Set<Member> getContentSuggestion() {
        return this.contentSuggestion;
    }
    
    public void setContentSuggestion(Set<Member> contentSuggestion) {
        this.contentSuggestion = contentSuggestion;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="content")
    public Set<Seamless> getSeamlesses() {
        return this.seamlesses;
    }
    
    public void setSeamlesses(Set<Seamless> seamlesses) {
        this.seamlesses = seamlesses;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="content")
    public Set<Program> getPrograms() {
        return this.programs;
    }
    
    public void setPrograms(Set<Program> programs) {
        this.programs = programs;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="content")
    public Set<Segment> getSegments() {
        return this.segments;
    }
    
    public void setSegments(Set<Segment> segments) {
        this.segments = segments;
    }
    @ManyToMany
    @JoinTable(
    		name="K_REALATED_EVENT",
    		joinColumns = {@JoinColumn(name="content_id")},
    		inverseJoinColumns = {@JoinColumn(name="event_id")}
    )
    public Set<Event> getEvents() {
        return this.events;
    }
    
    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="content")
    public Set<ChannelItem> getChannelItems() {
        return this.channelItems;
    }
    
    public void setChannelItems(Set<ChannelItem> channelItems) {
        this.channelItems = channelItems;
    }
    @ManyToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="myVideos")
    public Set<Member> getMyVideo() {
        return this.myVideo;
    }
    
    public void setMyVideo(Set<Member> myVideo) {
        this.myVideo = myVideo;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedQuiz> getRelatedQuizs() {
        return this.relatedQuizs;
    }
    
    public void setRelatedQuizs(Set<RelatedQuiz> relatedQuizs) {
        this.relatedQuizs = relatedQuizs;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedSurvey> getRelatedSurveies() {
        return this.relatedSurveies;
    }
    
    public void setRelatedSurveies(Set<RelatedSurvey> relatedSurveies) {
        this.relatedSurveies = relatedSurveies;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedContent> getRelatedContents() {
        return this.relatedContents;
    }
    
    public void setRelatedContents(Set<RelatedContent> relatedContents) {
        this.relatedContents = relatedContents;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedPerson> getRelatedPersons() {
        return this.relatedPersons;
    }
    
    public void setRelatedPersons(Set<RelatedPerson> relatedPersons) {
        this.relatedPersons = relatedPersons;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedNews> getRelatedNewses() {
        return this.relatedNewses;
    }
    
    public void setRelatedNewses(Set<RelatedNews> relatedNewses) {
        this.relatedNewses = relatedNewses;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size=10)
    public Set<RelatedRecipe> getRelatedRecipes() {
        return this.relatedRecipes;
    }
    
    public void setRelatedRecipes(Set<RelatedRecipe> relatedRecipes) {
        this.relatedRecipes = relatedRecipes;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedShoopingPlace> getRelatedShootingPlaces() {
        return this.relatedShootingPlaces;
    }
    
    public void setRelatedShootingPlaces(Set<RelatedShoopingPlace> relatedShootingPlaces) {
        this.relatedShootingPlaces = relatedShootingPlaces;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<RelatedProduct> getRelatedProducts() {
        return this.relatedProducts;
    }
    
    public void setRelatedProducts(Set<RelatedProduct> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }
    @OneToMany(mappedBy="content")
    @org.hibernate.annotations.BatchSize(size = 10)
    public Set<Video> getVideos() {
        return this.videos;
    }
    
    public void setVideos(Set<Video> videos) {
        this.videos = videos;
    }




}


