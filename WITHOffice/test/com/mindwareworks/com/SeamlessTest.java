package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Seamless;

public class SeamlessTest extends BaseTest{
	@Test
	public void select(){
		Transaction tx = session.beginTransaction();
		
		List<Seamless> contents = session.createQuery("from Seamless").list();
		for(Seamless content:contents){
			System.out.println(content.getLastViewingDateTime());
//			System.out.println(content.getContent().getContentId());
		}
		
		tx.commit();
	}
}
