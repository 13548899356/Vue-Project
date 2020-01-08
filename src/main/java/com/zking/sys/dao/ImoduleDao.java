package com.zking.sys.dao;

import java.util.List;

import com.zking.sys.entity.Module;

public interface ImoduleDao {

	public List<Module> listRootModule();

	public void listModuleById(int id ,Module m);
	
	
	/**
	 * @param 根据不同的用户信息查询出不同的权限信息
	 * @return
	 */
	public List<Module> listGetRoleRootModule(String str);
	
	
}
