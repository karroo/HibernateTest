package com.mindwareworks.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Product;
import com.mindwareworks.kbs.model.RelatedProduct;

public class ProductTest extends BaseTest {

	@Test
	public void selectFromRelatedContent() {
		try {
			Transaction tx = session.beginTransaction();

			List<RelatedProduct> rproducts = session.createQuery("from RelatedProduct where rownum< 5").list();
			for(RelatedProduct rproduct:rproducts){
				System.out.println(rproduct.getProduct().getProductName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void selectFromContent() {
		try {
			Transaction tx = session.beginTransaction();

			Content content = (Content)session.get(Content.class, "343234");
			Set<RelatedProduct> products = content.getRelatedProducts();
			Iterator<RelatedProduct> iter = products.iterator();
			while (iter.hasNext()) {
				RelatedProduct product = iter.next();

				System.out.println(product.getProduct().getProductName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void selectFromContents() {
		try {
			Transaction tx = session.beginTransaction();

			List<Content> contents = session.createQuery(
					"from Content").setFirstResult(10).setMaxResults(5).list();
			for (Content content : contents) {
				System.out.println(content.getContentKind());
				Set<RelatedProduct> products = content.getRelatedProducts();
				Iterator<RelatedProduct> iter = products.iterator();
				while (iter.hasNext()) {
					RelatedProduct product = iter.next();

					System.out.println(product.getProduct().getProductName());
				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void selectFromProducts() {
		try {
			Transaction tx = session.beginTransaction();

			List<Product> products = session.createQuery(
					"from Product where rownum < 5").list();
			for (Product product : products) {
				System.out.println(product.getProductName());
				Set<RelatedProduct> contents = product.getRelatedProducts();
				Iterator<RelatedProduct> iter = contents.iterator();
				while (iter.hasNext()) {
					RelatedProduct content = iter.next();
					System.out.println(content.getContent().getContentKind());
				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
