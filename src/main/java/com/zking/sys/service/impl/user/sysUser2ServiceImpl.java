package com.zking.sys.service.impl.user;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.impl.user.sysUser2DaoImpl;
import com.zking.sys.dao.user.sysUser2Dao;
import com.zking.sys.entity.user.sysUser;
import com.zking.sys.service.user.IsysUser2Service;

public class sysUser2ServiceImpl extends BaseService implements IsysUser2Service {

	private sysUser2Dao userDao=new sysUser2DaoImpl();
	
	@Override
	public List<sysUser> listSysUser(sysUser user) {
		// TODO Auto-generated method stub
		return userDao.listSysUser(user);
	}

	@Override
	public void addUser(sysUser user) {
		userDao.addUser(user);
	}

	@Override
	public void editUser(sysUser user) {
		// TODO Auto-generated method stub
		userDao.editUser(user);
	}

	@Override
	public void delUser(sysUser user) {
		// TODO Auto-generated method stub
		userDao.delUser(user);
	}

	@Override
	public void lock(sysUser user) {
		// TODO Auto-generated method stub
		userDao.lock(user);
	}

	@Override
	public void addRoleModule(sysUser user) {
		// TODO Auto-generated method stub
		userDao.addRoleModule(user);
	}

	@Override
	public List<String> getRoleModule(sysUser user) {
		// TODO Auto-generated method stub
		return userDao.getRoleModule(user);
	}

}
