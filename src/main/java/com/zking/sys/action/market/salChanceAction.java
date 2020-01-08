package com.zking.sys.action.market;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.market.salChance;
import com.zking.sys.service.market.IsalChanceService;
import com.zking.util.PageBean;
public class salChanceAction extends BaseAction implements ModelDriven<salChance>{

	private salChance salChance=new salChance();
	private IsalChanceService salChanceService;

	

	public IsalChanceService getSalChanceService() {
		return salChanceService;
	}

	public void setSalChanceService(IsalChanceService salChanceService) {
		this.salChanceService = salChanceService;
	}

	@Override
	public salChance getModel() {
		return salChance;
	}
	
	public String addSalChance() {
		try {
			salChanceService.addSalChance(salChance);
			this.toJsonMessage("新增成功！！", true);
		} catch (Exception e) {
			this.toJsonMessage("新增失败！！", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String editSalChance() {
		try {
			salChanceService.editSalChance(salChance);
			this.toJsonMessage("操作成功！！", true);
		} catch (Exception e) {
			this.toJsonMessage("操作失败！！", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String delSalChance() {
		try {
			salChanceService.delSalChance(salChance);
			this.toJsonMessage("操作成功！！", true);
		} catch (Exception e) {
			this.toJsonMessage("操作失败！！", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String querySalchancePager() {
        try {
			 PageBean pagebean=new PageBean(); pagebean.setRequest(request);
			  List<salChance> b =salChanceService.querySalchancePager(salChance, pagebean);
			  this.toJSONPager("ok", true, pagebean.getTotal(), b);
		} catch (Exception e) {
			this.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	//已分配
	public String Putaway() {
        try {
			 PageBean pagebean=new PageBean(); pagebean.setRequest(request);
			  List<salChance> b =salChanceService.Putaway(salChance, pagebean);
			  this.toJSONPager("ok", true, pagebean.getTotal(), b);
		} catch (Exception e) {
			this.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	//未分配
	public String Noputaway() {
        try {
			 PageBean pagebean=new PageBean(); pagebean.setRequest(request);
			  List<salChance> b =salChanceService.Noputaway(salChance, pagebean);
			  this.toJSONPager("ok", true, pagebean.getTotal(), b);
		} catch (Exception e) {
			this.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	

}
