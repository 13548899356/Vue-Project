package com.zking.sys.action.user;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.user.sysUser;
import com.zking.sys.service.impl.user.sysUser2ServiceImpl;
import com.zking.sys.service.user.IsysUser2Service;

public class sysUser2Action extends BaseAction implements ModelDriven<sysUser> {

	private sysUser user=new sysUser();
	private IsysUser2Service is=new sysUser2ServiceImpl();
	
	@Override
	public sysUser getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	public String listUser() {
		try {
			System.out.println(user);
			List<sysUser> list = is.listSysUser(user);
			super.toJSONObject(true, list);
			
		} catch (Exception e) {
			super.toJsonMessage(null, false);
		e.printStackTrace();
		}
		
		return null;
	}
	
	public String addUser() {
		System.out.println(user);
		try {
			is.addUser(user);
			super.toJsonMessage("信息添加成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("信息添加失败", false);
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	public String editUser() {
		try {
			is.editUser(user);
			super.toJsonMessage("信息修改成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("信息修改失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String delUser() {
		try {
			is.delUser(user);
			super.toJsonMessage("信息删除成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("信息删除失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String lock() {
		try {
			is.lock(user);
			if(user.getLocked()==1) {
				super.toJsonMessage("用户锁定成功", true);
			}else {
				super.toJsonMessage("解锁成功", true);
			}
		} catch (Exception e) {
			super.toJsonMessage("操作失败", false);
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public String addMoudel() {
		try {
			is.addRoleModule(user);
			super.toJsonMessage("角色权限添加成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("角色权限添加失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String getMoudel() {
		try {
			List<String> list = is.getRoleModule(user);
			super.toJSONObject(true, list);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("no", false);
			e.printStackTrace();
		}
		return null;
	}
}
