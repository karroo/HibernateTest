// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuizParticipationId generated by hbm2java
 */
@Embeddable
public class QuizParticipationId  implements java.io.Serializable {

    // Fields    

     private Integer memberid;
     private Integer questionId;
     private Integer contentId;

     // Constructors

    /** default constructor */
    public QuizParticipationId() {
    }

    /** full constructor */
    public QuizParticipationId(Integer memberid, Integer questionId, Integer contentId) {
       this.memberid = memberid;
       this.questionId = questionId;
       this.contentId = contentId;
    }
   
    // Property accessors

    @Column(name="MEMBERID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getMemberid() {
        return this.memberid;
    }
    
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    @Column(name="QUESTION_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    @Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }




}


