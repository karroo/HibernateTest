package com.mindwareworks.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.AnswerExample;
import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.Question;
import com.mindwareworks.kbs.model.RelatedProduct;
import com.mindwareworks.kbs.model.RelatedQuiz;

public class QuestionTest extends BaseTest {
	@Test
	public void update() {
		try {
			Transaction tx = session.beginTransaction();

			Question question = (Question) session.get(Question.class, 1);

			System.out.println(question.getClass());
			question.setPoint(30);
			AnswerExample example = question.getAnswerExamples().iterator()
					.next();
			example.setExample(example.getExample() + " ");

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void selectFromRelatedContent() {
		try {
			Transaction tx = session.beginTransaction();

			List<RelatedQuiz> rproducts = session.createQuery("from RelatedQuiz where rownum< 5").list();
			for(RelatedQuiz rproduct:rproducts){
				System.out.println(rproduct.getQuestion().getQuestionContents());
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
			Set<RelatedQuiz> products = content.getRelatedQuizs();
			Iterator<RelatedQuiz> iter = products.iterator();
			while (iter.hasNext()) {
				RelatedQuiz product = iter.next();

				System.out.println(product.getQuestion().getQuestionContents());
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
					"from Content").setMaxResults(5).list();// where rownum<6").list();
			for (Content content : contents) {
//				System.out.println(content.getContentId());
				Set<RelatedQuiz> products = content.getRelatedQuizs();
				Iterator<RelatedQuiz> iter = products.iterator();
				while (iter.hasNext()) {
					RelatedQuiz product = iter.next();

					System.out.println(product.getQuestion().getQuestionContents());
				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getQuestionList() {
		try {
			Transaction tx = session.beginTransaction();

			List<Question> questions = session.createQuery("from Question")
					.list();
			System.out.println(questions.size());
			for (Question question : questions) {

				System.out.println(question);
				System.out.println(question.getAnswerExamples());
				System.out.println(question.getCorrectAnswer());

			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
