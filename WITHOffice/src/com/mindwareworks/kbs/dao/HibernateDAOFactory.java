package com.mindwareworks.kbs.dao;

import com.mindwareworks.kbs.dao.hibernate.CaptionHibernateDAO;
import com.mindwareworks.kbs.dao.hibernate.ContentHibernateDAO;
import com.mindwareworks.kbs.dao.hibernate.QuestionHibernateDAO;
import com.mindwareworks.kbs.dao.hibernate.ScriptHibernateDAO;

public class HibernateDAOFactory extends DAOFactory {

	@Override
	public ScriptDAO getScriptDAO() {
		// TODO Auto-generated method stub
		return (ScriptDAO)instantiateDAO(ScriptHibernateDAO.class);
	}
	@Override
	public CaptionDAO getCaptionDAO() {
		// TODO Auto-generated method stub
		return (CaptionDAO)instantiateDAO(CaptionHibernateDAO.class);
	}
	@Override
	public ContentDAO getContentDAO() {
		// TODO Auto-generated method stub
		return (ContentDAO)instantiateDAO(ContentHibernateDAO.class);
	}
	
	
	private GenericHibernateDAO instantiateDAO(Class daoClass){
		try{
			GenericHibernateDAO dao = (GenericHibernateDAO)daoClass.newInstance();
			return dao;
		}catch(Exception ex){
			throw new RuntimeException("cannot create DAO : "+daoClass,ex);
		}
	}
	@Override
	public QuestionDAO getQuestionDAO() {
		// TODO Auto-generated method stub
		return (QuestionDAO)instantiateDAO(QuestionHibernateDAO.class);
	}
	
	

}
