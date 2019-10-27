package com.example.demo.dao;

public class AppUserDAO {
	
	private String preferredLocale; 
	private String userName; 
	private String access; 
	private String preferredMarking; 
	private Boolean enabled; 
	private String email; 
	private Long spaceId;
	
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
	

}
