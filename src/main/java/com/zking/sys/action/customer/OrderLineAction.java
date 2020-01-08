package com.zking.sys.action.customer;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.action.basics.ProductAction;
import com.zking.sys.entity.basics.Product;
import com.zking.sys.entity.customer.OrderLine;
import com.zking.sys.service.basics.IProductService;
import com.zking.sys.service.customer.IOrderLineService;
import com.zking.util.PageBean;

public class OrderLineAction extends BaseAction implements ModelDriven<OrderLine> {

	private OrderLine order=new OrderLine();
	private IOrderLineService orderLineService;
	private PageBean pageBean=new PageBean();
	private Product p=new Product();
	private IProductService ip;
	
	@Override
	public OrderLine getModel() {
		// TODO Auto-generated method stub
		return order;
	}

	public IOrderLineService getOrderLineService() {
		return orderLineService;
	}

	public void setOrderLineService(IOrderLineService orderLineService) {
		this.orderLineService = orderLineService;
	}
	
	
	public String doGetOrderLine() {
		try {
			List<OrderLine> line = orderLineService.doGetOrderLine(order);
			super.toJSONObject(true, line);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	
	

}
