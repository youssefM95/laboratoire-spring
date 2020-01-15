package com.example.demo.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.Membre;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	MemberRepository membreRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Membre membre = membreRepository.findByEmail(email)
					.orElseThrow(() -> new UsernameNotFoundException("Membre Not Found with email: " + email));
		

		return UserDetailsImpl.build(membre);
	}
}
