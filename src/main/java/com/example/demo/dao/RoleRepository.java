package com.example.demo.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ERole;

import com.example.demo.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	List<Role> findAll();

	Optional<Role> findByRoleName(ERole roleStudent);

	void deleteAll();
}
