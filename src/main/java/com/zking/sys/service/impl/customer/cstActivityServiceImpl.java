package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.IcstActivityDao;
import com.zking.sys.entity.customer.cstActivity;
import com.zking.sys.service.customer.IcstActivityService;
import com.zking.util.PageBean;

public class cstActivityServiceImpl extends BaseService implements IcstActivityService {

	private IcstActivityDao activityDao;
	
	
	
	public cstActivityServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IcstActivityDao getActivityDao() {
		return activityDao;
	}

	public void setActivityDao(IcstActivityDao activityDao) {
		this.activityDao = activityDao;
	}

	@Override
	public void addActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		activityDao.addActivity(activity);
	}

	@Override
	public void delActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		activityDao.delActivity(activity);
	}

	@Override
	public void editActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		activityDao.editActivity(activity);
	}

	@Override
	public List<cstActivity> listActivity(cstActivity activity, PageBean pageBean) {
		// TODO Auto-generated method stub
		return activityDao.listActivity(activity, pageBean);
	}

	@Override
	public cstActivity doGetActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		return activityDao.doGetActivity(activity);
	}

	
	
	
	
	
	
	
}
