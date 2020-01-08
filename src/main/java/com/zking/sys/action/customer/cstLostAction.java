package com.zking.sys.action.customer;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.cstLost;
import com.zking.sys.service.customer.IcstLostService;
import com.zking.util.PageBean;

public class cstLostAction extends BaseAction implements ModelDriven<cstLost> {

	private IcstLostService cstLostService;
	private cstLost lost=new cstLost();
	private PageBean pageBean=new PageBean();
	
	
	
	public cstLostAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IcstLostService getCstLostService() {
		return cstLostService;
	}

	public void setCstLostService(IcstLostService cstLostService) {
		this.cstLostService = cstLostService;
	}

	@Override
	public cstLost getModel() {
		// TODO Auto-generated method stub
		return lost;
	}
	
	public String doStopCstLost() {
		try {
			cstLostService.doStopCstLost(lost);
			super.toJsonMessage("暂缓成功", true);
		} catch (Exception e) {
			super.toJsonMessage("暂缓失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String doSureCstLost() {
		try {
			cstLostService.doSureCstLost(lost);
			super.toJsonMessage("确认信息流失", true);
		} catch (Exception e) {
			super.toJsonMessage("失败", false);
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public String listCstLost() {
		try {
			pageBean.setRequest(request);
			List<cstLost> listCstLost = cstLostService.listCstLost(lost, pageBean);
			super.toJSONPager("ok", true, pageBean.getTotal(), listCstLost);
		} catch (Exception e) {
			super.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String doGetLost() {
		try {
			cstLost doGetLost = cstLostService.doGetLost(lost.getLstId());
			super.toJSONObject(true, doGetLost);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	
	

}
