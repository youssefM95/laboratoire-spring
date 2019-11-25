package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RoleRepository;
import com.example.demo.entities.Role;

@Service
public class ImplRole implements IRoleService{

	@Autowired
	RoleRepository role;

	@Override
	public List<Role> getAll() {
		
		return role.findAll();
	}
	
	
}
