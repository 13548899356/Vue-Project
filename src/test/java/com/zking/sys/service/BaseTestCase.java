package com.zking.sys.service;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zking.util.PageBean;


public class BaseTestCase {

	private static ApplicationContext applicationContext;

	static {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
	}

	protected PageBean pageBean;

	public BaseTestCase() {
		super();
	}

	public Object getBean(String name) {
		return applicationContext.getBean(name);
	}

	@Before
	public void before() {
		pageBean = new PageBean();
	}
}
