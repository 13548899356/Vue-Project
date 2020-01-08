package com.zking.sys.dao.customer;

import java.util.List;

import com.zking.sys.entity.customer.OrderLine;

public interface IOrderLineDao {

	/**
	 * @param 订单明细
	 * @return
	 */
	public List<OrderLine> doGetOrderLine(OrderLine order);
	
	
	
	
	
	
	
}
