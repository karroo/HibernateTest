package com.mindwareworks.kbs.model;

// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class AnswerExample implements java.io.Serializable{ //,CompositeUserType {



	private Integer exampleNumber;
	private String example;

	// Constructors

	/** default constructor */
	public AnswerExample() {
	}

	public AnswerExample(Integer exampleNumber,String example){
		this.exampleNumber = exampleNumber;
		this.example = example;
	}
	
	
	@Column(name="EXAMPLE_NUMBER",nullable=false)
	public Integer getExampleNumber() {
		return exampleNumber;
	}

	public void setExampleNumber(Integer exampleNumber) {
		this.exampleNumber = exampleNumber;
	}

	@Column(name="EXAMPLE",nullable=false)
	public String getExample() {
		return this.example;
	}

	public void setExample(String example) {
		this.example = example;
	}
	
	public boolean equals(java.lang.Object object){
		if(object == null || ! (object instanceof AnswerExample)){
			return false;
		}
		
		AnswerExample target = (AnswerExample)object;
		return (target.getExampleNumber().equals(exampleNumber) && 
				target.getExample().equals(example));
	}

	public int hashCode(){
		return exampleNumber.hashCode() | example.hashCode();
	}
	public String toString(){
		return exampleNumber+":"+example;
	}

	
}
