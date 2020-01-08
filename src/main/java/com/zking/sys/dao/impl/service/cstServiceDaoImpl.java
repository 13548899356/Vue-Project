package com.zking.sys.dao.impl.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.SliderUI;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.service.IcstServiceDao;
import com.zking.sys.entity.service.cstService;
import com.zking.util.DBHelper;
import com.zking.util.PageBean;
import com.zking.util.StringUtils;

public class cstServiceDaoImpl extends BaseDAO implements IcstServiceDao {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private static final long serialVersionUID = 674483489833652903L;

	public cstServiceDaoImpl() {
		super();
	}

	@Override
	public void addService(cstService cstservice) {
		this.getHibernateTemplate().save(cstservice);
	}

	@Override
	public void delService(cstService cstservice) {
		cstService c = this.getHibernateTemplate().get(cstService.class, cstservice.getSvrId());
		if (c != null) {
			this.getHibernateTemplate().delete(c);
		}
	}

	@Override
	public void editService(cstService cstservice) {
		cstService c = this.getHibernateTemplate().get(cstService.class, cstservice.getSvrId());
		if (c != null) {
			c.setSvrType(cstservice.getSvrType());
			c.setSvrTitle(cstservice.getSvrTitle());
			c.setSvrCustNo(cstservice.getSvrCustNo());

			c.setSvrCustName(cstservice.getSvrCustName());
			c.setSvrStatus(cstservice.getSvrStatus());
			c.setSvrRequest(cstservice.getSvrRequest());
			c.setSvrCreateId(cstservice.getSvrCreateId());

			c.setSvrCreateBy(cstservice.getSvrCreateBy());
			c.setSvrDueId(cstservice.getSvrDueId());
			c.setSvrDueTo(cstservice.getSvrDueTo());

			c.setSvrDueDate(cstservice.getSvrDueDate());
			c.setSvrDeal(cstservice.getSvrDeal());
			c.setSvrDealId(cstservice.getSvrDealId());
			c.setSvrDealBy(cstservice.getSvrDealBy());

			c.setSvrDealDate(cstservice.getSvrDealDate());
			c.setSvrResult(cstservice.getSvrResult());
			c.setSvrSatisfy(cstservice.getSvrSatisfy());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<cstService> listService(cstService cstservice, PageBean pageBean) {
		String hql = " from cstService c where 1=1 ";
		Map<String, Object> args = new HashMap<String, Object>();
		// 客户 概要 服务类型 创建日期 状态
		if (StringUtils.isNotBlank(cstservice.getSvrCustName())) {
			hql += " and c.svrCustName like :svrCustName ";
			args.put("svrCustName", "%" + cstservice.getSvrCustName() + "%");
		}
		if (StringUtils.isNotBlank(cstservice.getSvrTitle())) {
			hql += " and c.svrTitle like :svrTitle ";
			args.put("svrTitle", "%" + cstservice.getSvrTitle() + "%");
		}
		if (StringUtils.isNotBlank(cstservice.getSvrType())) {
			hql += " and c.svrType like :svrType ";
			args.put("svrType", "%" + cstservice.getSvrType() + "%");
		}
		if (StringUtils.isNotBlank(cstservice.getSvrCreateDate())) {
//			System.out.println(cstservice.getSvrCreateDate());
			String[] split = cstservice.getSvrCreateDate().split(",");
			hql += " and c.svrCreateDate between '" + split[0] + "' and '" + split[1] + "'";
		}
		if (StringUtils.isNotBlank(cstservice.getSvrStatus())) {
			hql += " and c.svrStatus like :svrStatus ";
			args.put("svrStatus", "%" + cstservice.getSvrStatus() + "%");
		}
		hql += " order by c.svrCreateDate desc";
		System.out.println(hql);
		return (List<cstService>) this.executeQuery(hql, args, pageBean);
	}

	@Override
	public cstService loadService(cstService cstservice) {
		cstService c = this.getHibernateTemplate().get(cstService.class, cstservice.getSvrId());
//		System.out.println(c);
		return c;
	}

	@Override
	public List<cstService> listServers(cstService server) {
		// TODO Auto-generated method stub
		List<cstService> list=new ArrayList<>();
		String sql = "SELECT a.svr_type,COUNT(1) FROM cst_service a where 1=1";
		if (null != server.getSvrCreateDate()) {
			sql += " and svr_create_date like '%" + server.getSvrCreateDate() + "%'";
		}
		sql+=" GROUP BY svr_type ";
		System.out.println(sql);
		try {
			con = DBHelper.getcon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			cstService cs=null;
			while(rs.next()) {
				cs=new cstService();
				cs.setSvrType(rs.getString(1));
				cs.setSvrCreateBy(rs.getString(2));
				list.add(cs);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBHelper.myclose(con, ps, rs);
		}

		return list;
	}

}
