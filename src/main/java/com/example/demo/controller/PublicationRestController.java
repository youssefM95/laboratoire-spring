package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Publication;
import com.example.demo.services.IPublicationService;

@RestController
public class PublicationRestController{

	@Autowired
	IPublicationService publication;
	
	@RequestMapping(value="/publications", method=RequestMethod.GET)
	public List<Publication> findAll()
	{
		return publication.findPublication();
	}
	
	@GetMapping(value="/publication/pdf")
	
	public List<Publication> getByPdf(@RequestParam String pdf)
	{
		return publication.findBySourcePdf(pdf);
	}
	
@GetMapping(value="/publication/{id}")
	
	public Publication getByPdf(@PathVariable Long id)
	{
		return publication.findOne(id);
	}

@PostMapping(value = "/publication/add")
public Publication addMembre(@RequestBody Publication p) {
	return publication.addPub(p);
}
}
