package com.zking.base.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zking.util.DBHelper;
import com.zking.util.PageBean;


public abstract class BaseDAO extends HibernateDaoSupport implements Serializable {

	private static final long serialVersionUID = 382606892558123238L;

	private static Logger log = LogManager.getLogger(BaseDAO.class);
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public BaseDAO() {
		super();
	}

	/**
	 * 查全部，支持分页
	 * 
	 * @param hql
	 *            hibernate查询语句，里面可以嵌套:name命名参数
	 * @param args
	 *            hql里面的参数
	 * @param pageBean
	 *            分页bean
	 * @return
	 */
	public List<?> executeQuery(final String hql, final Map<String, Object> args, final PageBean pageBean) {
		return this.getHibernateTemplate().execute(new HibernateCallback<List<?>>() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			@Override
			public List<?> doInHibernate(Session session) throws HibernateException {
				Query query = null;
				// 第一次查满足条件的总记录数
				if (null != pageBean && pageBean.isPagination()) {
					// from Account a
					// select count(*) from Account a
					String countHql = getCountHql(hql);
					log.info("countHql=[{}]", countHql);
					query = session.createQuery(countHql);
					setParameters(query, args);
					// 兼容int/long
					Object total = query.uniqueResult();
					pageBean.setTotal(total.toString());
				}

				// 第二次查满足条件并指定页码的记录数
				log.info("hql=[{}]", hql);
				query = session.createQuery(hql);
				setParameters(query, args);
				if (null != pageBean && pageBean.isPagination()) {
					query.setFirstResult(pageBean.getStartIndex());
					query.setMaxResults(pageBean.getRows());
				}
				List<?> list = (List<?>) query.list();
				return list;
			}
		});	
	}

	private void setParameters(Query query, Map<String, Object> args) {
		if (null == args || 0 == args.size()) {
			return;
		}

		String name = null;
		Object value = null;
		for (Map.Entry<String, Object> entry : args.entrySet()) {
			name = entry.getKey();
			value = entry.getValue();
			if (value instanceof Collection) {// List/Set
				query.setParameterList(name, (Collection) value);
			} else if (value instanceof Object[]) {
				query.setParameterList(name, (Object[]) value);
			} else {
				query.setParameter(name, value);
			}
		}
	}

	// from Account a where 1=1 and a=:a and b=:b
	// select a.b, a.c FroM Account a
	// select a.b, a.c FroM Account a where a.id in (:ids);ids数组/List/Set
	private String getCountHql(String hql) {
		String newHql = new String(hql).toUpperCase();
		int index = newHql.indexOf("FROM ");
		String countHql = "select count(*)  " + hql.substring(index);
		return countHql;
	}
	
	
	//多条数据插入语句
		public  static void executeUpdateBatch(String []sqls) {
			Connection con=null;
			PreparedStatement ps=null;
			try {
				con=DBHelper.getcon();
//				设置自动取消
				for (String sql : sqls) {
					ps=con.prepareStatement(sql);
					ps.executeUpdate();
				}
				con.commit();
				
			} catch (Exception e) {
				try {
					con.rollback();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}finally {	
				DBHelper.myclose(con, ps);
			}
			
			
				
		}
	
	
}
