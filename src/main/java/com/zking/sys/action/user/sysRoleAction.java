package com.zking.sys.action.user;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.user.sysRole;
import com.zking.sys.service.impl.user.sysRoleServiceImpl;
import com.zking.sys.service.user.IsysRoleService;

public class sysRoleAction extends BaseAction implements ModelDriven<sysRole> {

	private IsysRoleService roleService = new sysRoleServiceImpl();
	private sysRole role = new sysRole();

	public sysRoleAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IsysRoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(IsysRoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public sysRole getModel() {
		return role;
	}

	public String listRole() {
		try {
			System.out.println(role);
			List<sysRole> list = roleService.listRole(role);
			super.toJSONPager("ok", true, list.size(), list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}

		return null;
	}

}
