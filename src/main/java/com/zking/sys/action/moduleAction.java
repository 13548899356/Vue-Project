package com.zking.sys.action;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.Module;
import com.zking.sys.service.moduleService;

public class moduleAction extends BaseAction implements ModelDriven<Module> {

	private moduleService moduleService;
	private Module module=new Module();
	
	
	public moduleService getModuleService() {
		return moduleService;
	}


	public void setModuleService(moduleService moduleService) {
		this.moduleService = moduleService;
	}


	@Override
	public Module getModel() {
		// TODO Auto-generated method stub
		return module;
	}

	public String listRootModule() {
		List<Module> list = moduleService.listRootModule();
		try {
			super.toJSONObject(true, list);
		} catch (Exception e) {
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		
		return null;
	}

	public String listGetRoleRootModule() {
		try {
			List<Module> list = moduleService.listGetRoleRootModule(module.getIcon());
			super.toJSONObject(true, list);
		} catch (Exception e) {
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		return null;
	}
	
	
}
