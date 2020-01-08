package com.zking.sys.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.basics.Product;
import com.zking.sys.entity.customer.OrderLine;
import com.zking.sys.service.basics.IProductService;
import com.zking.sys.service.customer.IOrderLineService;

public class IOrderLineServiceTest extends BaseTestCase {

	private IOrderLineService ios;
	private OrderLine order;
	private Product p;
	private IProductService product;

	@Before
	public void setUp() throws Exception {
		ios = (IOrderLineService) getBean("orderLineService");
		product = (IProductService) getBean("productService");
		order = new OrderLine();
		p = new Product();
	}

	@Test
	public void testDoGetOrderLine() {
//		order.setOddOrderId("1234");
//		List<OrderLine> line = ios.doGetOrderLine(order);
//		for (OrderLine orderLine : line) {
//			System.out.println(orderLine.getOddProdId());
//
//			p.setProdId(orderLine.getOddProdId());
//			List<Product> list = product.listOther(p, null);
//			for (Product oo : list) {
//				System.out.println(oo);
//			}
//
//		}
		
		List<Product> list = product.listOther(p, null);
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
