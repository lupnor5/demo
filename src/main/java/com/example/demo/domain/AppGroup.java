package com.example.demo.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AppGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name; 
	private Boolean isAdmin;
	
	@ManyToMany(mappedBy = "groups")
	private Set<AppUser> users; 
	
	public AppGroup() {
		//Default constructor used by JPA 
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Set<AppUser> getUsers() {
		return users;
	}

	public void setUsers(Set<AppUser> users) {
		this.users = users;
	} 
	
	

}
