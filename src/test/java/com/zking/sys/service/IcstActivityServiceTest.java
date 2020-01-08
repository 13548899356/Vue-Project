package com.zking.sys.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.customer.cstActivity;
import com.zking.sys.service.customer.IcstActivityService;
import com.zking.util.PageBean;

public class IcstActivityServiceTest extends BaseTestCase {

	private cstActivity ac;
	private PageBean pageBean=new PageBean();
	private IcstActivityService ic;
	
	
	@Before
	public void before() {
		ac=new cstActivity();
		ic=(IcstActivityService) getBean("activityService");
		
		
	}

	@Test
	public void testAddActivity() {
		ac.setAtvCustNo("KHD71202002");
		ac.setAtvCustName("马化腾3");
		ac.setAtvPlace("公司3");
		ac.setAtvTitle("2019行业展望座谈会");
		ac.setAtvRemark("主办方");
		ac.setAtvDesc("开会");
		
		ic.addActivity(ac);
	}

	@Test
	public void testDelActivity() {
		ac.setAtvId("402809816d725890016d725894880000");
		ic.delActivity(ac);
	}

	@Test
	public void testEditActivity() {
		ac.setAtvId("402809816d725a72016d725a75b30000");
		ac.setAtvCustNo("KHD71202002");
		ac.setAtvCustName("马化腾");
		ac.setAtvPlace("公司");
		ac.setAtvTitle("2019行业展望座谈会");
		ac.setAtvRemark("主办方");
		ac.setAtvDesc("开会");
		ic.editActivity(ac);
	}

	@Test
	public void testListActivity() {
		ac.setAtvCustNo("KHD71202002");
	List<cstActivity> list = ic.listActivity(ac, pageBean);
		for (cstActivity cs : list) {
			System.out.println(cs);
		}
		
	}

	@Test
	public void testDoGetActivity() {
		ac.setAtvId("402809816d725a72016d725a75b30000");
		cstActivity a = ic.doGetActivity(ac);
		System.out.println(a);
	}

}
