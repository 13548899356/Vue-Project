package com.zking.sys.dao.customer;

import java.util.List;

import com.zking.sys.entity.customer.Orders;
import com.zking.sys.entity.customer.cstLost;
import com.zking.util.PageBean;

public interface addCstLost {

	/**
	 * 自动检测订单信息，并将符合条件的信息自动添加到客户流表中
	 */
	public List<Orders> addCstLoadOfComputer(); 
	

	
}
