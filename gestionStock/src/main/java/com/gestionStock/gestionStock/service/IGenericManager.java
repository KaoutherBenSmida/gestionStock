package com.gestionStock.gestionStock.service;

import java.util.List;

import com.gestionStock.gestionStock.model.Entite;


public interface IGenericManager {

	public void insert(Entite entity) throws Exception;

	public void update(Entite entity) throws Exception;

	public void delete(Entite entity) throws Exception;

	public <T extends Entite> List<T> getList(Class<T> t) throws Exception;
	
}
