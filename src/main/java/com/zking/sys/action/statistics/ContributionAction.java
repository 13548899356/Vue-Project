package com.zking.sys.action.statistics;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.service.impl.statistics.ContributionServiceImpl;
import com.zking.sys.service.statistics.IContributionService;

public class ContributionAction extends BaseAction implements ModelDriven<cstCustomer> {

	private cstCustomer customer=new cstCustomer();
	private IContributionService ic=new ContributionServiceImpl();
	
	@Override
	public cstCustomer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	public String listContribution() {
		try {
			List<cstCustomer> list = ic.listContribute(customer);
			super.toJSONObject(true, list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	

}
