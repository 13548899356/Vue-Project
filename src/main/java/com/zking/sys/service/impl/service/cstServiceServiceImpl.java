package com.zking.sys.service.impl.service;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.impl.service.cstServiceDaoImpl;
import com.zking.sys.entity.service.cstService;
import com.zking.sys.service.service.IcstServiceService;
import com.zking.util.PageBean;

public class cstServiceServiceImpl extends BaseService implements IcstServiceService{
	private static final long serialVersionUID = 1L;
	private cstServiceDaoImpl cstServiceDao=new cstServiceDaoImpl();
	
	public cstServiceServiceImpl() {
		super();
	}
	
	public cstServiceDaoImpl getCstServiceDao() {
		return cstServiceDao;
	}


	public void setCstServiceDao(cstServiceDaoImpl cstServiceDao) {
		this.cstServiceDao = cstServiceDao;
	}


	@Override
	public void addService(cstService cstservice) {
		cstServiceDao.addService(cstservice);
	}
	@Override
	public void delService(cstService cstservice) {
		cstServiceDao.delService(cstservice);
	}

	@Override
	public void editService(cstService cstservice) {
		cstServiceDao.editService(cstservice);
	}

	@Override
	public List<cstService> listService(cstService cstservice,PageBean pageBean) {
		return cstServiceDao.listService(cstservice, pageBean);
	}

	@Override
	public cstService loadService(cstService cstservice) {
		return cstServiceDao.loadService(cstservice);
	}

	@Override
	public List<cstService> listServers(cstService server) {
		// TODO Auto-generated method stub
		return cstServiceDao.listServers(server);
	}

}
