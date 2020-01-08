package com.zking.sys.action.customer;


import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.Orders;
import com.zking.sys.service.customer.IorderService;
import com.zking.util.PageBean;

public class OrdersAction extends BaseAction implements ModelDriven<Orders>{

	private Orders order=new Orders();
	private IorderService orderService;
	private PageBean pageBean=new PageBean();
	
	public IorderService getOrderService() {
		return orderService;
	}


	public void setOrderService(IorderService orderService) {
		this.orderService = orderService;
	}


	public OrdersAction() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public Orders getModel() {
		// TODO Auto-generated method stub
		return order;
	}
	
	
	public String listOrder() {
		try {
			List<Orders> list = orderService.listOrders(order, pageBean);
			super.toJSONPager("ok", true, pageBean.getTotal(), list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public String doGetOrder() {
		try {
			Orders orders = orderService.doGetOrder(order);
			super.toJSONObject(true, orders);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	

}
