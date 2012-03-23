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
//
//	@Override
//	public String[] getPropertyNames() {
//		// TODO Auto-generated method stub
//		return new String[]{"example_Number","example"};
//	}
//
//	@Override
//	public Type[] getPropertyTypes() {
//		// TODO Auto-generated method stub
//		return new Type[]{Hibernate.INTEGER,Hibernate.STRING};
//	}
//
//	@Override
//	public java.lang.Object getPropertyValue(java.lang.Object component,
//			int property) throws HibernateException {
//		// TODO Auto-generated method stub
//		
//		AnswerExample ae = (AnswerExample)component;
//		switch(property){
//		case 0:
//			return ae.getExampleNumber();
//		case 1:
//			return ae.getExample();
//		}
//		return null;
//	}
//
//	@Override
//	public void setPropertyValue(java.lang.Object component, int property,
//			java.lang.Object value) throws HibernateException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Class returnedClass() {
//		// TODO Auto-generated method stub
//		return AnswerExample.class;
//	}
//
//	@Override
//	public boolean equals(java.lang.Object x, java.lang.Object y)
//			throws HibernateException {
//		// TODO Auto-generated method stub
//		if(x == null || ! (x instanceof AnswerExample)){
//			return false;
//		}
//		
//		if(y == null || ! (y instanceof AnswerExample)){
//			return false;
//		}
//		
//		AnswerExample xobj = (AnswerExample)x;
//		AnswerExample yobj = (AnswerExample)y;
//		
//		return xobj.equals(yobj);
//	}
//
//	@Override
//	public int hashCode(java.lang.Object x) throws HibernateException {
//		// TODO Auto-generated method stub
//		return x.hashCode();
//	}
//
//	@Override
//	public java.lang.Object nullSafeGet(ResultSet rs, String[] names,
//			SessionImplementor session, java.lang.Object owner)
//			throws HibernateException, SQLException {
//		// TODO Auto-generated method stub
//		int number = rs.getInt(names[0]);
//		String example = rs.getString(names[1]);
//		return new AnswerExample(number,example);
//	}
//
//	@Override
//	public void nullSafeSet(PreparedStatement st, java.lang.Object value,
//			int index, SessionImplementor session) throws HibernateException,
//			SQLException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public java.lang.Object deepCopy(java.lang.Object value)
//			throws HibernateException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isMutable() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public Serializable disassemble(java.lang.Object value,
//			SessionImplementor session) throws HibernateException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public java.lang.Object assemble(Serializable cached,
//			SessionImplementor session, java.lang.Object owner)
//			throws HibernateException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public java.lang.Object replace(java.lang.Object original,
//			java.lang.Object target, SessionImplementor session,
//			java.lang.Object owner) throws HibernateException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
