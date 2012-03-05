package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Caption;
import com.mindwareworks.kbs.model.Content;

public class CaptionTest extends BaseTest {
	@Test
	public void selectFromContent(){
		try{
		Transaction tx = session.beginTransaction();
		
		List<Content> list = session.createQuery("from Content where rownum < 5").list();
		
		for(Content content : list){
			Caption caption = content.getCaption();
			System.out.println(content.getContentId());
			System.out.println(caption.getCaptionFilePath());
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
		
		List<Caption> list = session.createQuery("from Caption where rownum < 5").list();
		
		for(Caption caption : list){
			
			System.out.println(caption.getCaptionFilePath());
			System.out.println(caption.getContent().getContentId());
		}
		tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
