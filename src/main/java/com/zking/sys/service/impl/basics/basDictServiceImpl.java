package com.zking.sys.service.impl.basics;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.basics.IbasDictDao;
import com.zking.sys.entity.basics.basDict;
import com.zking.sys.service.basics.IbasDictService;
import com.zking.util.PageBean;

public class basDictServiceImpl extends BaseService implements IbasDictService {

	private IbasDictDao basDictDao;
	
	
	public IbasDictDao getBasDictDao() {
		return basDictDao;
	}

	public void setBasDictDao(IbasDictDao basDictDao) {
		this.basDictDao = basDictDao;
	}

	public basDictServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBasDict(basDict dict) {
		basDictDao.addBasDict(dict);
		
	}

	@Override
	public void delBasDict(basDict dict) {
		// TODO Auto-generated method stub
		basDictDao.delBasDict(dict);
	}

	@Override
	public void editBasDict(basDict dict) {
		// TODO Auto-generated method stub
		basDictDao.editBasDict(dict);
	}

	@Override
	public List<basDict> listBasDict(basDict dict, PageBean pageBean) {
		// TODO Auto-generated method stub
		return basDictDao.listBasDict(dict, pageBean);
	}

	@Override
	public Object doGetType(basDict dict,String str) {
		// TODO Auto-generated method stub
		return basDictDao.doGetType(dict,str);
	}

	@Override
	public List<Object> listType() {
		// TODO Auto-generated method stub
		return basDictDao.listType();
	}

	@Override
	public List<Object> listOther(basDict dict, String str) {
		// TODO Auto-generated method stub
		return basDictDao.listOther(dict, str);
	}

}
