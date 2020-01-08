package com.zking.sys.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.customer.Orders;
import com.zking.sys.service.customer.IorderService;
import com.zking.util.PageBean;

public class IorderServiceTest extends BaseTestCase {

	private Orders o;
	private PageBean pageBean=new PageBean();
	private IorderService os;
	
	
	@Before
	public void setUp() throws Exception {
		o=new Orders();
		os=(IorderService) getBean("orderService");
		
	}

	@Test
	public void test() {
		o.setOdrCustmoer("腾讯");
		List<Orders> list = os.listOrders(o, pageBean);
		for (Orders orders : list) {
			System.out.println(orders);
		}
		
	}
	@Test
	public void testDoGetOrder() {
//		o.setOdrId("1343445");
//		Orders oo = os.doGetOrder(o);
//		System.out.println(oo);
		
		List<Orders> date = os.listOrdersDate(o);
		for (Orders orders : date) {
			System.out.println(orders);
		}
		
	}
}
