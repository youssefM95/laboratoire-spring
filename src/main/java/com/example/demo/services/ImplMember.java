package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

@Service
public class ImplMember implements IMemberService{

@Autowired

MemberRepository memberRepository;

@Autowired
EtudiantRepository etudiantRepository;

@Autowired EnseignantChercheurRepository enseignantChercheurRepository;
@Override
public Membre addMember(Membre m) {
	memberRepository.save(m);
	return m;
}

@Override
public void deleteMember(Long id) {
	
	memberRepository.deleteById(id);
}

@Override
public Membre updateMember(Membre m) {
	memberRepository.saveAndFlush(m);
	return m;
}

@Override
public Membre findMember(Long id) {
	return memberRepository.findById(id).get();
	
}

@Override
public List<Membre> findAll() {
	return memberRepository.findAll();
	
}

@Override
public Membre findByCin(String cin) {
	return memberRepository.findByCin(cin);
}

@Override
public Optional<Membre> findByEmail(String email) {
	return memberRepository.findByEmail(email);
}

@Override
public List<Membre> findByNom(String nom) {
	return memberRepository.findByNom(nom);
}

@Override
public List<Etudiant> findByDiplome(String diplome) {
	return etudiantRepository.findByDiplome(diplome);
}

@Override
public List<EnseignantChercheur> findByGrade(String grade) {
	return enseignantChercheurRepository.findByGrade(grade);
}

@Override
public List<EnseignantChercheur> findByEtablissement(String etablissement) {
	return enseignantChercheurRepository.findByEtablissement(etablissement);
}

@Override
public Membre findById(Long idAuteur) {
	return memberRepository.findById(idAuteur).get();
}
	
}
