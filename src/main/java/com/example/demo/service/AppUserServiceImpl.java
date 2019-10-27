package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AppUserDAO;
import com.example.demo.domain.AppGroup;
import com.example.demo.domain.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.repository.AppGroupRepository;;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	private AppUserRepository repository; 
	
	@Autowired 
	private AppGroupRepository groupRepository; 
	
	
	@Override
	public void save(AppUserDAO appUserDAO) {
		
		AppGroup group = groupRepository.findById(520L).get(); 
		AppUser appUser =  new AppUser(
				appUserDAO.getId(),
				appUserDAO.getPreferredLocale(), 
				appUserDAO.getUserName(), 
				appUserDAO.getAccess(), 
				appUserDAO.getPreferredMarking(),
				appUserDAO.getEnabled(), 
				appUserDAO.getEmail(), 
				appUserDAO.getAlias(),
				appUserDAO.getUrn(),
				appUserDAO.getSpaceId()
				);
		
		appUser.getGroups().add(group); 
	    
		repository.save(appUser); 
		
	}
	
	@Override 
	public void delete(Long id) {
		repository.deleteById(id);;
	}

}
