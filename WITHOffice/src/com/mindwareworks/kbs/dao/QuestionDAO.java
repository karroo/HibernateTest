package com.mindwareworks.kbs.dao;

import java.util.List;

import com.mindwareworks.kbs.model.Question;

public interface QuestionDAO extends GenericDAO<Question,Integer>{
	public List<Question> searchByTitle(String search);
	public List<Question> searchPageByTitle(String search,int page,int pageSize);
	
}
