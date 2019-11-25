package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.entities.EnseignantChercheur;

@Service
public class ImplEnseignantChercheur implements IEnseignantChercheur{
@Autowired
EnseignantChercheurRepository enseignantChercheur;
	@Override
	public EnseignantChercheur addMember(EnseignantChercheur e) {
		
		return enseignantChercheur.save(e);
	}

	@Override
	public void deleteEnseignantChercheur(Long id) {
		enseignantChercheur.deleteById(id);
	}

	@Override
	public EnseignantChercheur updateEnseignantChercheur(EnseignantChercheur e) {
		
		return enseignantChercheur.saveAndFlush(e);
	}

	@Override
	public EnseignantChercheur findEnseignantChercheur(Long id) {
		
		return enseignantChercheur.findById(id).get();
	}

	@Override
	public List<EnseignantChercheur> findAll() {
		
		return enseignantChercheur.findAll();
	}

	@Override
	public EnseignantChercheur findByCin(String cin) {
		
		return enseignantChercheur.findByCin(cin);
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		
		return enseignantChercheur.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByNom(String nom) {
		
		return enseignantChercheur.findByNom(nom);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etab) {
		
		return enseignantChercheur.findByEtablissement(etab);
	}

}
