package com.mindwareworks.kbs.dao;

import java.util.List;

import com.mindwareworks.kbs.model.Script;

public interface ScriptDAO extends GenericDAO<Script,Integer>{
	public List<Script> searchByTitle(String search);
	public List<Script> searchPageByTitle(String search,int page,int pageSize);
}
