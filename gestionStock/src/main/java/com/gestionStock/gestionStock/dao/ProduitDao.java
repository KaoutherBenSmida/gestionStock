package com.gestionStock.gestionStock.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.gestionStock.gestionStock.model.Produit;

public interface ProduitDao extends JpaRepositoryImplementation<Produit, Integer>{

}
