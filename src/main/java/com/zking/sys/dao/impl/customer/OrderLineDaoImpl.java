package com.zking.sys.dao.impl.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.IOrderLineDao;
import com.zking.sys.entity.customer.OrderLine;

public class OrderLineDaoImpl extends BaseDAO implements IOrderLineDao {

	
	public OrderLineDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<OrderLine> doGetOrderLine(OrderLine order) {
		// TODO Auto-generated method stub
		String hql="from OrderLine a where a.oddOrderId=:id";
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("id", order.getOddOrderId());
		@SuppressWarnings("unchecked")
		List<OrderLine> o =  (List<OrderLine>) super.executeQuery(hql, map, null);
		return o;
	}

}
