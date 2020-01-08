package com.zking.sys.dao.user;

import java.util.List;

import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.entity.user.sysUser;

public interface IsysUserDao {


	/**
	 * 用户登录
	 * @param user
	 * @return sysUser对象
	 */
	public sysUser doLogin(sysUser user);
	
	
	/**
	 * 用户注册
	 * @param user
	 */
	public void doRegister(sysUser user);
	
	
	
	public List<sysUser> listUser(sysUser user); 
	
	
	
	
}
