package com.mindwareworks.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.ChannelItem;
import com.mindwareworks.kbs.model.CustomChannel;

public class CustomChannelTest extends BaseTest {
	@Test
	public void select(){
		Transaction tx = session.beginTransaction();
		
		List<CustomChannel> programmings = session.createQuery("from CustomChannel").list();
		
		for(CustomChannel programming:programmings){
			Set<ChannelItem> program = programming.getChannelItems();
			
			System.out.println(programming.getChannelTitle());
			Iterator<ChannelItem> iter = program.iterator();
			while(iter.hasNext()){
				ChannelItem item = iter.next();
				System.out.println(item.getContent().getContentId());
			}
		}
		
		
		
		tx.commit();
	}
}
