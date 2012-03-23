package com.mindwareworks.com;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.mindwareworks.kbs.dao.ContentDAO;
import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.dao.QuestionDAO;
import com.mindwareworks.kbs.model.AnswerExample;
import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.CorrectAnswer;
import com.mindwareworks.kbs.model.Question;
import com.mindwareworks.kbs.model.RelatedQuiz;

public class QuestionTest extends BaseTest {
	@Test
	public void selectQuestion(){
		QuestionDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
		Question question = dao.findById(12,false);
		System.out.println(question.getQuestionContents());
		System.out.println(question.getAnswerExamples());
		System.out.println(question.getCorrectAnswer().getAnswer());
		
	}
	@Test
	public void insert(){
		QuestionDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
		
		Question question = new Question("다음중 맞는 것은?","1",0);
		Set<AnswerExample> examples = new HashSet<AnswerExample>();
		examples.add(new AnswerExample(1,"이거다"));
		examples.add(new AnswerExample(2,"저거다"));
		question.setAnswerExamples(examples);
		question.setCorrectAnswer(new CorrectAnswer("이거다"));
		
		dao.makePersistent(question);
	}
	@Test
	public void update() {
		QuestionDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
		Question question = dao.findById(14,false);
		
		question.getAnswerExamples().add(new AnswerExample(3,"몰라요"));
		question.setCorrectAnswer(new CorrectAnswer("이거다"));
		question.setQuestionContents("이거냐저거냐?");
//		dao.makePersistent(question);
	}
	
	@Test
	public void delete() {
		QuestionDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
		Question question = dao.findById(14,false);
//		
		dao.makeTransient(question);
	}
	
	@Test
	public void selectQuestionSearch(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		QuestionDAO dao = factory.getQuestionDAO();
		
		
		List<Question> questions = dao.searchByTitle("귀하");
		System.out.println(questions.size());
		for(Question question:questions){
			System.out.println(question.getQuestionContents());
			System.out.println(question.getAnswerExamples());
		}
//		List<Question> questions2 = dao.searchPageByTitle("귀하",2,3);
//		System.out.println(questions2.size());
	}
	
	@Test
	public void selectQuestionPage(){
		DAOFactory factory = DAOFactory.instance(DAOFactory.HIBERNATE);
		QuestionDAO dao = factory.getQuestionDAO();
		
		
		List<Question> questions = dao.findPage(2,5);
		
		
		System.out.println(questions.size());
//		Set<RelatedScript> relatedScripts = caption.getRelatedScripts();
//		relatedScripts.size();
	}

	
	@Test
	public void selectQuiz(){
		ContentDAO dao  = DAOFactory.instance(DAOFactory.HIBERNATE).getContentDAO();
		Content content = dao.findById(1, false);
		Set<RelatedQuiz> quizs= content.getRelatedQuizs();
		System.out.println(quizs.size());
		for(RelatedQuiz quiz:quizs){
			System.out.println(quiz.getStartTime());
			System.out.println(quiz.getStartTime()+","+quiz.getEndTime()+","+quiz.getQuestion().getQuestionContents());
			
		}
	}
	
	
}
