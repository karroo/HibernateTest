package com.mindwareworks.kbs.dao.hibernate;

import java.util.List;

import com.mindwareworks.kbs.dao.GenericHibernateDAO;
import com.mindwareworks.kbs.dao.ScriptDAO;
import com.mindwareworks.kbs.model.Script;

public class ScriptHibernateDAO extends GenericHibernateDAO<Script,Integer> implements ScriptDAO {

	@Override
	public List<Script> searchByTitle(String search) {
		// TODO Auto-generated method stub
		return super.search("scriptTitle", search);
	}

	@Override
	public List<Script> searchPageByTitle(String search,int page,int pageSize) {
		// TODO Auto-generated method stub
		return super.searchPage(page, pageSize, "scriptTitle", search);
	}

	

}
