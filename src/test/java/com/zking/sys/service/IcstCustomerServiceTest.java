package com.zking.sys.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.service.customer.IcstCustomerService;
import com.zking.util.PageBean;

public class IcstCustomerServiceTest extends BaseTestCase {

	private cstCustomer c;
	private IcstCustomerService cs;
	private PageBean pageBean;
	@Before
	public void Before()  {
		c=new cstCustomer();		 	   
		cs=(IcstCustomerService)super.getBean("customerService");
		pageBean=new PageBean();
	}

	@Test
	public void test() {
//		c.setCustName("小");
		c.setCustLevelLabel("2");
		List<cstCustomer> list = cs.listCstCustmoer(c,pageBean);
		for (cstCustomer cstCustomer : list) {
			System.out.println(cstCustomer);
		}
		
		
	}
	@Test
	public void test2() {
//		c.setCustNo("KHD71202003");
		c.setCustName("京东");
		c.setCustRegion("浙江");
		c.setCustManagetName("小明2");
		c.setCustLevelLabel("战略合作伙伴");
		c.setCustAddr("杭州");
		c.setCustZip("422100");
		c.setCustTel("001-0101");
		c.setCustFax("001-0102");
		c.setCustWebsite("www.alibabagroup.com");
		c.setCustChieftain("马云");
		c.setCustBankroll(100);
		c.setCustTurnover(100000);
		c.setCustBank("不详");
		c.setCustBankAccount("1208208820");	
		c.setCustStatus("1");
		cs.addCustomer(c);
		
	}
	
	@Test
	public void test3() {
		c.setCustNo("KHD71202003");
		cstCustomer customer = cs.doGetCustomer(c);
		
		System.out.println(customer);
	}
	
	

}
