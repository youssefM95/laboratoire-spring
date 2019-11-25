package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.services.IRoleService;
@RestController
public class RoleRestController {

	@Autowired
	IRoleService role;
	
	@RequestMapping(value="/roles" , method = RequestMethod.GET)
	public List<Role> getAll()
	{
		return role.getAll();
	}
}
