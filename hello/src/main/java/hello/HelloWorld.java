package hello;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		
//		Message message = new Message("Hello World");
//		Long msgId = (Long)session.save(message);
//		
//		
//		tx.commit();
//		session.close();
//		
//		Session newSession = HibernateUtil.getSessionFactory().openSession();
//		Transaction newTransaction = newSession.beginTransaction();
//		
//		
//		List messages = newSession.createQuery("from Message m order by m.text asc").list();
//		
//		System.out.println(messages.size()+" message(s) found.");
//		
//		for(Iterator iter = messages.iterator();iter.hasNext();){
//			Message loadedMsg = (Message)iter.next();
//			System.out.println(loadedMsg.getText());
//			
//		}
//		
//		newTransaction.commit();
//		newSession.close();
		 
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("helloworld");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		
		Message message = new Message("Hello World");
		em.persist(message);
		
		tx.commit();
		em.close();
		
		EntityManager newEm = emf.createEntityManager();
		EntityTransaction newTx = newEm.getTransaction();
		newTx.begin();
		List messages = newEm.createQuery("select m from Message m order by m.text asc")
							.getResultList();
		
		System.out.println(messages.size() + "message(s) found");
		
		for(Object m:messages){
			Message loadedMsg = (Message)m;
			System.out.println(loadedMsg.getText());
		}
		
		newTx.commit();
		newEm.close();
		
		emf.close();
		
	}

}
