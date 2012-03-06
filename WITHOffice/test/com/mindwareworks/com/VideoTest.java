package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.RelatedVideo;
import com.mindwareworks.kbs.model.Video;

public class VideoTest extends BaseTest{
	@Test
	public void select(){
		Transaction tx = session.beginTransaction();
		
		List<Video> contents = session.createQuery("from Video where rownum< 5").list();
		for(Video content:contents){
			System.out.println(content.getFileName());
			if(content.getRelatedVideos().size() >0){
				RelatedVideo rvideo = content.getRelatedVideos().iterator().next();
				System.out.println(rvideo.getContent().getCaption().getCaptionFilePath());
			}
			System.out.println(content.getRelatedVideos().size());
		}
		
		tx.commit();
	}
	
	@Test
	public void selectFromContent(){
		Transaction tx = session.beginTransaction();
		
		List<RelatedVideo> contents = session.createQuery("from RelatedVideo  where rownum< 5").list();
		for(RelatedVideo content:contents){
			System.out.println(content.getContent().getContentId());
//			System.out.println(content.getContent().getContentId());
		}
		
		tx.commit();
	}
}
