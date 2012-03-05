package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Script;

public class ScriptTest extends BaseTest{
	@Test
	public void selectFromContent(){
		try{
		Transaction tx = session.beginTransaction();
		
		List<Content> list = session.createQuery("from Content where rownum < 5").list();
		
		for(Content content : list){
			Script script = content.getScript();
			System.out.println(script.getScriptFilePath());
		}
		tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void selectFromCaption(){
		try{
		Transaction tx = session.beginTransaction();
		
		List<Script> list = session.createQuery("from Script where rownum < 5").list();
		
		for(Script script : list){
			
			System.out.println(script.getScriptFilePath());
			System.out.println(script.getContent().getContentId());
		}
		tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
