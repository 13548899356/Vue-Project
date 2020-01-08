package com.zking.sys.dao.impl.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.IcstLinkmanDao;
import com.zking.sys.entity.customer.cstLinkman;
import com.zking.util.PageBean;

public class cstLinkmanDaoImpl extends BaseDAO implements IcstLinkmanDao {

	
	public cstLinkmanDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addLinkman(cstLinkman linkman) {
		this.getHibernateTemplate().save(linkman);

	}

	@Override
	public void delLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
		cstLinkman lkm = this.getHibernateTemplate().get(cstLinkman.class,linkman.getLkmId());
		if(null!=lkm) {
			this.getHibernateTemplate().delete(lkm);
		}
		
	}

	@Override
	public void editLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
				
		
			this.getHibernateTemplate().update(linkman);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<cstLinkman> listLinkman(cstLinkman linkman,PageBean pageBean) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<String, Object>();
		String hql="from cstLinkman a where a.lkmCustNo = :custNo ";
		map.put("custNo",linkman.getLkmCustNo());
		
		return (List<cstLinkman>) super.executeQuery(hql, map, pageBean);
	}

	@Override
	public cstLinkman doGetLinkman(cstLinkman linkman) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(cstLinkman.class, linkman.getLkmId());
	}

}
