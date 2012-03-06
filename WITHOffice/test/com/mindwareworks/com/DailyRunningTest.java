package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.DailyRunning;
import com.mindwareworks.kbs.model.Program;

public class DailyRunningTest extends BaseTest {
	@Test
	public void select(){
		Transaction tx = session.beginTransaction();
		
		List<DailyRunning> programmings = session.createQuery("from DailyRunning where runningDate = '20120215'").list();
		
		for(DailyRunning programming:programmings){
			Program program = programming.getProgram();
			if(program == null) continue;
			System.out.println(programming.getRunningDate()+":"+programming.getStartTime()+":"+program.getProgramTitle());
		}
		
		
		
		tx.commit();
	}
}
