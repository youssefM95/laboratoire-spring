package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.services.IEnseignantChercheur;
import com.example.demo.services.IEtudiantService;
import com.example.demo.services.ImplEtudiant;

@RestController
@RequestMapping("/api/student")
public class EtudiantRestController {
	@Autowired
	IEtudiantService implEtudiant;
	@Autowired
	IEnseignantChercheur enseignantChercheurService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Etudiant> findEtudiants() {
		return implEtudiant.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Long id)
	{
		implEtudiant.deleteEtudiant(id);
	}
	
	@PutMapping("/{idStudent}/addEncadant/{idProfessor}")
	public void addEncadrant(@PathVariable Long idStudent,@PathVariable Long idProfessor) {
		EnseignantChercheur encadrant = enseignantChercheurService.findEnseignantChercheur(idProfessor);
		
		Etudiant etudiant = implEtudiant.findEtudiant(idStudent);
		etudiant.setEncadrant(encadrant);
		
		implEtudiant.updateMember(etudiant);
	}
	
	@GetMapping("/{id}/findEncadrant")
	public EnseignantChercheur findEncadrant(@PathVariable Long id)
	{
		Etudiant etudiant = implEtudiant.findEtudiant(id);
		return etudiant.getEncadrant();
	}
}
