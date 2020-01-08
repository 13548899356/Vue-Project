package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.IOrderLineDao;
import com.zking.sys.dao.impl.customer.orderDaoImpl;
import com.zking.sys.entity.customer.OrderLine;
import com.zking.sys.service.customer.IOrderLineService;

public class OrderLineServiceImpl extends BaseService implements IOrderLineService {

	private IOrderLineDao orderLineDao;
	
	
	
	public IOrderLineDao getOrderLineDao() {
		return orderLineDao;
	}



	public void setOrderLineDao(IOrderLineDao orderLineDao) {
		this.orderLineDao = orderLineDao;
	}



	public OrderLineServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<OrderLine> doGetOrderLine(OrderLine order) {
		// TODO Auto-generated method stub
		return orderLineDao.doGetOrderLine(order);
	}



	
}
