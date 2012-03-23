package com.mindwareworks.com;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.dao.ScriptDAO;
import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.RelatedScript;
import com.mindwareworks.kbs.model.Script;

public class ScriptTest extends BaseTest {
	@Test
	public void selectScriptById(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		Script script = dao.findById(1, false);
		System.out.println(script.getScriptFilePath());
//		Set<RelatedScript> relatedScripts = script.getRelatedScripts();
//		relatedScripts.size();
	}
	
	@Test
	public void selectScriptSearch(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		
		
		List<Script> scripts = dao.searchByTitle("스파이");
		System.out.println(scripts.size());
		List<Script> scripts2 = dao.searchPageByTitle("스파이",1,2);
		System.out.println(scripts2.size());
//		Set<RelatedScript> relatedScripts = script.getRelatedScripts();
//		relatedScripts.size();
	}
	
	@Test
	public void selectScriptPage(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		
		
		List<Script> scripts = dao.findPage(1,2);
		
		
		System.out.println(scripts.size());
//		Set<RelatedScript> relatedScripts = script.getRelatedScripts();
//		relatedScripts.size();
	}

	@Test
	public void selectFromContent() {
		try {
			
			Content content = (Content)session.load(Content.class,644);

			Script script= content.getScript();
			System.out.println(script.getScriptTitle());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void update(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		Script script = dao.findById(1, false);
		script.setScriptFullText("스파이명월이 이뻐~~");
	}
	@Test
	public void insert(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		Script script = dao.makePersistent(new Script("타이틀","경로","내용"));
		
		System.out.println(script.getScriptId());
		
	}
	
	@Test
	public void delete(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		Script script = dao.findById(6, false);
		dao.makeTransient(script);
		
	}
	
	@Test
	public void bindScript(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
		Script script = dao.findById(1,false);
		
		Content content = (Content)session.load(Content.class,"644");

		content.setScript(script);
		
	}
	
	@Test
	public void unbindScript(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ScriptDAO dao = factory.getScriptDAO();
//		Script script = dao.findById(5,false);
		
		Content content = (Content)session.load(Content.class,"644");
		
		content.setScript(null);
		
	}
}
