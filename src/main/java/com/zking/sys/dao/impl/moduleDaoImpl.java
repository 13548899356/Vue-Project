	package com.zking.sys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.ImoduleDao;
import com.zking.sys.entity.Module;
import com.zking.util.DBHelper;

public class moduleDaoImpl extends BaseDAO implements ImoduleDao {

	private static final long serialVersionUID = 8354100394415921480L;

	public moduleDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Module> listRootModule() {
		return this.getHibernateTemplate().execute(new HibernateCallback<List<Module>>() {

			@Override
			public List<Module> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from Module where pid=-1";
				Query<Module> query = session.createQuery(hql, Module.class);
				List<Module> list = query.list();
				for (Module module : list) {
					listModuleById(module.getId(), module);
				}
				return list;
			}
		});
	}

	@Override
	public void listModuleById(final int id, Module m) {
		// TODO Auto-generated method stub
		List<Module> lis = this.getHibernateTemplate().execute(new HibernateCallback<List<Module>>() {

			@Override
			public List<Module> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from Module where pid=:id ";
				Query<Module> query = session.createQuery(hql, Module.class);
				query.setParameter("id", id);
				List<Module> list = query.list();
				for (Module module : list) {
//					System.out.println(module);
				}

				return list;
			}
		});	
		m.setChildren(lis);
	}

	@Override
	public List<Module> listGetRoleRootModule(String str) {
		// TODO Auto-generated method stub
		List<Module> list=new ArrayList<Module>();
		String sql="SELECT c.* FROM t_sys_user a ,t_sys_role_permission b,t_module_vue c WHERE"
				+ " a.position =b.userPosition AND b.moduleId =c.id AND" + 
				" a.user_id='"+str+"' AND  c.pid=-1";
		try {
			Connection con=DBHelper.getcon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			Module m=null;
			while(rs.next()) {
				m=new Module();
				m.setId(rs.getInt(1));
				m.setPid(rs.getInt(2));
				m.setLabel(rs.getString(3));
				m.setIcon(rs.getString(4));
				m.setUrl(rs.getString(5));
				m.setSort(rs.getInt(6));
				list.add(m);
			}
			for (Module module : list) {
//				listModuleById(module.getId(), module);
				listModuleById2(module.getId(), module, str);
				System.out.println(module.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void listModuleById2(int id, Module m,String str) {
		// TODO Auto-generated method stub
		List<Module> lis = new ArrayList<>();
		String sql="SELECT * FROM t_module_vue WHERE pid="+id+" and id IN(" + 
				"	SELECT moduleId FROM t_sys_role_permission WHERE userPosition=(SELECT DISTINCT  "
				+ "userPosition FROM t_sys_role_permission WHERE userPosition IN(" + 
				"SELECT POSITION FROM t_sys_user WHERE user_id='"+str+"' )))";
		System.out.println(sql);
		try {
			Connection con=DBHelper.getcon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			Module mo=null;
			while(rs.next()) {
				mo=new Module();
				mo.setId(rs.getInt(1));
				mo.setPid(rs.getInt(2));
				mo.setLabel(rs.getString(3));
				mo.setIcon(rs.getString(4));
				mo.setUrl(rs.getString(5));
				mo.setSort(rs.getInt(6));
				lis.add(mo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		m.setChildren(lis);
	}

}
