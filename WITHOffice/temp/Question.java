// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name="K_QUESTION"
    ,schema="KBSTRI"
)
public class Question  implements java.io.Serializable {

    // Fields    

     private Integer questionId;
     private Integer point;
     private Serializable questionContents;
     private String questionType;
     private Set<Quiz> relatedQuizs = new HashSet<Quiz>(0);
     private Set<AnswerExample> answerExamples = new HashSet<AnswerExample>(0);
     private Set<RelatedSurvey> relatedSurveies = new HashSet<RelatedSurvey>(0);
     private Set<CorrectAnswer> correctAnswers = new HashSet<CorrectAnswer>(0);

     // Constructors

    /** default constructor */
    public Question() {
    }

	/** minimal constructor */
    public Question(Integer questionId) {
        this.questionId = questionId;
    }
    /** full constructor */
    public Question(Integer questionId, Integer point, Serializable questionContents, String questionType, Set<Quiz> relatedQuizs, Set<AnswerExample> answerExamples, Set<RelatedSurvey> relatedSurveies, Set<CorrectAnswer> correctAnswers) {
       this.questionId = questionId;
       this.point = point;
       this.questionContents = questionContents;
       this.questionType = questionType;
       this.relatedQuizs = relatedQuizs;
       this.answerExamples = answerExamples;
       this.relatedSurveies = relatedSurveies;
       this.correctAnswers = correctAnswers;
    }
   
    // Property accessors
     @Id
    
    @Column(name="QUESTION_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
    
    @Column(name="POINT", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getPoint() {
        return this.point;
    }
    
    public void setPoint(Integer point) {
        this.point = point;
    }
    
    @Column(name="QUESTION_CONTENTS", unique=false, nullable=true, insertable=true, updatable=true)
    public Serializable getQuestionContents() {
        return this.questionContents;
    }
    
    public void setQuestionContents(Serializable questionContents) {
        this.questionContents = questionContents;
    }
    
    @Column(name="QUESTION_TYPE", unique=false, nullable=true, insertable=true, updatable=true, length=1)
    public String getQuestionType() {
        return this.questionType;
    }
    
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="question")
    public Set<Quiz> getRelatedQuizs() {
        return this.relatedQuizs;
    }
    
    public void setRelatedQuizs(Set<Quiz> relatedQuizs) {
        this.relatedQuizs = relatedQuizs;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="question")
    public Set<AnswerExample> getAnswerExamples() {
        return this.answerExamples;
    }
    
    public void setAnswerExamples(Set<AnswerExample> answerExamples) {
        this.answerExamples = answerExamples;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="question")
    public Set<RelatedSurvey> getRelatedSurveies() {
        return this.relatedSurveies;
    }
    
    public void setRelatedSurveies(Set<RelatedSurvey> relatedSurveies) {
        this.relatedSurveies = relatedSurveies;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="question")
    public Set<CorrectAnswer> getCorrectAnswers() {
        return this.correctAnswers;
    }
    
    public void setCorrectAnswers(Set<CorrectAnswer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("questionId").append("='").append(getQuestionId()).append("' ");			
      buffer.append("point").append("='").append(getPoint()).append("' ");			
      buffer.append("questionContents").append("='").append(getQuestionContents()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


