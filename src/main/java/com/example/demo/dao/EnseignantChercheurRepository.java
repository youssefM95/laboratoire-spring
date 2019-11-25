package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.EnseignantChercheur;



@Repository
public interface EnseignantChercheurRepository extends JpaRepository<EnseignantChercheur, Long>{

	List<EnseignantChercheur> findAll();
	EnseignantChercheur findByCin(String cin);
	List<EnseignantChercheur> findByNomStartingWith(String caractere);
	List<EnseignantChercheur> findByEmail(String email);
	
	void deleteAll();
	List<EnseignantChercheur> findByGrade(String grade);
	List<EnseignantChercheur> findByEtablissement(String etablissement);
	//EnseignantChercheur find(EnseignantChercheur ens);
	List<EnseignantChercheur> findByNom(String nom);
}
