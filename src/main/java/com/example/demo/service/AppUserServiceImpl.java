package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AppUserDAO;
import com.example.demo.domain.AppUser;
import com.example.demo.repository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	private AppUserRepository repository; 
	
	
	@Override
	public void save(AppUserDAO appUserDAO) {
		AppUser appUser =  new AppUser(
				appUserDAO.getPreferredLocale(), 
				appUserDAO.getUserName(), 
				appUserDAO.getAccess(), 
				appUserDAO.getPreferredMarking(),
				appUserDAO.getEnabled(), 
				appUserDAO.getEmail(), 
				appUserDAO.getSpaceId()
				);
		
		repository.save(appUser); 
		
	}

}
