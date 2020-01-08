package com.zking.sys.service.customer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.entity.customer.cstLost;
import com.zking.sys.service.BaseTestCase;
import com.zking.util.PageBean;

public class IcstLostServiceTest extends BaseTestCase {

	private IcstLostService cs;
	private cstLost c;
	private PageBean pageBean=new PageBean();
	
	@Before
	public void before(){
		cs=(IcstLostService) getBean("cstLostService");
		c=new cstLost();
		
	}

	@Test
	public void testDoStopCstLost() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoSureCstLost() {
		fail("Not yet implemented");
	}

	@Test
	public void testListCstLost() {
		c.setLstCustName("夏");
		List<cstLost> lost = cs.listCstLost(c, pageBean);
		for (cstLost cst : lost) {
			System.out.println(cst);
		}
		
	}

}
