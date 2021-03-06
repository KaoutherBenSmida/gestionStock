package com.gestionStock.gestionStock.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "produit")
public class Produit  extends Entite{
	
	
	
	public Produit() {
		super();
	}
	public Produit(int produitID, String produitLibelle, String produitDescription, int produitQuantite,
			Date produitDateInsertion) {
		super();
		this.produitID = produitID;
		this.produitLibelle = produitLibelle;
		this.produitDescription = produitDescription;
		this.produitQuantite = produitQuantite;
		this.produitDateInsertion = produitDateInsertion;
	}
	
	private int produitID;
	private String produitLibelle;
	private String produitDescription;
	private int produitQuantite;
	private Date produitDateInsertion;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUITID")
	public int getProduitID() {
		return produitID;
	}
	public void setProduitID(int produitID) {
		this.produitID = produitID;
	}
	@Column(name = "PRODUITLIBELLE")
	public String getProduitLibelle() {
		return produitLibelle;
	}
	public void setProduitLibelle(String produitLibelle) {
		this.produitLibelle = produitLibelle;
	}
	@Column(name = "PRODUITDESCRIPTION")
	public String getProduitDescription() {
		return produitDescription;
	}
	public void setProduitDescription(String produitDescription) {
		this.produitDescription = produitDescription;
	}
	@Column(name = "PRODUITQUANTITE")
	public int getProduitQuantite() {
		return produitQuantite;
	}
	public void setProduitQuantite(int produitQuantite) {
		this.produitQuantite = produitQuantite;
	}
	@Column(name = "PRODUITDATEINSERTION")
	public Date getProduitDateInsertion() {
		return produitDateInsertion;
	}
	public void setProduitDateInsertion(Date produitDateInsertion) {
		this.produitDateInsertion = produitDateInsertion;
	}
	@Override
	public String toString() {
		return "Produit [produitID=" + produitID + ", produitLibelle=" + produitLibelle + ", produitDescription="
				+ produitDescription + ", produitQuantite=" + produitQuantite + ", produitDateInsertion="
				+ produitDateInsertion + "]";
	}
	

}
