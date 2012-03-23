package com.mindwareworks.kbs.dao;

public abstract class DAOFactory {
	public static final Class HIBERNATE =HibernateDAOFactory.class;
	public static DAOFactory instance(Class factory){
		try{
			return (DAOFactory)factory.newInstance();
			
		}catch(Exception ex){
			throw new RuntimeException("cannot create DAOFactory");
		}
	}
	
	public abstract ScriptDAO getScriptDAO();
	public abstract CaptionDAO getCaptionDAO();
	public abstract ContentDAO getContentDAO();
	public abstract QuestionDAO getQuestionDAO();
	
}
