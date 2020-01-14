package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Publication implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;//article de journal/ manifestation/chapitre de livre/livre/poster
	@Temporal(TemporalType.DATE)
	private Date dateApparition;
	private String lien;
//	private String sourcePdf;
	@ManyToOne(cascade = CascadeType.ALL)
	private Membre auteur;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateApparition() {
		return dateApparition;
	}
	public void setDateApparition(Date dateApparition) {
		this.dateApparition = dateApparition;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
//	public String getSourcePdf() {
//		return sourcePdf;
//	}
//	public void setSourcePdf(String sourcePdf) {
//		this.sourcePdf = sourcePdf;
//	}
	public Membre getAuteur() {
		return auteur;
	}
	public void setAuteur(Membre auteur) {
		this.auteur = auteur;
	}
	
	public Publication(String type, Date dateApparition, String lien, String sourcePdf) {
		super();
		this.type = type;
		this.dateApparition = dateApparition;
		this.lien = lien;
//		this.sourcePdf = sourcePdf;
	}
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
