package com.example.demo.service;

import com.example.demo.dao.AppUserDAO;

public interface AppUserService {
	
/**
 * Create a new {@link AppUSer} and its default relationship with a group. 	
 * @param appUserDAO the input data to create an user 
 */
	
 void save(AppUserDAO appUserDAO); 
 
 /**
  * Delete an {@link AppUser} given its id
  * @param id the user id
  */
 
 void delete(Long id); 

}
