package com.zking.sys.service.impl.market;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.market.IsalChanceDao;
import com.zking.sys.dao.market.IsalPlanDao;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.entity.market.salPlan;
import com.zking.sys.service.market.IsalPlanService;
import com.zking.util.PageBean;

public class salPlanServiceImpl extends BaseService implements IsalPlanService{
	
	private IsalPlanDao salPlanDao;
	
	public IsalPlanDao getSalPlanDao() {
		return salPlanDao;
	}

	public void setSalPlanDao(IsalPlanDao salPlanDao) {
		this.salPlanDao = salPlanDao;
	}

	@Override
	public void addSalPlan(salPlan salPlan) {
		// TODO Auto-generated method stub
		salPlanDao.addSalPlan(salPlan);
	}

	@Override
	public void editSalPlan(salPlan salPlan) {
		// TODO Auto-generated method stub
		salPlanDao.editSalPlan(salPlan);
	}

	@Override
	public void delSalPlan(salPlan salPlan) {
		// TODO Auto-generated method stub
		salPlanDao.delSalPlan(salPlan);
	}

	@Override
	public List<salPlan> querySalPlanPager(salPlan salPlan, PageBean pageBean) {
		// TODO Auto-generated method stub
		return salPlanDao.querySalPlanPager(salPlan, pageBean);
	}

}
