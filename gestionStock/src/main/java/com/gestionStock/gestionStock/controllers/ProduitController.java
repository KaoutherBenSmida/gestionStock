package com.gestionStock.gestionStock.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestionStock.gestionStock.dao.ProduitDao;
import com.gestionStock.gestionStock.model.Produit;


@RestController
public class ProduitController {
	
	@Autowired
	private ProduitDao produitDao;
	
	
	public ProduitController(ProduitDao produitDao) {
		super();
		this.produitDao = produitDao;
	}

	@PostConstruct
	public void init() {
		System.out.println("##### dans init ProduitController");
	}

	@GetMapping(value = "/produit")
	public List<Produit> getAllProduits(){
		return produitDao.findAll();
	}
	
	@PostMapping(value = "/produit")
	public void saveProduit(@RequestBody Produit produit) {
		System.out.println("##### dans saveProduit");
		produitDao.save(produit);
	}
}
