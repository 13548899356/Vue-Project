package com.zking.sys.service.user;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.entity.user.sysRole;
import com.zking.sys.entity.user.sysUser;
import com.zking.sys.service.BaseTestCase;
import com.zking.sys.service.impl.user.sysRoleServiceImpl;
import com.zking.sys.service.impl.user.sysUser2ServiceImpl;
import com.zking.util.PageBean;

public class IsysRoleServiceTest extends BaseTestCase {

	private sysRole role;
	private IsysRoleService irs;
	private PageBean pageBean=new PageBean();
	
	private sysUser user;
	private IsysUser2Service is;
	@Before
	public void setUp() throws Exception {
		role=new sysRole();
//		irs=(IsysRoleService) getBean("roleService");
		irs=new sysRoleServiceImpl();
		user=new sysUser();
		is=new sysUser2ServiceImpl();
		
	}

	@Test
	public void testListRole() {
//		List<sysRole> list = irs.listRole(role);
//		System.out.println(list.size());
//		for (sysRole li : list) {
//			System.out.println(li);
//		}
		
		user.setUserId("43141233421");
		List<sysUser> listSysUser = is.listSysUser(user);
		for (sysUser ss : listSysUser) {
			System.out.println(ss);
		}
	}
	@Test
	public void testListRole2() {
		user.setUserName("sasasa");
		user.setPassword("1234");
		user.setPosition(2);
		role.setRoleName("李狗子");
		role.setDescription("啊哈哈哈哈");
		user.setRole(role);
		
		is.addUser(user);
	}
	
	
	@Test
	public void testListRole3() {
		String []a= {"1","3","7","5","6"};
		for (String str : a) {
			System.out.println(str);
		}
		
		
	}
}
