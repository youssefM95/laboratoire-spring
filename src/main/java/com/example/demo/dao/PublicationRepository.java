package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {

	List<Publication> findAll();

	List<Publication> findByType(String type);

	List<Publication> findByLien(String lien);

	List<Publication> findBySourcePdf(String sourcePdf);

	List<Publication> findByDateApparition(Date date);
	
	
}
