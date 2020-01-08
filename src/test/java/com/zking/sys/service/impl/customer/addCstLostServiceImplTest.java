package com.zking.sys.service.impl.customer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.service.customer.addCstLostService;

public class addCstLostServiceImplTest {

	private addCstLostService as;
	

	@Before
	public void setUp() throws Exception {
		as=new addCstLostServiceImpl();
		
	}

	@Test
	public void testAddCstLoadOfComputer() {
		as.addCstLoadOfComputer();
		System.out.println("ok");
		
	}

}
