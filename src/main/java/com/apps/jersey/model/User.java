package com.apps.jersey.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private Long userId = 0L;
	private String userName = "";
	private String firstName  = "";
	private String lastName = "";
	private List<Role> roles = new ArrayList<Role>();
	
	public User() {
	}
	
	public User(Long userId, String userName, String firstName, String lastName, List<Role> roles) {
		this.userId = userId;
		this.userName = userName;
		this.firstName  = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
