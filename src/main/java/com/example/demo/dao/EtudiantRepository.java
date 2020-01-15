package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;


public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

	List<Etudiant> findAll();
	Etudiant findByCin(String cin);
	List<Etudiant> findByNomStartingWith(String caractere);
	Etudiant findByEmail(String email);
	void deleteById(Long id);
	void deleteAll();
	List<Etudiant> findByDiplome(String diplome);
	Etudiant findByDateInscription(Date date);
	List<Etudiant> findByNom(String nom);
	List<Etudiant> findBySujet(String sujet);
	List<Etudiant> findByEncadrant(EnseignantChercheur encadrant);
	
}
