package com.zking.sys.entity.user;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


public class sysUser implements Serializable{

	private String userId;  //用户ID
	private String userName;  //账号
	private String password;  //密码
	
	private String salt;  //盐，用于密码相同时区分
	private Integer locked;   //账号是否锁定
	private Timestamp createDateTime; //创建日期
	
	private int position;//职位  1；客户经理  2.销售主管  3.系统管理员   4.高管
	
	//	建立关联关系
	private sysRole role;
	private String roleName;
	private String description;
	//权限所需
	private String  moduleId;
	
	
	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public sysUser() {}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Timestamp getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Timestamp createDateTime) {
		this.createDateTime = createDateTime;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public sysRole getRole() {
		return role;
	}

	public void setRole(sysRole role) {
		this.role = role;
	}

	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "sysUser [userId=" + userId + ", userName=" + userName + ", password=" + password + ", salt=" + salt
				+ ", locked=" + locked + ", createDateTime=" + createDateTime + ", position=" + position + ", role="
				+ role + ", roleName=" + roleName + ", description=" + description + "]";
	}

	

	

	
	
	
	
	
	
	
}
