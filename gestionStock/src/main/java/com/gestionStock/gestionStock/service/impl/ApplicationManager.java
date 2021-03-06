package com.gestionStock.gestionStock.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionStock.gestionStock.dao.IGenericDao;
import com.gestionStock.gestionStock.model.Entite;
import com.gestionStock.gestionStock.qualifiers.Dao;
import com.gestionStock.gestionStock.service.IGenericManager;

@Service
public class ApplicationManager implements IGenericManager {

	
	@PostConstruct
	public void init() {
		System.out.println("#### dans ApplicationManager");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param daoe the dao to set
	 */
	@Autowired
	protected IGenericDao dao;
	
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
	public void insert(Entite entity) throws Exception {

		dao.insert(entity);

	}
	@Override
	public void update(Entite entity) throws Exception {
		dao.update(entity);

	}
	@Override
	public void delete(Entite entity) throws Exception {
		dao.delete(entity);

	}
	@Override
	public <T extends Entite> List<T> getList(Class<T> t) throws Exception {
		return dao.getList(t);
	}
	
	public <T extends Entite> List<T> getUrgenceById(Class<T> t) throws Exception {
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
