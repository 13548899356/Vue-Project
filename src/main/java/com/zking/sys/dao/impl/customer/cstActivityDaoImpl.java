package com.zking.sys.dao.impl.customer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.IcstActivityDao;
import com.zking.sys.entity.customer.cstActivity;
import com.zking.util.PageBean;

public class cstActivityDaoImpl extends BaseDAO implements IcstActivityDao {

	
	
	public cstActivityDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(activity);
	}

	@Override
	public void delActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(activity);		
	}

	@Override
	public void editActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(activity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<cstActivity> listActivity(cstActivity activity,PageBean pageBean) {
		// TODO Auto-generated method stub
		String hql="from cstActivity a where a.atvCustNo=:custNo";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("custNo", activity.getAtvCustNo());
		return (List<cstActivity>) super.executeQuery(hql, map, pageBean);
	}

	@Override
	public cstActivity doGetActivity(cstActivity activity) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(cstActivity.class, activity.getAtvId());
	}

}
