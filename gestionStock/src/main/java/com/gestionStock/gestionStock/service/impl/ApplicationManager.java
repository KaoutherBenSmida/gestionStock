package com.gestionStock.gestionStock.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import com.gestionStock.gestionStock.dao.IGenericDao;
import com.gestionStock.gestionStock.model.Entite;
import com.gestionStock.gestionStock.qualifiers.Dao;
import com.gestionStock.gestionStock.service.IGenericManager;

@Service
public class ApplicationManager implements IGenericManager {

	private Session session;
	private Transaction tx;
	@PostConstruct
	public void init() {
		System.out.println("#### dans ApplicationManager");
		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param daoe the dao to set
	 */
	@Autowired
	protected IGenericDao dao;
	@Autowired
	private SessionFactory sessionFactory;
	/**                              
	 * @return the dao
	 */
	public IGenericDao getDao() {
		return dao;
	}

//	/**
//	 * @param dao the dao to set
//	 */
//	public void setDao(IGenericDao dao) {
//		this.dao = dao;
//	}
//	
	@Autowired
	public void setDao(@Dao(type = Entite.class) IGenericDao dao) {
		this.dao = dao;

	}
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(Entite entity) throws Exception {
		System.out.println("#### dans insert == " + entity.toString());
		dao.insert(entity);
		tx.commit();

	}
	@Override
	public void update(Entite entity) throws Exception {
		dao.update(entity);
		tx.commit();

	}
	@Override
	@Transactional
	public void delete(Entite entity) throws Exception {
		dao.delete(entity);
		tx.commit();

	}
	@Override
	@Transactional(readOnly = true)
	public <T extends Entite> List<T> getList(Class<T> t) throws Exception {
		return dao.getList(t);
	}
	

//	public List<Urgence> getUrgenceById(int id) {
//		return dao.getUrgenceById(id);
//		
//	}
	
	
//	private static final String LIST_USER_BY_PARAMS = "listUserByParams";
//	@SuppressWarnings("unchecked")
//	public List<User> getUserByParams(String username, String password) {
//		return(List<User>)  dao.getListWithNamedQuery(LIST_USER_BY_PARAMS,with("username", username).and("password", password).parameters());
//	}
	

}