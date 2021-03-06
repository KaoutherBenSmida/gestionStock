package com.gestionStock.gestionStock.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture {

	
	
	public Facture() {
		super();
	}
	
	
	public Facture(Integer factureId, String factureLibelle, String factureDescription, Date factureDateCreation) {
		super();
		this.factureId = factureId;
		this.factureLibelle = factureLibelle;
		this.factureDescription = factureDescription;
		this.factureDateCreation = factureDateCreation;
	}


	private Integer factureId;
	private String factureLibelle;
	private String factureDescription;
	private Date factureDateCreation;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FACTUREID")
	public Integer getFactureId() {
		return factureId;
	}
	public void setFactureId(Integer factureId) {
		this.factureId = factureId;
	}
	@Column(name="FACTURELIBELLE")
	public String getFactureLibelle() {
		return factureLibelle;
	}
	public void setFactureLibelle(String factureLibelle) {
		this.factureLibelle = factureLibelle;
	}
	@Column(name="FACTUREDESCRIPTION")
	public String getFactureDescription() {
		return factureDescription;
	}
	public void setFactureDescription(String factureDescription) {
		this.factureDescription = factureDescription;
	}
	@Column(name="FACTUREDATECREATION")
	public Date getFactureDateCreation() {
		return factureDateCreation;
	}
	public void setFactureDateCreation(Date factureDateCreation) {
		this.factureDateCreation = factureDateCreation;
	}
	
}
