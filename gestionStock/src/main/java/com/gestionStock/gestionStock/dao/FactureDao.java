package com.gestionStock.gestionStock.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.gestionStock.gestionStock.model.Facture;

public interface FactureDao extends JpaRepositoryImplementation<Facture, Integer> {
	
	
}
