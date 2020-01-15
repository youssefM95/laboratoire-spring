package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.services.IEtudiantService;
import com.example.demo.services.ImplEnseignantChercheur;

@RestController
@RequestMapping("/api/professor")
public class EnseignantChercheurRestController {
	@Autowired
	ImplEnseignantChercheur enseignant;
	
	@Autowired
	IEtudiantService etudiantService;
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<EnseignantChercheur> findAll() {
		return enseignant.findAll();
	}

	@RequestMapping(value = "/Enseignant/Add", method = RequestMethod.POST)
	public EnseignantChercheur addEnseignant(@RequestBody EnseignantChercheur e) {
		return enseignant.addMember(e);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEnseignantById(@PathVariable Long id) {
		enseignant.deleteEnseignantChercheur(id);
	}

	@GetMapping("/{id}/students")
	public List<Etudiant> findStudents(@PathVariable Long id)
	{
		EnseignantChercheur enseignantChercheur = enseignant.findEnseignantChercheur(id);
		return etudiantService.findByEncadrant(enseignantChercheur);
	}
}
