package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AnswerExampleId generated by hbm2java
 */
@Embeddable
public class AnswerExampleId  implements java.io.Serializable {

    // Fields    

     private Integer questionId;
     private Integer exampleNumber;

     // Constructors

    /** default constructor */
    public AnswerExampleId() {
    }

    /** full constructor */
    public AnswerExampleId(Integer questionId, Integer exampleNumber) {
       this.questionId = questionId;
       this.exampleNumber = exampleNumber;
    }
   
    // Property accessors

    @Column(name="QUESTION_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    @Column(name="EXAMPLE_NUMBER", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getExampleNumber() {
        return this.exampleNumber;
    }
    
    public void setExampleNumber(Integer exampleNumber) {
        this.exampleNumber = exampleNumber;
    }




}

