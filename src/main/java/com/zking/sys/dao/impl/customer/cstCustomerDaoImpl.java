package com.zking.sys.dao.impl.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.IcstCustomerDao;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.util.DBHelper;
import com.zking.util.PageBean;
import com.zking.util.testSubString;

public class cstCustomerDaoImpl extends BaseDAO implements IcstCustomerDao {
	
	private Connection con=null;
	private PreparedStatement ps=null;
	
	
	public cstCustomerDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<cstCustomer> listCstCustmoer(cstCustomer cs,PageBean pageBean) {
		// TODO Auto-generated method stub
				String hql="from cstCustomer a where 1=1";
				Map<String, Object> args = new HashMap<String, Object>();
					if(cs.getCustName().length()!=0) {
						hql+=" and a.custName like :name";
						args.put("name", "%"+cs.getCustName()+"%");
					}
					
			return (List<cstCustomer>) this.executeQuery(hql, args, pageBean);
	}

	@Override
	public cstCustomer doGetCustomer(cstCustomer cs) {
		cstCustomer customer = this.getHibernateTemplate().get(cstCustomer.class, cs.getCustNo());
		return customer;
	}

	@Override
	public void delCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
		cstCustomer customer = this.getHibernateTemplate().get(cstCustomer.class, cs.getCustNo());
		if(null!=customer) {
			this.getHibernateTemplate().delete(customer);
		}
		
	}

	@Override
	public void editCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
			this.getHibernateTemplate().update(cs);
	}

	@Override
	public void addCustomer(cstCustomer cs) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(cs);
	}

	@Override
	public void addCustomer2(cstCustomer customer) {
			// TODO Auto-generated method stub
			String add=null;
			String[] str1 = testSubString.getMobileArea(customer.getCustTel());
			for (int i = 0; i < str1.length; i++) {
				add=str1[0]+"省,"+str1[1]+"市";
			}
			String id = UUID.randomUUID().toString().replace("-", "");
			String sql="insert into cst_customer(cust_no,cust_name,cust_region,cust_manager_name,cust_satisfy,cust_credit,cust_tel,cust_status,cust_bankroll,cust_turnover,cust_level_label)"
					+ "values('"+id+"','"+customer.getCustName()+"','"+add+"','"+customer.getCustManagetName()+"',"+customer.getCustSatisfy()+""
							+ ","+customer.getCustCredit()+",'"+customer.getCustTel()+"',1,0,0,1)";
			System.out.println(sql);
			try {
				con=DBHelper.getcon();
				ps=con.prepareStatement(sql);
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
	}

}
