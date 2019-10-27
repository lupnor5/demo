package com.example.demo.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table (name = "app_user", schema = "public")
public class AppUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(columnDefinition = "serial")
	private Long id; 
	private String preferredLocale; 
	private String userName; 
	private String access; 
	private String preferredMarking; 
	private Boolean enabled; 
	private String email; 
	private Long spaceId;
	
	@ManyToMany
	@JoinTable(
			name = "app_group_membership",
			joinColumns = @JoinColumn(name = "appuser_id"),
			inverseJoinColumns = @JoinColumn (name = "appgroup_id"))
	private Set<AppGroup> groups; 
	
	
	public AppUser() {
		//Default constructor used by JPA
	}
	
	
	public AppUser(String preferredLocale, String userName, String access, String preferredMarking, Boolean enabled,
			String email, Long spaceId) {
		super();
		this.preferredLocale = preferredLocale;
		this.userName = userName;
		this.access = access;
		this.preferredMarking = preferredMarking;
		this.enabled = enabled;
		this.email = email;
		this.spaceId = spaceId;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPreferredLocale() {
		return preferredLocale;
	}
	public void setPreferredLocale(String preferredLocale) {
		this.preferredLocale = preferredLocale;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getPreferredMarking() {
		return preferredMarking;
	}
	public void setPreferredMarking(String preferredMarking) {
		this.preferredMarking = preferredMarking;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getSpaceId() {
		return spaceId;
	}
	public void setSpaceId(Long spaceId) {
		this.spaceId = spaceId;
	}
	public Set<AppGroup> getGroups() {
		return groups;
	}
	public void setGroups(Set<AppGroup> groups) {
		this.groups = groups;
	} 
	
	

}
