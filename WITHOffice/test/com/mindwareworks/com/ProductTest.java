package com.mindwareworks.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Product;

public class ProductTest extends BaseTest{

	@Test
	public void selectFromContent (){
		try{
		Transaction tx = session.beginTransaction();
		
		List<Content> contents = session.createQuery("from Content where rownum < 5").list();
		for(Content content : contents){
			Set<Product> products = content.getRelatedProducts();
			Iterator<Product> iter = products.iterator();
			while(iter.hasNext()){
				Product product = iter.next();
				
				System.out.println(product.getProductName());
			}
		}
		tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void selectFromProduct (){
		try{
		Transaction tx = session.beginTransaction();
		
		List<Product> products = session.createQuery("from Product where rownum < 5").list();
		for(Product product : products){
			Set<Content> contents = product.getContents();
			Iterator<Content> iter = contents.iterator();
			while(iter.hasNext()){
				Content content = iter.next();
				System.out.println(content.getContentId());
			}
		}
		tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
