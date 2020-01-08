package com.zking.sys.action.customer;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.cstActivity;
import com.zking.sys.service.customer.IcstActivityService;
import com.zking.util.PageBean;

public class cstActivityAction extends BaseAction implements ModelDriven<cstActivity> {

	 private cstActivity activity=new cstActivity();
	 private IcstActivityService activityService;
	 private PageBean pageBean=new PageBean();
	
	@Override
	public cstActivity getModel() {
		// TODO Auto-generated method stub
		return activity;
	}
	
	public IcstActivityService getActivityService() {
		return activityService;
	}

	public void setActivityService(IcstActivityService activityService) {
		this.activityService = activityService;
	}

	public String listActivity() {
		try {
			pageBean.setRequest(request);
			List<cstActivity> list = activityService.listActivity(activity, pageBean);
			super.toJSONPager("ok", true, pageBean.getTotal(), list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public String doGetActivity() {
		try {
			cstActivity ac = activityService.doGetActivity(activity);
			super.toJSONObject(true, ac);
			
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String addActivity() {
		try {
			activityService.addActivity(activity);
			super.toJsonMessage("添加成功", true);
		} catch (Exception e) {
			super.toJsonMessage("添加失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String delActivity() {
		try {
			activityService.delActivity(activity);
			super.toJsonMessage("删除成功", true);
		} catch (Exception e) {
			super.toJsonMessage("删除失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String editActivity() {
		try {
			activityService.editActivity(activity);
			super.toJsonMessage("修改成功", true);
		} catch (Exception e) {
			super.toJsonMessage("修改失败", false);
			
		}
		return null;
	}
	
	
	
	
	
	
}
