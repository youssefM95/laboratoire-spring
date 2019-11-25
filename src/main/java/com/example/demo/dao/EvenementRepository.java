package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Evenement;
import com.example.demo.entities.Membre;

public interface EvenementRepository extends JpaRepository<Evenement, Long>{

	List <Evenement> findByNom(String nom);
	List<Membre> findByNomStartingWith(String caractere);
	List<Membre> findByDateEVT(Date date);
	List<Membre> findByLieu(String lieu);
}
