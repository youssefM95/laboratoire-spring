package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Outil;

public interface OutilRepository extends JpaRepository<Outil, Long> {
	List<Outil> findAll();
	List<Outil> findByNom(String cin);
	List<Outil> findByNomStartingWith(String caractere);
	List<Outil> findBySource(String source);
	List<Outil> findByDate(Date date);
	
}
