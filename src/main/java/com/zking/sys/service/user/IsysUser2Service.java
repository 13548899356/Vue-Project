package com.zking.sys.service.user;

import java.util.List;

import com.zking.sys.entity.user.sysUser;

public interface IsysUser2Service {

	public List<sysUser> listSysUser(sysUser user);
	
	
	/**
	 * 添加用户的一些相关信息
	 */
	public void addUser(sysUser user);
	
	public void editUser(sysUser user);
	
	public void delUser(sysUser user);
	
	public void lock(sysUser user);
	
	public void addRoleModule(sysUser user);
	
	public List<String> getRoleModule(sysUser user);
}
