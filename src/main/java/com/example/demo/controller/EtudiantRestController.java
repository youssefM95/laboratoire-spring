package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Etudiant;
import com.example.demo.services.ImplEtudiant;

@RestController
@RequestMapping("/api/student")
public class EtudiantRestController {
	@Autowired
	ImplEtudiant implEtudiant;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Etudiant> findEtudiants() {
		return implEtudiant.findAll();
	}
}
