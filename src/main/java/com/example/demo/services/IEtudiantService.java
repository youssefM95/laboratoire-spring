package com.example.demo.services;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;




public interface IEtudiantService {

	//Crud sur les Etudiant
	
		public Etudiant addMember(Etudiant e);
		public void deleteEtudiant(Long id) ;
		public Etudiant updateMember(Etudiant e) ;
		public Etudiant findEtudiant(Long id) ;
		public List<Etudiant> findAll();
		
		//Filtrage par propriété
		public Etudiant findByCin(String cin);
		public Etudiant findByDateInscription(Date date);
		public List<Etudiant> findByNom(String nom);
		public List<Etudiant> findBySujet(String sujet);
		public List<Etudiant> findByDiplome(String diplome);
		
		//recherche spécifique des enseignants
		public List<Etudiant> findByEncadrant(EnseignantChercheur enseignantChercheur);
		
}
