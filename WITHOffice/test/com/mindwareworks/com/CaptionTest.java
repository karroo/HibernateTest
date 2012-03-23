package com.mindwareworks.com;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.mindwareworks.kbs.dao.CaptionDAO;
import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.model.Caption;
import com.mindwareworks.kbs.model.Content;

public class CaptionTest extends BaseTest {
	@Test
	public void selectCaptionById(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		Caption caption = dao.findById(1, false);
		System.out.println(caption.getCaptionFilePath());
//		Set<RelatedScript> relatedScripts = caption.getRelatedScripts();
//		relatedScripts.size();
	}
	
	@Test
	public void selectCaptionSearch(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		
		
//		List<Caption> captions = dao.searchByTitle("스파이");
//		System.out.println(captions.size());
//		List<Caption> captions2 = dao.searchPageByTitle("스파이",1,2);
//		System.out.println(captions2.size());
//		Set<RelatedScript> relatedScripts = caption.getRelatedScripts();
//		relatedScripts.size();
	}
	
	@Test
	public void selectCaptionPage(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		
		
		List<Caption> captions = dao.findPage(1,2);
		
		
		System.out.println(captions.size());
//		Set<RelatedScript> relatedScripts = caption.getRelatedScripts();
//		relatedScripts.size();
	}

	@Test
	public void selectFromContent() {
		try {
			
			Content content = (Content)session.load(Content.class,644);

			Set<Caption> captions = content.getCaptions();
			for(Caption rs:captions){
				System.out.println(rs.getCaptionFilePath());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insert(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		Caption caption = dao.makePersistent(new Caption("포맷","경로","언어"));
		
		System.out.println(caption.getCaptionId());
		
	}
	@Test
	public void update(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		Caption caption = dao.findById(4, false);
		caption.setCaptionFilePath("caption/caption.smi");
	}
	
	@Test
	public void delete(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		Caption caption = dao.findById(4, false);
		dao.makeTransient(caption);
		
	}
	
	@Test
	public void bindScript(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
		Caption caption = dao.findById(5,false);
		
		Content content = (Content)session.load(Content.class,644);

		content.getCaptions().add(caption);
		
	}
	
	@Test
	public void unbindCaption(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		CaptionDAO dao = factory.getCaptionDAO();
//		Script caption = dao.findById(5,false);
		
		Content content = (Content)session.load(Content.class,"644");
		Caption caption = null;
		for(Caption item:content.getCaptions()){
			if(5 == item.getCaptionId()){
				caption  = item;
				break;
			}
		}
		content.getCaptions().remove(caption);
		
	}
}
