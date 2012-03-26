package com.mindwareworks.com;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.module.hibernate.HibernateModule;
import com.mindwareworks.kbs.model.Program;
import com.mindwareworks.kbs.model.Programming;

public class ProgrammingTest extends BaseTest {
	ObjectMapper mapper=null;
	@Before
	public void readyMapper(){
		mapper = new ObjectMapper();
		mapper.registerModule(new HibernateModule());
	}
	@Test
	public void select() throws Exception{
		Transaction tx = session.beginTransaction();
		Criteria crit = session.createCriteria(Programming.class);
		crit.add(Restrictions.between("programPlannedDate","20120217","20120224"));
		List<Programming> programmings = crit.list();
		
		
		for(Programming programming:programmings){
			Program program = programming.getProgram();
			if(program == null) continue;
			System.out.println(programming.getProgramPlannedDate()+":"+programming.getProgramPlannedStartTime()+":"+program.getProgramTitle());
//			Channel channel = programming.getChannel();
//			channel.getChannelName();
			
//			return;
		}
		mapper.writeValue(System.out, programmings);
		
	}
	
}
