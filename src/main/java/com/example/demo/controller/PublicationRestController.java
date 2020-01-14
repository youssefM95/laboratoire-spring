package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Membre;
import com.example.demo.entities.Publication;
import com.example.demo.payload.request.PublicationRequest;
import com.example.demo.services.IMemberService;
import com.example.demo.services.IPublicationService;

@RestController
@RequestMapping("/api/publication")
public class PublicationRestController{

	@Autowired
	IPublicationService publicationService;
	
	@Autowired
	IMemberService memberService;
	
	@GetMapping("/all")
	public List<Publication> findAll()
	{
		return publicationService.findPublication();
	}
	
//	@GetMapping(value="/publication/pdf")
//	
//	public List<Publication> getByPdf(@RequestParam String pdf)
//	{
//		return publication.findBySourcePdf(pdf);
//	}
	
@GetMapping(value="/publication/{id}")
	
	public Publication getByPdf(@PathVariable Long id)
	{
		return publicationService.findOne(id);
	}

	@PostMapping(value = "/add")
	public void addMembre(@RequestBody PublicationRequest p) {
		Membre member = memberService.findById(p.getIdAuteur());
		Publication publication = new Publication(p.getType(), p.getDate(), p.getLien(), null);
		publication.setAuteur(member);
		publicationService.addPub(publication);
	}
	
	@GetMapping("/all/auteur/{id}")
	public List<Publication> getAllPublicaionByAuteurId(@PathVariable Long id) {
		Membre member = memberService.findById(id);
		return publicationService.findByAuteur(member);
	}
}
