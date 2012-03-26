package com.mindwareworks.com;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.mindwareworks.kbs.dao.ContentDAO;
import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.dao.ShootingPlaceDAO;
import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.RelatedShoopingPlace;
import com.mindwareworks.kbs.model.ShootingPlace;

public class ShootingPlaceTest extends BaseTest {
	@Test
	public void selectShootingPlace(){
		ShootingPlaceDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getShootingPlaceDAO();
		ShootingPlace question = dao.findById(1L,false);
		System.out.println(question.getShootingPlace());
		
	}
	@Test
	public void insert(){
		ShootingPlaceDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getShootingPlaceDAO();
		
		ShootingPlace place = new ShootingPlace("장소이름","교통편","연락처","상세","이미지경로");
		
		dao.makePersistent(place);
		
	}
	@Test
	public void update() {
		ShootingPlaceDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getShootingPlaceDAO();
		ShootingPlace place = dao.findById(6L,false);
		place.setShootingPlaceContact("0101112222");
		
		
//		dao.makePersistent(place);
	}
	
	@Test
	public void delete() {
		ShootingPlaceDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getShootingPlaceDAO();
		ShootingPlace place = dao.findById(6L,false);
//		
		dao.makeTransient(place);
	}
	
	@Test
	public void selectShootingPlaceSearch(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ShootingPlaceDAO dao = factory.getShootingPlaceDAO();
		
		
		List<ShootingPlace> places = dao.searchByTitle("장");
		System.out.println(places.size());
		for(ShootingPlace place:places){
			System.out.println(place.getShootingPlace());
		}
//		List<place> places2 = dao.searchPageByTitle("귀하",2,3);
//		System.out.println(places2.size());
	}
	
	@Test
	public void selectShootingPlacePage(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		ShootingPlaceDAO dao = factory.getShootingPlaceDAO();
		
		
		List<ShootingPlace> places = dao.findPage(2,3);
		
		
		System.out.println(places.size());
//		Set<RelatedScript> relatedScripts = caption.getRelatedScripts();
//		relatedScripts.size();
	}

	
	@Test
	public void selectRelatedShootingPlace(){
		ContentDAO dao  = DAOFactory.instance(DAOFactory.HIBERNATE).getContentDAO();
		Content content = dao.findById(1, false);
		Set<RelatedShoopingPlace> places= content.getRelatedShootingPlaces();
		System.out.println(places.size());
		for(RelatedShoopingPlace place:places){
			System.out.println(place.getStartTime());
			System.out.println(place.getStartTime()+","+place.getEndTime()+","+place.getShootingPlace().getShootingPlace());
			
		}
		ShootingPlaceDAO dao2 = DAOFactory.instance(DAOFactory.HIBERNATE).getShootingPlaceDAO();
		ShootingPlace place = dao2.findById(7L,false);
		places.add(new RelatedShoopingPlace(place,200,300));
	}
	
	
}
