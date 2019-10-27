package com.example.demo.service;

import com.example.demo.dao.AppUserDAO;

public interface AppUserService {
	
 void save(AppUserDAO appUserDAO); 

 void delete(Long id); 

}
