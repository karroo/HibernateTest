package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Member generated by hbm2java
 */
@Entity
@Table(name="T_MEMBER"
    ,schema="KBSTRI"
)
public class Member  implements java.io.Serializable {

    // Fields    

     private Integer memberid;
     private Object TObject;
     private String authkey;
     private String loginid;
     private String loginpwd;
     private String name;
     private Integer articlenewscount;
     private String friendnewscount;
     private String friendcount;
     private String joinclubcount;
     private Integer followingcount;
     private BigDecimal followercount;
     private Set<CustomChannel> customChannelBookmark = new HashSet<CustomChannel>(0);
     private Set<SurveyParticipation> surveyParticipations = new HashSet<SurveyParticipation>(0);
     private Set<QuizParticipation> quizParticipations = new HashSet<QuizParticipation>(0);
     private Set<ProgramInformation> programInformations = new HashSet<ProgramInformation>(0);
     private Set<Content> myVideos = new HashSet<Content>(0);
     private Set<Content> contentSuggestion = new HashSet<Content>(0);

     // Constructors

    /** default constructor */
    public Member() {
    }

	/** minimal constructor */
    public Member(Integer memberid, Object TObject, Integer articlenewscount, String friendnewscount, String friendcount, String joinclubcount, Integer followingcount, BigDecimal followercount) {
        this.memberid = memberid;
        this.TObject = TObject;
        this.articlenewscount = articlenewscount;
        this.friendnewscount = friendnewscount;
        this.friendcount = friendcount;
        this.joinclubcount = joinclubcount;
        this.followingcount = followingcount;
        this.followercount = followercount;
    }
    /** full constructor */
    public Member(Integer memberid, Object TObject, String authkey, String loginid, String loginpwd, String name, Integer articlenewscount, String friendnewscount, String friendcount, String joinclubcount, Integer followingcount, BigDecimal followercount, Set<CustomChannel> customChannelBookmark, Set<SurveyParticipation> surveyParticipations, Set<QuizParticipation> quizParticipations, Set<ProgramInformation> programInformations, Set<Content> myVideos, Set<Content> contentSuggestion) {
       this.memberid = memberid;
       this.TObject = TObject;
       this.authkey = authkey;
       this.loginid = loginid;
       this.loginpwd = loginpwd;
       this.name = name;
       this.articlenewscount = articlenewscount;
       this.friendnewscount = friendnewscount;
       this.friendcount = friendcount;
       this.joinclubcount = joinclubcount;
       this.followingcount = followingcount;
       this.followercount = followercount;
       this.customChannelBookmark = customChannelBookmark;
       this.surveyParticipations = surveyParticipations;
       this.quizParticipations = quizParticipations;
       this.programInformations = programInformations;
       this.myVideos = myVideos;
       this.contentSuggestion = contentSuggestion;
    }
   
    // Property accessors
     @Id
    
    @Column(name="MEMBERID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getMemberid() {
        return this.memberid;
    }
    
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="MEMBERID", unique=true, nullable=false, insertable=false, updatable=false)
    public Object getTObject() {
        return this.TObject;
    }
    
    public void setTObject(Object TObject) {
        this.TObject = TObject;
    }
    
    @Column(name="AUTHKEY", unique=false, nullable=true, insertable=true, updatable=true, length=64)
    public String getAuthkey() {
        return this.authkey;
    }
    
    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }
    
    @Column(name="LOGINID", unique=false, nullable=true, insertable=true, updatable=true, length=64)
    public String getLoginid() {
        return this.loginid;
    }
    
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }
    
    @Column(name="LOGINPWD", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getLoginpwd() {
        return this.loginpwd;
    }
    
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }
    
    @Column(name="NAME", unique=false, nullable=true, insertable=true, updatable=true)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="ARTICLENEWSCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getArticlenewscount() {
        return this.articlenewscount;
    }
    
    public void setArticlenewscount(Integer articlenewscount) {
        this.articlenewscount = articlenewscount;
    }
    
    @Column(name="FRIENDNEWSCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public String getFriendnewscount() {
        return this.friendnewscount;
    }
    
    public void setFriendnewscount(String friendnewscount) {
        this.friendnewscount = friendnewscount;
    }
    
    @Column(name="FRIENDCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public String getFriendcount() {
        return this.friendcount;
    }
    
    public void setFriendcount(String friendcount) {
        this.friendcount = friendcount;
    }
    
    @Column(name="JOINCLUBCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public String getJoinclubcount() {
        return this.joinclubcount;
    }
    
    public void setJoinclubcount(String joinclubcount) {
        this.joinclubcount = joinclubcount;
    }
    
    @Column(name="FOLLOWINGCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getFollowingcount() {
        return this.followingcount;
    }
    
    public void setFollowingcount(Integer followingcount) {
        this.followingcount = followingcount;
    }
    
    @Column(name="FOLLOWERCOUNT", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public BigDecimal getFollowercount() {
        return this.followercount;
    }
    
    public void setFollowercount(BigDecimal followercount) {
        this.followercount = followercount;
    }
    @ManyToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="customChannelBookmark")
    public Set<CustomChannel> getCustomChannelBookmark() {
        return this.customChannelBookmark;
    }
    
    public void setCustomChannelBookmark(Set<CustomChannel> customChannelBookmark) {
        this.customChannelBookmark = customChannelBookmark;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="member")
    public Set<SurveyParticipation> getSurveyParticipations() {
        return this.surveyParticipations;
    }
    
    public void setSurveyParticipations(Set<SurveyParticipation> surveyParticipations) {
        this.surveyParticipations = surveyParticipations;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="member")
    public Set<QuizParticipation> getQuizParticipations() {
        return this.quizParticipations;
    }
    
    public void setQuizParticipations(Set<QuizParticipation> quizParticipations) {
        this.quizParticipations = quizParticipations;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="member")
    public Set<ProgramInformation> getProgramInformations() {
        return this.programInformations;
    }
    
    public void setProgramInformations(Set<ProgramInformation> programInformations) {
        this.programInformations = programInformations;
    }
    @ManyToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="contentSuggestion")
    public Set<Content> getMyVideos() {
        return this.myVideos;
    }
    
    public void setMyVideos(Set<Content> myVideos) {
        this.myVideos = myVideos;
    }
    @ManyToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="contentSuggestion")
    public Set<Content> getContentSuggestion() {
        return this.contentSuggestion;
    }
    
    public void setContentSuggestion(Set<Content> contentSuggestion) {
        this.contentSuggestion = contentSuggestion;
    }




}


