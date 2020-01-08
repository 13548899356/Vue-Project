package com.zking.sys.action.service;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.service.cstService;
import com.zking.sys.service.service.IcstServiceService;
import com.zking.util.PageBean;

public class cstServiceAction extends BaseAction implements ModelDriven<cstService>{
	
	private cstService cstservice=new cstService();
	private IcstServiceService cstServiceService;
	private PageBean pageBean=new PageBean();
	public cstServiceAction() {
		super();
	}
	@Override
	public cstService getModel() {
		return cstservice;
	}
	public IcstServiceService getCstServiceService() {
		return cstServiceService;
	}
	public void setCstServiceService(IcstServiceService cstServiceService) {
		this.cstServiceService = cstServiceService;
	}
	
	
	public String addService() {
		try {
//			System.out.println(cstservice);
			cstServiceService.addService(cstservice);
			super.toJsonMessage("服务创建成功", true);
		} catch (Exception e) {
			super.toJsonMessage("服务创建失败", false);
			e.printStackTrace();
		}
		return null;
	}
	public String delService() {
		try {
			cstServiceService.delService(cstservice);
			super.toJsonMessage("删除成功", true);
		} catch (Exception e) {
			super.toJsonMessage("删除失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String editService() {
		try {
			cstServiceService.editService(cstservice);
			super.toJsonMessage("修改成功", true);
		} catch (Exception e) {
			super.toJsonMessage("修改失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String listService() {
		try {
			System.out.println(cstservice);
			pageBean.setRequest(request);

			List<cstService> list = cstServiceService.listService(cstservice, pageBean);
			super.toJSONPager("success", true, pageBean.getTotal(), list);
		} catch (Exception e) {
			super.toJsonMessage("defeat", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public String loadService() {
		try {
			cstService loadService = cstServiceService.loadService(cstservice);
			super.toJSONObject(true, loadService);
		} catch (Exception e) {
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String listServers() {
		try {
			List<cstService> list = cstServiceService.listServers(cstservice);
			super.toJSONObject(true, list);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		
		return null;	
	}
	
	
}
