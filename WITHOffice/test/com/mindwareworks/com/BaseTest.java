package com.mindwareworks.com;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Program;
import com.mindwareworks.kbs.model.ProgramCode;
import com.mindwareworks.kbs.util.HibernateUtil;


public class BaseTest {

	static Session session;
	@BeforeClass
	public static void createSession(){
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	@Test
	public void getProgram(){
		Transaction tx  = session.beginTransaction();
		List<Program> programs = session.createQuery("from Program where contentId =441310").list();
		System.out.println(programs.get(0).getContentId());
		tx.commit();
	}
	@Test
	public void createProgram(){
		Transaction tx = session.beginTransaction();
		Program program = new Program();
		program.setProgramCode("T2011-0435");
		program.setProgramId("PS-2012019689-01-000");
		
		session.save(program);
		System.out.println(program.getContentId());
		tx.commit();
	}
	@Test
	public void createContent(){
		Transaction tx = session.beginTransaction();
		Content content = new Content();
		content.setContentKind("1");
		content.setObjId("");
		content.setCategoryId("");
		content.setArticleId("");
		
		session.save(content);
		System.out.println(content.getContentId());
		tx.commit();
	}
	@Test
	public void getProgramCode(){
		Transaction tx = session.beginTransaction();
		Query query   = session.createQuery("from ProgramCode ");
		query.setMaxResults(10);
		query.setFirstResult(20);
		List<ProgramCode> codes = query.list();
		
		for(int i=0;i<codes.size();i++){
			System.out.println(codes.get(i).getProgramCode());
		}
		
		
		Set<Program> programs = codes.get(0).getPrograms();
		System.out.println(programs);
		
		tx.commit();
	}
	
	@AfterClass
	public static void closeSession(){
		session.close();
	}
}
