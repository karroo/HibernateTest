package com.mindwareworks.kbs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindwareworks.kbs.model.Program;
import com.mindwareworks.kbs.util.HibernateUtil;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		List<Program> programs = session.createQuery("from Program m where m.contentId = '346323'").list();
		
		Program program = programs.get(0);
		program.setInformationPossibleYn(false);
		session.save(program);
		
		programs = session.createQuery("from Program m where m.contentId = '346323'").list();
		program = programs.get(0);
		
		System.out.println(program.getInformationPossibleYn());
		tx.commit();
		session.close();
		
		
		
	}

}
