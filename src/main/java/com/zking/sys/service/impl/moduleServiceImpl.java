package com.zking.sys.service.impl;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.ImoduleDao;
import com.zking.sys.entity.Module;
import com.zking.sys.service.moduleService;

/**
 * @author TimeDip
 *
 */
public class moduleServiceImpl extends BaseService implements moduleService {

	private ImoduleDao moduleDao;
	
	
	public moduleServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImoduleDao getModuleDao() {
		return moduleDao;
	}

	public void setModuleDao(ImoduleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	@Override
	public List<Module> listRootModule() {
		// TODO Auto-generated method stub
		return moduleDao.listRootModule();
	}

	@Override
	public void listModuleById(int id, Module m) {
		// TODO Auto-generated method stub
		 moduleDao.listModuleById(id, m);
	}

	@Override
	public List<Module> listGetRoleRootModule(String str) {
		// TODO Auto-generated method stub
		return moduleDao.listGetRoleRootModule(str);
	}

}
