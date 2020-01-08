package com.zking.sys.entity.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class sysRole implements Serializable{

	private String roleId;//主键
	private String roleName;//角色名
	private Integer available;//是否可用
	
	private String description;//角色描述

	private sysUser user;
	
	
	public sysRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public sysUser getUser() {
		return user;
	}

	public void setUser(sysUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "sysRole [roleId=" + roleId + ", roleName=" + roleName + ", available=" + available + ", description="
				+ description + ", user=" + user + "]";
	}
	
	
	
	
	
	
	
}
