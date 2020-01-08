package com.zking.sys.dao.user;

import java.util.List;

import com.zking.sys.entity.user.sysUser;

public interface sysUser2Dao {

	/**
	 * @param 获取该用户所有的相关信息
	 * @return
	 */
	public List<sysUser> listSysUser(sysUser user);
	
	
	/**
	 * 添加用户的一些相关信息
	 */
	public void addUser(sysUser user);
	
	
	/**
	 * @param修改用户信息
	 */
	public void editUser(sysUser user);
	
	
	/**
	 * @param 删除
	 */
	public void delUser(sysUser user);
	
	/**
	 * @param 启用或锁定
	 */
	public void lock(sysUser user);
	
	
	
	public void addRoleModule(sysUser user);	
	
	
	public List<String> getRoleModule(sysUser user);
	
}
