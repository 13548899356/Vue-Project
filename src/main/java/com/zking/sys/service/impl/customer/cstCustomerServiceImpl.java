package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.IcstCustomerDao;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.service.customer.IcstCustomerService;
import com.zking.util.PageBean;

public class cstCustomerServiceImpl extends BaseService implements IcstCustomerService {

	
	private IcstCustomerDao  customerDao; 
	
	public IcstCustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(IcstCustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public cstCustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<cstCustomer> listCstCustmoer(cstCustomer cs,PageBean pageBean) {
		// TODO Auto-generated method stub
		return customerDao.listCstCustmoer(cs, pageBean);
	}

	@Override
	public cstCustomer doGetCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
		return customerDao.doGetCustomer(cs);
	}

	@Override
	public void delCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
		customerDao.delCustomer(cs);
	}

	@Override
	public void editCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
		customerDao.editCustomer(cs);
	}

	@Override
	public void addCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(cs);
	}

	@Override
	public void addCustomer2(cstCustomer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer2(customer);
	}

}
