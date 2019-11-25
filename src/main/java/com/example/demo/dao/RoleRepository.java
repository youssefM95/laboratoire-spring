package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Publication;
import com.example.demo.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	List<Role> findAll();

	List<Publication> findByRoleName(String roleName);

	void deleteAll();
}
