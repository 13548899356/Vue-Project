package com.zking.sys.dao.impl.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.IcstLostDao;
import com.zking.sys.entity.customer.cstLost;
import com.zking.util.PageBean;

public class cstLostDaoImpl extends BaseDAO implements IcstLostDao {

	@Override
	public void doStopCstLost(cstLost lost) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(lost);
	}

	@Override
	public void doSureCstLost(cstLost lost) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(lost);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<cstLost> listCstLost(cstLost lost,PageBean pageBean) {
		// TODO Auto-generated method stub
		String hql="from cstLost a where 1=1";
		Map<String, Object> map=new HashMap<String, Object>();
		if(lost.getLstCustName().length()!=0) {
			hql+=" and a.lstCustName like :name";
			map.put("name", "%"+lost.getLstCustName()+"%");
		}
		if(lost.getLstCustManagerName().length()!=0) {
			hql+=" and a.lstCustManagerName like :managerName";
			map.put("managerName", "%"+lost.getLstCustManagerName()+"%");
		}
		if(lost.getLstStatus().length()!=0) {
			hql+=" and a.lstStatus =:status";
			map.put("status", lost.getLstStatus());
		}
		
		return (List<cstLost>) this.executeQuery(hql, map, pageBean);
	}

	@Override
	public void addCstLost(cstLost lost) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(lost);
	}

	@Override
	public cstLost doGetLost(String id) {
		// TODO Auto-generated method stub
		String hql="from cstLost a where a.lstCustNo='"+id+"'";
		return  (cstLost)this.executeQuery(hql, null, null).get(0);
	}

}
