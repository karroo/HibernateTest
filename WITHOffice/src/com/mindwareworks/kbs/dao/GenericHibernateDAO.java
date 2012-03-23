package com.mindwareworks.kbs.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.mindwareworks.kbs.util.HibernateUtil;

public  abstract class GenericHibernateDAO<T, ID extends Serializable> implements GenericDAO<T,ID> {

	private Class<T> persistentClass;
	private Session session;
	
	
	@SuppressWarnings("unchecked")
	public GenericHibernateDAO(){
		this.persistentClass = (Class<T>)
				((ParameterizedType)getClass().getGenericSuperclass())
					.getActualTypeArguments()[0];
	}
	public Session getSession() {
		if(session == null)
			session = HibernateUtil.getSessionFactory().getCurrentSession();
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	@SuppressWarnings("unchecked")
	public T findById(ID id, boolean lock) {
		T entity;
		if(lock)
			entity = (T) getSession().load(getPersistentClass(), id,LockMode.UPGRADE);
		else
			entity = (T) getSession().load(getPersistentClass(), id);
		
		return entity;
	}
	public List<T> findAll() {
		return findByCriteria();
	}
	public List<T> findPage(int page,int pageSize){
		return findByCriteria(page,pageSize);
	}
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T exampleInstance, String... excludeProperty) {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		Example example = Example.create(exampleInstance);
		for(String exclude:excludeProperty){
			example.excludeProperty(exclude);
		}
		
		crit.add(example);
		return crit.list();
	}
	@Override
	public T makePersistent(T entity) {
		getSession().saveOrUpdate(entity);
		return entity;
	}
	@Override
	public void makeTransient(T entity) {
		getSession().delete(entity);
		
	}
	@Override
	public void flush() {
		getSession().flush();
		
	}
	@Override
	public void clear() {
		getSession().clear();
		
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion){
		Criteria crit = getSession().createCriteria(getPersistentClass());
		for(Criterion c:criterion){
			crit.add(c);
		}
		
		
		
		return crit.list();
	}
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(int page,int pageSize,Criterion... criterion){
		Criteria crit = getSession().createCriteria(getPersistentClass());
		for(Criterion c:criterion){
			crit.add(c);
		}
		
		int maxResults = pageSize;
		int firstResult  = (page -1) * pageSize ;
		crit.setMaxResults(maxResults);
		crit.setFirstResult(firstResult);
		return crit.list();
	}
	
	protected List<T> search(String key,String value){
		Criteria crit = getSession().createCriteria(getPersistentClass());
		
		crit.add(Restrictions.like(key, "%"+value+"%"));
		return crit.list();
	}
	
	protected List<T> searchPage(int page,int pageSize,String key,String value){
		Criteria crit = getSession().createCriteria(getPersistentClass());
		
		crit.add(Restrictions.like(key, "%"+value+"%"));
		int maxResults = pageSize;
		int firstResult  = (page -1) * pageSize;
		crit.setMaxResults(maxResults);
		crit.setFirstResult(firstResult);
		return crit.list();
	}
	
}
