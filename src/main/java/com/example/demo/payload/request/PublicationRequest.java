package com.example.demo.payload.request;

import java.util.Date;

public class PublicationRequest {
	
	private String type;
	private String lien;
	private Date date;
	private Long idAuteur;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(Long idAuteur) {
		this.idAuteur = idAuteur;
	}

}
