package com.example.demo.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import com.example.demo.entities.Membre;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String email;

	@JsonIgnore
	private String password;

	private GrantedAuthority authoritie;

	public UserDetailsImpl(Long id, String email, String password,
			 GrantedAuthority authoritie) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.authoritie = authoritie;
	}

	public static UserDetailsImpl build(Membre membre) {
		GrantedAuthority authoritie = new SimpleGrantedAuthority(membre.getRole().getRoleName().name());

		return new UserDetailsImpl(
				membre.getId(),  
				membre.getEmail(),
				membre.getPassword(), 
				authoritie);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(this.authoritie);
		return authorities;
	}

	public Long getId() {
		return id;
	}

	

	@Override
	public String getPassword() {
		return password;
	}

	

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(id, user.id);
	}

	@Override
	public String getUsername() {
		return email;
	}
}
