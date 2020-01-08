package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.IorderdDao;
import com.zking.sys.entity.customer.Orders;
import com.zking.sys.service.customer.IorderService;
import com.zking.util.PageBean;

public class orderServiceImpl extends BaseService implements IorderService {
	
	private IorderdDao orderDao;
	
	
	public IorderdDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(IorderdDao orderDao) {
		this.orderDao = orderDao;
	}

	public orderServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Orders> listOrders(Orders order, PageBean pageBean) {
		// TODO Auto-generated method stub
		return orderDao.listOrders(order, pageBean);
	}

	@Override
	public Orders doGetOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderDao.doGetOrder(order);
	}

	@Override
	public List<Orders> listOrdersDate(Orders order) {
		// TODO Auto-generated method stub
		return orderDao.listOrdersDate(order);
	}

}
