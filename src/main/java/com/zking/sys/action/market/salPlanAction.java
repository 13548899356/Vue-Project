package com.zking.sys.action.market;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.market.salPlan;
import com.zking.sys.service.market.IsalPlanService;
import com.zking.util.PageBean;

public class salPlanAction extends BaseAction implements ModelDriven<salPlan>{
	
	private salPlan salPlan=new salPlan();
	private IsalPlanService salPlanService;
	
	public IsalPlanService getSalPlanService() {
		return salPlanService;
	}

	public void setSalPlanService(IsalPlanService salPlanService) {
		this.salPlanService = salPlanService;
	}

	@Override
	public salPlan getModel() {
		// TODO Auto-generated method stub
		return salPlan;
	}
	
	public String addSalPlan() {
		try {
			salPlanService.addSalPlan(salPlan);
			this.toJsonMessage("新增成功！！", true);
		} catch (Exception e) {
			this.toJsonMessage("新增失败！！", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String editSalPlan() {
		try {
			salPlanService.editSalPlan(salPlan);
			this.toJsonMessage("操作成功！！", true);
		} catch (Exception e) {
			this.toJsonMessage("操作失败！！", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String delSalPlan() {
		try {
			salPlanService.delSalPlan(salPlan);
			this.toJsonMessage("操作成功！！", true);
		} catch (Exception e) {
			this.toJsonMessage("操作失败！！", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String querySalPlanPager() {
        try {
			 PageBean pagebean=new PageBean(); pagebean.setRequest(request);
			  List<salPlan> b =salPlanService.querySalPlanPager(salPlan, pagebean);
			  this.toJSONPager("ok", true, pagebean.getTotal(), b);
		} catch (Exception e) {
			this.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	

}
