package com.mindwareworks.kbs.model;

// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "K_ANSWER_EXAMPLE", schema = "KBSTRI")
@org.hibernate.annotations.BatchSize(size=10)
public class AnswerExample implements java.io.Serializable {

	// Fields

	private AnswerExampleId id;
	private String example;

	// Constructors

	/** default constructor */
	public AnswerExample() {
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "questionId", column = @Column(name = "QUESTION_ID", unique = false, nullable = false, insertable = true, updatable = true, precision = 0)),
			@AttributeOverride(name = "exampleNumber", column = @Column(name = "EXAMPLE_NUMBER", unique = false, nullable = false, insertable = true, updatable = true, precision = 0)) })
	public AnswerExampleId getId() {
		return this.id;
	}

	public void setId(AnswerExampleId id) {
		this.id = id;
	}

	@Column(name = "EXAMPLE", unique = false, nullable = true, insertable = true, updatable = true)
	public String getExample() {
		return this.example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	/**
	 * toString
	 * 
	 * @return String
	 */
	public String toString() {
		return getId().getExampleNumber()+"='"+getExample()+"'";
	}

}
