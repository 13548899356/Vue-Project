package com.zking.sys.service.customer;

import java.util.List;

import com.zking.sys.entity.customer.OrderLine;

public interface IOrderLineService {
	
	/**
	 * @param 订单明细
	 * @return
	 */
	public List<OrderLine> doGetOrderLine(OrderLine order);
	
}
