package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.PublicationRepository;
import com.example.demo.dao.RoleRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Publication;
import com.example.demo.entities.Role;
import com.example.demo.services.IMemberService;

@SpringBootApplication

public class LaboratoireProjectApplication implements CommandLineRunner {

	@Autowired
	IMemberService memberService;
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	EnseignantChercheurRepository enseignantChercheurRepository;
	
	@Autowired
	EtudiantRepository etudiantRepository;;
	
	@Autowired
	PublicationRepository publicationRepository;

	public static void main(String[] args) {
		SpringApplication.run(LaboratoireProjectApplication.class, args);
	}
		public void run(String... args) throws Exception {
			// Update a Member
			/*Role r1= new Role("admin");
			Role r2= new Role ("user");
			roleRepository.save(r1);
			roleRepository.save(r2);
			
			Collection<Role> lst1= new ArrayList<Role>();
			lst1.add(r1);
			
			Collection<Role> lst2= new ArrayList<Role>();
			lst2.add(r2);
			
			// Ajout d'un membre enseignant chercheur ayant le role admin
			
			EnseignantChercheur ens1= new EnseignantChercheur("01752354", "Jmaiel", "Mohamed", new Date(), "", null, "jmaiel@enis.tn", "0000");
			ens1.setRoles(lst1);
			enseignantChercheurRepository.save(ens1);
			
			// Ajout d'un membre enseignant chercheur ayant le role user
			EnseignantChercheur ens2= new EnseignantChercheur("01752354", "mariam", "lahami", new Date(), "", null, "lahami@enis.tn", "2222");
			ens2.setRoles(lst2);
			enseignantChercheurRepository.save(ens2);
			
			// ajout de 3  étudiants 1 mastère et 2 thése ayant le role user
			Etudiant etd1= new Etudiant("081705454", "ben fekih", "rim", new Date(), "", null, "rim@enis.rn", "11111", null, "test", "these");
			Etudiant etd2= new Etudiant("885705454", "ben ahmed", "sana", new Date(), "", null, "sana@enis.rn", "11111", null, "test", "mastere");
			Etudiant etd3= new Etudiant("081454", "chaari", "rim", new Date(), "", null, "chaari@enis.rn", "11111", null, "test", "these");
			etd1.setRoles(lst2);
			etd2.setRoles(lst2);
			etd3.setRoles(lst2);
			
			etudiantRepository.save(etd1);
			etudiantRepository.save(etd2);
			etudiantRepository.save(etd3);
			
			Publication pubs= new Publication("poster", new Date(), "lien", "pdf");
			Collection<Membre> auteurs= new ArrayList<Membre>();
			auteurs.add(etd1);
			auteurs.add(ens1);
			auteurs.add(ens2);
			pubs.setAuteurs(auteurs);
			
			publicationRepository.save(pubs);*/
			
			/*Membre m= memberService.findMember(2L);
			m.setCv("cv1.pdf");
			memberService.updateMember(m);*/
			// Delete a Member
			//memberService.deleteMember(20L);
			
		}
		
	}


