package com.zking.sys.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.customer.cstLinkman;
import com.zking.sys.service.customer.IcstLinkmanService;
import com.zking.util.PageBean;

public class IcstLinkmanServiceTest extends BaseTestCase {

	private cstLinkman cl;
	private PageBean pageBean=new PageBean();
	private IcstLinkmanService is;
	
	@Before
	public void before() {
		cl=new cstLinkman();
		is=(IcstLinkmanService)getBean("linkmanService");
	}
	
	
	@Test
	public void testAddLinkman() {
		cl.setLkmCustNo("KHD71202002");
		cl.setLkmCustName("马云3");
		cl.setLkmName("猜猜看");
		cl.setLkmPostion("总裁");
		cl.setLkmSex("女");
		cl.setLkmTel("010-63838438");
		cl.setLkmMobile("13548899356");
		cl.setLikMemo("不可编辑");
		
		is.addLinkman(cl);
	}

	@Test
	public void testDelLinkman() {
		cl.setLkmId("402809816d70f421016d70f4248e0000");
		is.delLinkman(cl);
		
	}

	@Test
	public void testEditLinkman() {
		cl.setLkmId("402809816d70fb90016d70fb94210000");
		cl.setLkmCustNo("KHD71202002");
		cl.setLkmCustName("马云3");
		cl.setLkmName("猜猜看");
		cl.setLkmPostion("总经理");
		cl.setLkmSex("男");
		cl.setLkmTel("010-63838438");
		cl.setLkmMobile("13548899356");
		cl.setLikMemo("不可编辑");
		
		is.editLinkman(cl);
	}

	@Test
	public void testListLinkman() {
		cl.setLkmCustNo("KHD71202002");
		List<cstLinkman> list = is.listLinkman(cl, pageBean);
		for (cstLinkman link : list) {
			System.out.println(link);
		}
		
	}

	@Test
	public void testDoGetLinkman() {
		cl.setLkmId("402809816d70fc11016d70fc14690000");
		cstLinkman l = is.doGetLinkman(cl);
		System.out.println(l);
	}

}
