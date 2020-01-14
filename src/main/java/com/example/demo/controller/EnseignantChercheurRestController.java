package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.services.ImplEnseignantChercheur;

@RestController
@RequestMapping("/api/professor")
public class EnseignantChercheurRestController {
@Autowired
ImplEnseignantChercheur enseignant;
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public List<EnseignantChercheur> findAll()
	{
		return enseignant.findAll();
	}
	
	@RequestMapping(value = "/Enseignant/Add",method = RequestMethod.POST)
	public EnseignantChercheur addEnseignant(@RequestBody EnseignantChercheur e)
	{
		return enseignant.addMember(e);
	}
}
