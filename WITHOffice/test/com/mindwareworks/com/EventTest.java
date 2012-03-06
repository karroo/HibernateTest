package com.mindwareworks.com;

import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Event;

public class EventTest extends BaseTest{
	@Test
	public void select(){
		Transaction tx = session.beginTransaction();
		
		List<Content> contents = session.createQuery("from Content where rownum <3").list();
		for(Content content:contents){
			Set<Event> events = content.getEvents();
			for(Event event:events.toArray(new Event[events.size()])){
				System.out.println(event.getEventContents());
				
			}
		}
		
		tx.commit();
	}
}
