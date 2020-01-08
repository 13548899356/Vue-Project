package com.zking.sys.action.customer;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.cstLinkman;
import com.zking.sys.service.customer.IcstLinkmanService;
import com.zking.util.PageBean;

public class cstLinkmanAction extends BaseAction implements ModelDriven<cstLinkman> {

	private cstLinkman linkman=new cstLinkman();
	private PageBean pageBean=new PageBean();
	private IcstLinkmanService linkmanService;
	
	
	
	public IcstLinkmanService getLinkmanService() {
		return linkmanService;
	}



	public void setLinkmanService(IcstLinkmanService linkmanService) {
		this.linkmanService = linkmanService;
	}



	public cstLinkmanAction() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public cstLinkman getModel() {
		// TODO Auto-generated method stub
		return linkman;
	}

	
	public String listLinkman() {
		try {
			pageBean.setRequest(request);
			List<cstLinkman> list = linkmanService.listLinkman(linkman, pageBean);
			super.toJSONPager("ojbk", true, pageBean.getTotal(), list);
		} catch (Exception e) {
			super.toJsonMessage("查询失败", false);
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public String doGetLinkman() {
		try {
			cstLinkman link = linkmanService.doGetLinkman(linkman);
			super.toJSONObject(true, link);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String addLinkman() {
		try {
			System.out.println(linkman);
			linkmanService.addLinkman(linkman);
			super.toJsonMessage("新建联系人成功", true);
		} catch (Exception e) {
			super.toJsonMessage("新建联系人失败", false);
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public String delLinkman() {
		try {
			linkmanService.delLinkman(linkman);
			super.toJsonMessage("删除成功", true);
		} catch (Exception e) {
			super.toJsonMessage("删除失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String editLinkman() {
		try {
			linkmanService.editLinkman(linkman);
			super.toJsonMessage("修改成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("修改失败", false);
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
}
