package com.zking.sys.dao.impl.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.IorderdDao;
import com.zking.sys.entity.customer.Orders;
import com.zking.util.PageBean;

public class orderDaoImpl extends BaseDAO implements IorderdDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> listOrders(Orders order, PageBean pageBean) {
		// TODO Auto-generated method stub
		String hql = "from Orders a where a.odrCustomerNo=:custName";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("custName", order.getOdrCustomerNo());
		return (List<Orders>) super.executeQuery(hql, map, pageBean);
	}

	@Override
	public Orders doGetOrder(Orders order) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orders.class, order.getOdrId());
	}

	@Override
	public List<Orders> listOrdersDate(Orders order) {
		// TODO Auto-generated method stub
		String hql = "from Orders b where b.odrDate in  (select max(a.odrDate) from Orders a group by a.odrCustomerNo)";
		
		return (List<Orders>) this.executeQuery(hql, null, null);
	}

}
