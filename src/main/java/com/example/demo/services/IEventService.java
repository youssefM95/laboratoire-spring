package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Evenement;

public interface IEventService {

	public List<Evenement> getAll();
	public void add(Evenement evenement);
	public void deleteById(Long id);
}
