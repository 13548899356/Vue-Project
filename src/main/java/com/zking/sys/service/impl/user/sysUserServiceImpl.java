package com.zking.sys.service.impl.user;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.impl.user.sysUserDaoImpl;
import com.zking.sys.dao.user.IsysUserDao;
import com.zking.sys.entity.user.sysUser;
import com.zking.sys.service.user.IsysUserService;

public class sysUserServiceImpl extends BaseService implements IsysUserService {

	private IsysUserDao sysUserDao=new sysUserDaoImpl();

		public IsysUserDao getSysUserDao() {
			return sysUserDao;
		}
	
		public void setSysUserDao(IsysUserDao sysUserDao) {
			this.sysUserDao = sysUserDao;
		}
	
		public sysUserServiceImpl() {
			super();
			// TODO Auto-generated constructor stub
		}

	@Override
	public sysUser doLogin(sysUser user) {
		// TODO Auto-generated method stub
		return sysUserDao.doLogin(user);
	}

	@Override
	public void doRegister(sysUser user) {
		// TODO Auto-generated method stub
			sysUserDao.doRegister(user);
	}

	@Override
	public List<sysUser> listUser(sysUser user) {
		// TODO Auto-generated method stub
		return sysUserDao.listUser(user);
	}

}
