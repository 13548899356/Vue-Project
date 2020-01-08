package com.zking.sys.service;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.user.sysUser;
import com.zking.sys.service.user.IsysUserService;

public class IsysUserServiceTest extends BaseTestCase{

	private IsysUserService is;
	private sysUser su;
	
	
	@Before
	public  void Before()  {
		su=new sysUser();
		is=(IsysUserService)getBean("sysUserService");
		
	}

	@Test
	public void testDoLogin() {
		su.setUserName("sa");
		su.setPassword("321");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date=new Date();
		String str = sdf.format(date);
		System.out.println(str);
		
		sysUser doLogin = is.doLogin(su);
		
		System.out.println(doLogin);
	}

	@Test
	public void testDoRegister() {
		su.setUserName("lin");
		su.setPassword("123");
		su.setSalt("bb");
		su.setPosition(2);
		is.doRegister(su);
		
		
	}

}
