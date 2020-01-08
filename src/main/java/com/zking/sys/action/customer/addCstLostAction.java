package com.zking.sys.action.customer;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.cstLost;
import com.zking.sys.service.customer.addCstLostService;
import com.zking.sys.service.impl.customer.addCstLostServiceImpl;

public class addCstLostAction extends BaseAction implements ModelDriven<cstLost> {

	private cstLost lost=new  cstLost();
	private addCstLostService al=new addCstLostServiceImpl();
	
	@Override
	public cstLost getModel() {
		// TODO Auto-generated method stub
		return lost;
	}

	
	public String addLost() {
		try {
			al.addCstLoadOfComputer();
			super.toJsonMessage("客户流失数据已更新", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
}
