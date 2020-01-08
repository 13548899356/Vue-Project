package com.zking.sys.service.impl.customer;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.customer.addCstLost;
import com.zking.sys.dao.impl.customer.addCstLostImpl;
import com.zking.sys.entity.customer.Orders;
import com.zking.sys.service.customer.addCstLostService;

public class addCstLostServiceImpl extends BaseService implements addCstLostService {

	private addCstLost lost=new addCstLostImpl();
	
	@Override
	public List<Orders> addCstLoadOfComputer() {
		// TODO Auto-generated method stub
		return lost.addCstLoadOfComputer();
	}

	
	
	
	
	
	
}
