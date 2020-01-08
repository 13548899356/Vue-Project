package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.IcstLostDao;
import com.zking.sys.entity.customer.cstLost;
import com.zking.sys.service.customer.IcstLostService;
import com.zking.util.PageBean;

public class cstLostServiceImpl extends BaseService implements IcstLostService{

	private IcstLostDao cstLostDao;
	
	public IcstLostDao getCstLostDao() {
		return cstLostDao;
	}

	public void setCstLostDao(IcstLostDao cstLostDao) {
		this.cstLostDao = cstLostDao;
	}

	@Override
	public void doStopCstLost(cstLost lost) {
		// TODO Auto-generated method stub
		cstLostDao.doStopCstLost(lost);
	}

	@Override
	public void doSureCstLost(cstLost lost) {
		// TODO Auto-generated method stub
		cstLostDao.doSureCstLost(lost);
	}

	@Override
	public List<cstLost> listCstLost(cstLost lost, PageBean pageBean) {
		// TODO Auto-generated method stub
		return cstLostDao.listCstLost(lost, pageBean);
	}

	@Override
	public cstLost doGetLost(String id) {
		// TODO Auto-generated method stub
		return cstLostDao.doGetLost(id);
	}

}
