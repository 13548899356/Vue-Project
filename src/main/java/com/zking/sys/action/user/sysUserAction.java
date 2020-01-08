package com.zking.sys.action.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.user.sysUser;
import com.zking.sys.service.impl.user.sysUserServiceImpl;
import com.zking.sys.service.user.IsysUserService;
import com.zking.util.jwt.JwtUtils;

public class sysUserAction extends BaseAction implements ModelDriven<sysUser> {

	private sysUser user = new sysUser();
	private IsysUserService sysUserService;

	@Override
	public sysUser getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public sysUserAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public IsysUserService getSysUserService() {
		return sysUserService;
	}

	public void setSysUserService(IsysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	public String doLogin() {
		sysUser loginUser = sysUserService.doLogin(user);
		if (loginUser != null) {
			//私有要求claim
			Map<String,Object> json=new HashMap<String, Object>();
			json.put("uname", loginUser.getUserName());
			json.put("upwd", loginUser.getPassword());
			//生成jwt,并设置response响应头
			String jwt=JwtUtils.createJwt(json, JwtUtils.JWT_WEB_TTL);
			response.setHeader(JwtUtils	.JWT_HEADER_KEY, jwt);
			super.toJSONObject(true, loginUser);
		} else {
			super.toJsonMessage("登录失败", false);
		}

		return null;

	}
	
	public String listSysUser() {
		try {
			List<sysUser> list = sysUserService.listUser(user);
			super.toJSONObject(true, list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		
		return null;
	}

	public String doRegister() {
		return null;
	}

}
