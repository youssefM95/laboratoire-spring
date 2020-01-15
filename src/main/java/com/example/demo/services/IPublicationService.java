package com.example.demo.services;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Membre;
import com.example.demo.entities.Publication;

public interface IPublicationService {

	public List<Publication> findPublication();

	public List<Publication> findByType(String type);

	public List<Publication> findByLien(String lien);

//	public List<Publication> findBySourcePdf(String sourcePdf);

	public List<Publication> findByDateApparition(Date date);

	public Publication findOne(Long id);
	
	public void addPub(Publication P);
	
	public List<Publication> findByAuteur(Membre auteur);
	
}
