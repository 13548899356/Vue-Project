package com.zking.sys.service.impl.user;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.impl.user.sysRoleDaoImpl;
import com.zking.sys.dao.user.IsysRoleDao;
import com.zking.sys.entity.user.sysRole;
import com.zking.sys.service.user.IsysRoleService;

public class sysRoleServiceImpl extends BaseService implements IsysRoleService {

	private IsysRoleDao roleDao=new sysRoleDaoImpl();
	
	
	public sysRoleServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IsysRoleDao getRoleDao() {
		return roleDao;
	}


	public void setRoleDao(IsysRoleDao roleDao) {
		this.roleDao = roleDao;
	}


	@Override
	public List<sysRole> listRole(sysRole role) {
		// TODO Auto-generated method stub
		return roleDao.listRole(role);
	}

}
