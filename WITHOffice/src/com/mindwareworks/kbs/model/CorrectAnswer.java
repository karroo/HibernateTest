package com.mindwareworks.kbs.model;

// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * CorrectAnswer generated by hbm2java
 */

@Embeddable
public class CorrectAnswer implements java.io.Serializable {

	// Fields

	private Integer questionId;
	private String answer;

	// Constructors

	/** default constructor */
	public CorrectAnswer() {
	}

	
	public CorrectAnswer(String answer){
		this.answer = answer;
	}
	@Column(name = "ANSWER", unique = false, nullable = true, insertable = true, updatable = true)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean equals(java.lang.Object object){
		if(object == null || !(object instanceof CorrectAnswer)){
			return false;
		}
		
		CorrectAnswer answer = (CorrectAnswer)object;
		return answer.getAnswer().equals(answer);
	}

}
