package com.zking.sys.service.impl.market;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.market.IsalChanceDao;
import com.zking.sys.entity.market.salChance;
import com.zking.sys.service.market.IsalChanceService;
import com.zking.util.PageBean;

public class salChanceServiceImpl extends BaseService implements IsalChanceService{

	private IsalChanceDao salChanceDao;
	
	public IsalChanceDao getSalChanceDao() {
		return salChanceDao;
	}

	public void setSalChanceDao(IsalChanceDao salChanceDao) {
		this.salChanceDao = salChanceDao;
	}

	@Override
	public void addSalChance(salChance salChance) {
		// TODO Auto-generated method stub
		salChanceDao.addSalChance(salChance);
	}

	@Override
	public void editSalChance(salChance salChance) {
		// TODO Auto-generated method stub
		salChanceDao.editSalChance(salChance);
	}

	@Override
	public void delSalChance(salChance salChance) {
		// TODO Auto-generated method stub
		salChanceDao.delSalChance(salChance);
	}

	@Override
	public List<salChance> querySalchancePager(salChance salChance, PageBean pageBean) {
		// TODO Auto-generated method stub
		return salChanceDao.querySalchancePager(salChance, pageBean);
	}

	@Override
	public List<salChance> Putaway(salChance salChance, PageBean pageBean) {
		// TODO Auto-generated method stub
		return salChanceDao.Putaway(salChance, pageBean);
	}

	@Override
	public List<salChance> Noputaway(salChance salChance, PageBean pageBean) {
		// TODO Auto-generated method stub
		return salChanceDao.Noputaway(salChance, pageBean);
	}

}
