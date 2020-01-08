package com.zking.sys.service.customer;

import java.util.List;

import com.zking.sys.entity.customer.Orders;

public interface addCstLostService {

	
	/**
	 * 自动检测订单信息，并将符合条件的信息自动添加到客户流表中
	 */
	public List<Orders> addCstLoadOfComputer(); 
	
	
	
	
	
	
}
