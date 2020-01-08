package com.zking.sys.action.customer;

import java.util.List; 

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.service.customer.IcstCustomerService;
import com.zking.util.PageBean;

public class cstCustomerAction extends BaseAction implements ModelDriven<cstCustomer> {

	private cstCustomer customer=new cstCustomer();
	private IcstCustomerService customerService;
	private PageBean pageBean=new PageBean();
	
	public IcstCustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(IcstCustomerService customerService) {
		this.customerService = customerService;
	}


	public cstCustomerAction() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public cstCustomer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	
	public String listCustomer() {
		try {
			pageBean.setRequest(request);
			List<cstCustomer> list = customerService.listCstCustmoer(customer, pageBean);
			super.toJSONPager("ok", true, pageBean.getTotal(), list);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("null", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String doGetCustomer() {
		try {
			cstCustomer cust = customerService.doGetCustomer(customer);
			super.toJSONObject(true, cust);
		} catch (Exception e) {
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String addCustomer() {
		try {
			System.out.println(customer);
			customerService.addCustomer(customer);
			super.toJsonMessage("添加成功", true);
		} catch (Exception e) {
			super.toJsonMessage("添加失败", false);
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public String delCustomer() {
		try {
			customerService.delCustomer(customer);
			super.toJsonMessage("删除成功", true);
		} catch (Exception e) {
			super.toJsonMessage("添加失败", false);
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String editCustomer() {
		try {
			System.out.println(customer);
			customerService.editCustomer(customer);
			super.toJsonMessage("修改成功", true);
		} catch (Exception e) {
			super.toJsonMessage("修改失败", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String addCustomer2() {
		try {
			System.out.println("成功");
			customerService.addCustomer2(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	

}
