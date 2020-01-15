package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Evenement;
import com.example.demo.entities.Membre;

public interface EvenementRepository extends JpaRepository<Evenement, Long>{

	List <Evenement> findByNom(String nom);
	List<Evenement> findByNomStartingWith(String caractere);
	List<Evenement> findByDateEVT(Date date);
	List<Evenement> findByLieu(String lieu);
	
	void deleteById(Long id);
}
