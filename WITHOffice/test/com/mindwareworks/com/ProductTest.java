package com.mindwareworks.com;

import java.util.Set;

import org.junit.Test;

import com.mindwareworks.kbs.dao.ContentDAO;
import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.dao.ProductDAO;
import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Product;
import com.mindwareworks.kbs.model.RelatedProduct;
import com.mindwareworks.kbs.model.RelatedProductId;

public class ProductTest extends BaseTest {
	@Test
	public void selectProduct(){
		ProductDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getProductDAO();
		Product product = dao.findById(1,false);
		System.out.println(product.getProductDescription());
		
	}
	@Test
	public void insert(){
		ProductDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getProductDAO();
		
		Product place = new Product("상품이름","이미지경로","상세이미지","상품설명",10000,"스폰서","스폰서url","판매처");
		
		dao.makePersistent(place);
		
	}
	@Test
	public void update() {
		ProductDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getProductDAO();
		Product place = dao.findById(6,false);
		place.setSponsorUrl("나꼼수");
		
		
//		dao.makePersistent(place);
	}
	
	@Test
	public void delete() {
		ProductDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getProductDAO();
		Product place = dao.findById(6,false);
//		
		dao.makeTransient(place);
	}
	
	@Test
	public void selectFromContent() {
		ContentDAO dao1 = DAOFactory.instance(DAOFactory.HIBERNATE).getContentDAO();
		ProductDAO dao2 = DAOFactory.instance(DAOFactory.HIBERNATE).getProductDAO();
		
		Content content = dao1.findById(644, false);
		
		Set<RelatedProduct> rp = content.getRelatedProducts();
		System.out.println(rp.size());
		for(RelatedProduct r:rp){
			System.out.println(r.getStartTime()+","+r.getEndTime()+","+r.getProduct().getProductDescription());
		}
		Product product = dao2.findById(6,false);
//		rp.add(new RelatedProduct(644,7,300,400));
		rp.add(new RelatedProduct(content,product,200,300));
		
	}

	
}
