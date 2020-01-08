package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.IcstLinkmanDao;
import com.zking.sys.entity.customer.cstLinkman;
import com.zking.sys.service.customer.IcstLinkmanService;
import com.zking.util.PageBean;

public class cstLinkmanServiceImpl extends BaseService implements IcstLinkmanService {

	
	private IcstLinkmanDao linkmanDao;
	
	
	
	public IcstLinkmanDao getLinkmanDao() {
		return linkmanDao;
	}

	public void setLinkmanDao(IcstLinkmanDao linkmanDao) {
		this.linkmanDao = linkmanDao;
	}

	public cstLinkmanServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
		linkmanDao.addLinkman(linkman);
	}

	@Override
	public void delLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
		linkmanDao.delLinkman(linkman);
	}

	@Override
	public void editLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
		linkmanDao.editLinkman(linkman);
	}

	@Override
	public List<cstLinkman> listLinkman(cstLinkman linkman, PageBean pageBean) {
		// TODO Auto-generated method stub
		return linkmanDao.listLinkman(linkman, pageBean);
	}

	@Override
	public cstLinkman doGetLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
		return linkmanDao.doGetLinkman(linkman);
	}

}
