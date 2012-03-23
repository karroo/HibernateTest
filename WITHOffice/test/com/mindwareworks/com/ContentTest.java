package com.mindwareworks.com;

import java.util.List;

import org.junit.Test;

import com.mindwareworks.kbs.dao.ContentDAO;
import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.model.Content;



public class ContentTest extends BaseTest {
	@Test
	public void selectContent(){
		ContentDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getContentDAO();
		List<Content> contents = dao.findPage(2,10);
		System.out.println(contents.size());
	}
}
