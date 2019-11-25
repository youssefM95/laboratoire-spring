package com.example.demo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;

@Service
public class ImplEtudiant implements IEtudiantService{

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantChercheurRepository enseignantChercheur;
	@Override
	public Etudiant addMember(Etudiant e) {
		
		return etudiantRepository.save(e);
	}

	@Override
	public void deleteEtudiant(Long id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public Etudiant updateMember(Etudiant e) {
		return etudiantRepository.saveAndFlush(e);
	}

	@Override
	public Etudiant findEtudiant(Long id) {
		
		return etudiantRepository.findById(id).get();
	}

	@Override
	public List<Etudiant> findAll() {
		
		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant findByCin(String cin) {
		
		return etudiantRepository.findByCin(cin);
	}

	@Override
	public Etudiant findByDateInscription(Date date) {
		
		return etudiantRepository.findByDateInscription(date);
	}

	@Override
	public List<Etudiant> findByNom(String nom) {
		
		return etudiantRepository.findByNom(nom);
	}

	@Override
	public List<Etudiant> findBySujet(String sujet) {
		
		return etudiantRepository.findBySujet(sujet);
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		
		return etudiantRepository.findByDiplome(diplome);
	}

	@Override
	public EnseignantChercheur findByEncadrant(Long id) {
		
		return enseignantChercheur.findById(id).get();
	}

}
