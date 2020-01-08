package com.zking.sys.dao.impl.market;

import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.market.IsalPlanDao;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.entity.market.salChance;
import com.zking.sys.entity.market.salPlan;
import com.zking.util.PageBean;
import com.zking.util.testSubString;

public class salPlanDaoImpl extends BaseDAO implements IsalPlanDao{

	@Override
	public void addSalPlan(salPlan salPlan) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(salPlan);
	}

	@Override
	public void editSalPlan(salPlan salPlan) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(salPlan);
	}

	@Override
	public void delSalPlan(salPlan salPlan) {
		// TODO Auto-generated method stub
		salPlan sal = this.getHibernateTemplate().get(salPlan.class,salPlan.getPlaId());
		if(null!=sal) {
			this.getHibernateTemplate().delete(sal);
		}
	}

	@Override
	public List<salPlan> querySalPlanPager(final salPlan salPlan, final PageBean pageBean){
		return this.getHibernateTemplate().execute(new HibernateCallback<List<salPlan>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<salPlan> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from salPlan a where plachcId ='"+salPlan.getPlachcId()+"'";
				hql+=" order by plaId desc";
				System.out.println(hql);
				return (List<salPlan>) executeQuery(hql, null, pageBean);
			}
		});
	}

	

}
