package com.example.demo.services;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;

@Service
public class ImplPublication implements IPublicationService{

@Autowired

public PublicationRepository publication;
	@Override
	public List<Publication> findPublication() {
		return publication.findAll();
	}

	@Override
	public List<Publication> findByType(String type) {
		
		return publication.findByType(type);
	}

	@Override
	public List<Publication> findByLien(String lien) {
		
		return publication.findByLien(lien);
	}

	@Override
	public List<Publication> findBySourcePdf(String sourcePdf) {
		
		return publication.findBySourcePdf(sourcePdf);
	}

	@Override
	public List<Publication> findByDateApparition(Date date) {
		
		return publication.findByDateApparition(date);
	}

	@Override
	public Publication findOne(Long id) {
		
		return publication.getOne(id);
	}

	@Override
	public Publication addPub(Publication P) {
		
		publication.save(P);
		return P;
	}

	

}
