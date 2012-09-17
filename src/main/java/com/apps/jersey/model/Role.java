package com.apps.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Role {
	
	private Long roleId = 0L;
	private String roleName = "";
	private Boolean roleStatus = Boolean.FALSE;
	
	public Role() {
	}
	
	public Role(Long roleId, String roleName, Boolean roleStatus) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleStatus = roleStatus;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Boolean getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(Boolean roleStatus) {
		this.roleStatus = roleStatus;
	}
	
}
