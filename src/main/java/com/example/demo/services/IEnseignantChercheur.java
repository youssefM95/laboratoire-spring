package com.example.demo.services;


import java.util.List;



import com.example.demo.entities.EnseignantChercheur;



public interface IEnseignantChercheur {

	//Crud sur les EnseignantChercheur
	
			public EnseignantChercheur addMember(EnseignantChercheur e);
			public void deleteEnseignantChercheur(Long id) ;
			public EnseignantChercheur updateEnseignantChercheur(EnseignantChercheur e) ;
			public EnseignantChercheur findEnseignantChercheur(Long id) ;
			public List<EnseignantChercheur> findAll();
			
			//Filtrage par propriété
			public EnseignantChercheur findByCin(String cin);
			public List<EnseignantChercheur> findByGrade(String grade);
			public List<EnseignantChercheur> findByNom(String nom);
			public List<EnseignantChercheur> findByEtablissement(String etab);
			
}
