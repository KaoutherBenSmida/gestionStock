package com.gestionStock.gestionStock.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gestionStock.gestionStock.controllers.ProduitController;
import com.gestionStock.gestionStock.dao.ProduitDao;
import com.gestionStock.gestionStock.model.Produit;

class ProduitTest {
	@Autowired
	private ProduitDao produitDao;
	
	
	public ProduitTest(ProduitDao produitDao) {
		super();
		this.produitDao = produitDao;
	}


	@Test
	void testAddProduit() {
		
		//ARRANGE
		ProduitController produitController = new ProduitController(produitDao);
		Produit produit = new Produit();
		produit.setProduitDateInsertion(new Date());
		produit.setProduitDescription("from test junit");
		produit.setProduitLibelle("Ordinateur");
		produit.setProduitQuantite(10);
		
		//ACT
		System.out.println("#### produitDao == " + produitDao);
		Produit p= produitController.saveProduit(produit);
		
		//ASSERT
		assertEquals(produit, p);
		
	}

}
