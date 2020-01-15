package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Evenement;
import com.example.demo.payload.request.EventRequest;
import com.example.demo.services.IEventService;

@RestController
@RequestMapping("/api/event")
public class EventController {

	@Autowired
	IEventService eventService;
	
	@GetMapping("/all")
	public List<Evenement> getAllEvents() {
		return eventService.getAll();
	}
	
	@PostMapping("/add")
	public void addEvent(@RequestBody EventRequest event) {
		Evenement evenement = new Evenement(event.getNom(), event.getDate(), event.getLieu());
		Date date = event.getDate();
		date.setHours(date.getHours()+1);
		evenement.setDateEVT(date);
		eventService.add(evenement);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEvent(@PathVariable Long id) {
		eventService.deleteById(id);
	}
}
