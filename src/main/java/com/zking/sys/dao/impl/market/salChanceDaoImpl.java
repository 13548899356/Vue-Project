package com.zking.sys.dao.impl.market;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.market.IsalChanceDao;
import com.zking.sys.entity.market.salChance;
import com.zking.util.PageBean;

public class salChanceDaoImpl extends BaseDAO implements IsalChanceDao{

	@Override
	public void addSalChance(salChance salChance) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(salChance);
	}

	@Override
	public void editSalChance(salChance salChance) {
		// TODO Auto-generated method stub
			this.getHibernateTemplate().update(salChance);
	}

	@Override
	public void delSalChance(salChance salChance) {
		// TODO Auto-generated method stub
		salChance sal = this.getHibernateTemplate().get(salChance.class,salChance.getChcId());
		if(null!=sal) {
			this.getHibernateTemplate().delete(sal);
		}
	}

	@Override
	public List<salChance> querySalchancePager(final salChance chance, final PageBean pageBean){
		return this.getHibernateTemplate().execute(new HibernateCallback<List<salChance>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<salChance> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from salChance a where 1=1 ";
				if(null!=chance.getChcCustName() && ""!=chance.getChcCustName()) {
					hql+=" and chcCustName like '%"+chance.getChcCustName()+"%'";
				}
				if(null!=chance.getChcLinkman() && ""!=chance.getChcLinkman()) {
					hql+=" and chcLinkman like '%"+chance.getChcLinkman()+"%'";
				}
				hql+=" order by chcId desc";
				System.out.println(hql);
				return (List<salChance>) executeQuery(hql, null, pageBean);
			}
		});
	}
	
	//已分配
	@Override
	public List<salChance> Putaway(final salChance chance, final PageBean pageBean){
		return this.getHibernateTemplate().execute(new HibernateCallback<List<salChance>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<salChance> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from salChance a where chcStatus=1";
				if(null!=chance.getChcCustName() && ""!=chance.getChcCustName()) {
					hql+=" and chcCustName like '%"+chance.getChcCustName()+"%'";
				}
				
				hql+=" order by chcId desc";
				System.out.println(hql);
				return (List<salChance>) executeQuery(hql, null, pageBean);
			}
		});
	}

	//未分配
	@Override
	public List<salChance> Noputaway(final salChance chance, final PageBean pageBean){
		return this.getHibernateTemplate().execute(new HibernateCallback<List<salChance>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<salChance> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from salChance a where chcStatus=0";
				if(null!=chance.getChcCustName() && ""!=chance.getChcCustName()) {
					hql+=" and chcCustName like '%"+chance.getChcCustName()+"%'";
				}
				if(null!=chance.getChcLinkman() && ""!=chance.getChcLinkman()) {
					hql+=" and chcLinkman like '%"+chance.getChcLinkman()+"%'";
				}
				hql+=" order by chcId desc";
				System.out.println(hql);
				return (List<salChance>) executeQuery(hql, null, pageBean);
			}
		});
	}
	
	

}
