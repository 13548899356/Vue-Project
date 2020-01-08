package com.zking.sys.service;


import java.util.List; 

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.Module;


public class moduleServiceTest extends BaseTestCase{

	private moduleService ms;
	private Module module;
	
	@Before
	public  void Before()  {
		module=new Module();
		ms=(moduleService)getBean("moduleService");
	}

	@Test
	public void testDoLogin() {
		List<Module> list= ms.listRootModule();
		for (Module m : list) {
			System.out.println(m);
		}
		System.out.println("---------------");
		List<Module> list2 = module.getChildren();
		for (Module module : list2) {
			System.out.println(module);
		}
		
	}

	@Test
	public void testDoRegister() {
		String str="402809816dc2f780016dc2f783480000";
		List<Module> list = ms.listGetRoleRootModule(str);
		for (Module module : list) {
			System.out.println(module);
		}
	}

}
