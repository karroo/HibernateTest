package com.mindwareworks.kbs.dao.hibernate;

import java.util.List;

import com.mindwareworks.kbs.dao.GenericHibernateDAO;
import com.mindwareworks.kbs.dao.QuestionDAO;
import com.mindwareworks.kbs.model.Question;


public class QuestionHibernateDAO extends GenericHibernateDAO<Question,Integer> implements QuestionDAO {
	@Override
	public List<Question> searchByTitle(String search) {
		// TODO Auto-generated method stub
		return super.search("questionContents", search);
	}

	@Override
	public List<Question> searchPageByTitle(String search,int page,int pageSize) {
		// TODO Auto-generated method stub
		return super.searchPage(page, pageSize, "questionContents", search);
	}
	

	

}
