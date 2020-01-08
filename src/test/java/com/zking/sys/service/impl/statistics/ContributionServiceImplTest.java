package com.zking.sys.service.impl.statistics;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.service.statistics.IContributionService;

public class ContributionServiceImplTest {


	private IContributionService ic=null;
	private cstCustomer cs=null;
	
	@Before
	public void setUp() throws Exception {
		ic=new ContributionServiceImpl();
		cs=new cstCustomer();
		
	}

	@Test
	public void testListContribute() {
		System.out.println("sss");
		List<cstCustomer> list = ic.listContribute(cs);
		for (cstCustomer cc : list) {
			System.out.println(cc);
		}
		
	}

}
