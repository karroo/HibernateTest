package com.mindwareworks.com;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.mindwareworks.kbs.dao.ContentDAO;
import com.mindwareworks.kbs.dao.DAOFactory;
import com.mindwareworks.kbs.dao.QuestionDAO;
import com.mindwareworks.kbs.model.AnswerExample;
import com.mindwareworks.kbs.model.Content;
import com.mindwareworks.kbs.model.CorrectAnswer;
import com.mindwareworks.kbs.model.Question;
import com.mindwareworks.kbs.model.RelatedQuiz;
import com.mindwareworks.kbs.model.RelatedSurvey;

public class QuestionTest extends BaseTest {
	@Test
	public void selectQuestion(){
		QuestionDAO dao = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
		Question question = dao.findById(13,false);
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
		for(Question question:questions){
			System.out.println(question.getQuestionContents());
			System.out.println(question.getAnswerExamples());
		}
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
		
		QuestionDAO dao2 = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
		Question question = dao2.findById(13,false);
		
		quizs.add(new RelatedQuiz(question,300,400));
		
//		System.out.println(content.getScript().getScriptFilePath());
	}
	@Test
	public void selectSurvey(){
		ContentDAO dao  = DAOFactory.instance(DAOFactory.HIBERNATE).getContentDAO();
		Content content = dao.findById(1, false);
		Set<RelatedSurvey> surveis= content.getRelatedSurveies();
		System.out.println(surveis.size());
		for(RelatedSurvey survey:surveis){
			System.out.println(survey.getStartTime());
			System.out.println(survey.getStartTime()+","+survey.getEndTime()+","+survey.getQuestion().getQuestionContents());
			
		}
		
//		QuestionDAO dao2 = DAOFactory.instance(DAOFactory.HIBERNATE).getQuestionDAO();
//		Question question = dao2.findById(13,false);
		
//		surveis.add(new RelatedSurvey(question,300,400));
		
//		System.out.println(content.getScript().getScriptFilePath());
	}
	
	@Test
	public void selectRelatedQuestion(){
		Criteria crit = session.createCriteria(RelatedSurvey.class);
		crit.add(Restrictions.eq("id.contentId", 644));
		
		List<RelatedSurvey> list = crit.list();
		for(RelatedSurvey quesion:list){
			System.out.println(quesion.getQuestion().getQuestionContents());
		}
		
//		ContentDAO dao  = DAOFactory.instance(DAOFactory.HIBERNATE).getContentDAO();
//		Content  content = dao.findById(644, false);
//		Set<RelatedSurvey> list1 = content.getRelatedSurveies();
//		
//		int i=0;
//		for(RelatedSurvey quesion:list1){
//			System.out.println(quesion.getQuestion().getQuestionContents());
//			break;
//			
//		}
		
		
	}
	
}
