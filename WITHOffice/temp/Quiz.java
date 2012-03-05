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
 * Quiz generated by hbm2java
 */
@Entity
@Table(name="K_RELATED_QUIZ"
    ,schema="KBSTRI"
)
public class Quiz  implements java.io.Serializable {

    // Fields    

     private QuizId id;
     private Content content;
     private Question question;
     private Integer startTime;
     private Integer endTime;
     private Set<QuizParticipation> quizParticipations = new HashSet<QuizParticipation>(0);

     // Constructors

    /** default constructor */
    public Quiz() {
    }

	/** minimal constructor */
    public Quiz(QuizId id, Content content, Question question) {
        this.id = id;
        this.content = content;
        this.question = question;
    }
    /** full constructor */
    public Quiz(QuizId id, Content content, Question question, Integer startTime, Integer endTime, Set<QuizParticipation> quizParticipations) {
       this.id = id;
       this.content = content;
       this.question = question;
       this.startTime = startTime;
       this.endTime = endTime;
       this.quizParticipations = quizParticipations;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="questionId", column=@Column(name="QUESTION_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="contentId", column=@Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public QuizId getId() {
        return this.id;
    }
    
    public void setId(QuizId id) {
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
    
    @JoinColumn(name="QUESTION_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public Question getQuestion() {
        return this.question;
    }
    
    public void setQuestion(Question question) {
        this.question = question;
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
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="relatedQuiz")
    public Set<QuizParticipation> getQuizParticipations() {
        return this.quizParticipations;
    }
    
    public void setQuizParticipations(Set<QuizParticipation> quizParticipations) {
        this.quizParticipations = quizParticipations;
    }




}


