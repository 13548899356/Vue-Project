package com.zking.sys.dao.impl.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.user.IsysUserDao;
import com.zking.sys.entity.user.sysUser;
import com.zking.util.DBHelper;

public class sysUserDaoImpl extends BaseDAO implements IsysUserDao {

	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private static final long serialVersionUID = 8051589658957820872L;

	
	public sysUserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public sysUser doLogin(final sysUser user) {
		System.out.println(user);
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().execute(new HibernateCallback<sysUser>() {

			@Override
			public sysUser doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql="from sysUser where userName=:uname and password=:pwd ";
				Query<sysUser> query = session.createQuery(hql,sysUser.class);
				query.setParameter("uname", user.getUserName());
				query.setParameter("pwd", user.getPassword());
				List<sysUser> list = query.list();
				for (sysUser s : list) {
					System.out.println(s);
				}
				return list.get(0);
			}
		});
		
	}

	@Override
	public void doRegister(sysUser user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<sysUser> listUser(sysUser user) {
		// TODO Auto-generated method stub
		List<sysUser> list=new ArrayList<sysUser>();
		String hql="SELECT a.cust_level_label,COUNT(*) FROM cst_customer a GROUP BY cust_level_label";
		if(0!=user.getPosition()) {
			hql+=" HAVING cust_level_label="+user.getPosition()+"";
		}
		try {
			 con=DBHelper.getcon();
			 ps=con.prepareStatement(hql);
			 rs=ps.executeQuery();
			sysUser u=null;
			while(rs.next()) {
				u=new sysUser();
				u.setPosition(rs.getInt(1));
				u.setLocked(rs.getInt(2));
				list.add(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.myclose(con, ps, rs);
		}
		
		
		return list;
	}

}
