package com.gestionStock.gestionStock.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestionStock.gestionStock.dao.ProduitDao;
import com.gestionStock.gestionStock.model.Produit;
import com.gestionStock.gestionStock.service.impl.ApplicationManager;

@RestController
public class ProduitController {
	
	@Autowired
	private ProduitDao produitDao;
	@Autowired
	private ApplicationManager applicationManager;
	
	
	public ProduitController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProduitController(ProduitDao produitDao,ApplicationManager ApplicationManager) {
		super();
		this.produitDao = produitDao;
		this.applicationManager=ApplicationManager;
	}

	@PostConstruct
	public void init() {
		System.out.println("##### dans init ProduitController");
	}

	@GetMapping(value = "/produit")
	public List<Produit> getAllProduits(){
//		return produitDao.findAll();
		List<Produit> listProduits = new ArrayList<Produit>();
		try {
			listProduits=applicationManager.getList(Produit.class);
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listProduits;
	}
	
	@PostMapping(value = "/produit")
	public Produit saveProduit(@RequestBody Produit produit) {
		System.out.println("##### dans saveProduit == " + produit.toString());
		try {
			produitDao.save(produit);
//			applicationManager.insert(produit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produit;
	}
}
