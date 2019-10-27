package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AppUserDAO;
import com.example.demo.service.AppUserService;

@RestController
@RequestMapping(value = "/app-user")
public class AppUserController {
	
	@Autowired 
	AppUserService service; 
	
	@PostMapping
	public void save (@RequestBody AppUserDAO appUserDAO) {
		service.save(appUserDAO);
	}
	
	@DeleteMapping(value = {"/{id}"})
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
	
}
