package com.zking.sys.service.customer;

import java.util.List;

import com.zking.sys.entity.customer.Orders;
import com.zking.util.PageBean;

public interface IorderService {
	/**
	 * @param 订单查询
	 * @return list集合
	 */
	public List<Orders> listOrders(Orders order,PageBean pageBean);
	
	
	/**
	 * @param 订单详情
	 * @return
	 */
	public Orders doGetOrder(Orders order);
	
	
	/**
	 * @param 查询从各客户的最近下单时间的客户信息（用于客户流失）
	 * @return
	 */
	public List<Orders> listOrdersDate(Orders order);
}
