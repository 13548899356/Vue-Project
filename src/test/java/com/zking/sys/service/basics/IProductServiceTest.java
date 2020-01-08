package com.zking.sys.service.basics;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.entity.basics.Product;
import com.zking.sys.service.BaseTestCase;

public class IProductServiceTest extends BaseTestCase{

	private Product p;
	private IProductService ip;
	
	@Before
	public void before() {
		p=new Product();
		ip=(IProductService) getBean("productService");
		
	}

	@Test
	public void testListProduct() {
		List<Product> list = ip.listProduct(p, null);
		for (Product pa : list) {
			System.out.println(pa);
		}
		
		
	}
	@Test
	public void testListType() {
		List<Object> list = ip.listType(p, "prodMemo");
		for (Object object : list) {
			System.out.println(object);
		}
		
		
	}
}
