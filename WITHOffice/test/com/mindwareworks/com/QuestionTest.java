package com.mindwareworks.com;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;

import com.mindwareworks.kbs.model.AnswerExample;
import com.mindwareworks.kbs.model.Question;

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
	public void getQuestionList() {
		try {
			Transaction tx = session.beginTransaction();

			List<Question> questions = session.createQuery("from Question")
					.list();
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
