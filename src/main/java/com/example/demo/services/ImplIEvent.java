package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entities.Evenement;

@Service
public class ImplIEvent implements IEventService {
	
	@Autowired
	EvenementRepository evenementRepository;

	@Override
	public List<Evenement> getAll() {
		return evenementRepository.findAll();
	}

	@Override
	public void add(Evenement evenement) {
		evenementRepository.save(evenement);
		
	}

	@Override
	public void deleteById(Long id) {
		evenementRepository.deleteById(id);
	}

}
