package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Program;
import com.mindwareworks.kbs.model.Programming;

public class ProgrammingTest extends BaseTest {
	@Test
	public void select(){
		Transaction tx = session.beginTransaction();
		
		List<Programming> programmings = session.createQuery("from Programming where programPlannedDate between '20120217' and '20120224'").list();
		
		for(Programming programming:programmings){
			Program program = programming.getProgram();
			if(program == null) continue;
			System.out.println(programming.getProgramPlannedDate()+":"+programming.getProgramPlannedStartTime()+":"+program.getProgramTitle());
		}
		
		
		
		tx.commit();
	}
}
