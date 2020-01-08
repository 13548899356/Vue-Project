package com.zking.sys.dao.impl.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.customer.addCstLost;
import com.zking.sys.entity.customer.Orders;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.entity.customer.cstLost;
import com.zking.util.DBHelper;
import com.zking.util.PageBean;

public class addCstLostImpl extends BaseDAO implements addCstLost {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public List<Orders> addCstLoadOfComputer() {
		// TODO Auto-generated method stub
		List<Orders> list = new ArrayList<>();
		List<cstLost> list2 = this.getlist();
		
			try {
//				获取最近订单时间到现在未订单时间已有六个月的用户
				String sql = "SELECT * FROM orders a,cst_customer b WHERE a.odr_customer_no=b.cust_no AND a.odr_date IN ("
						+ "SELECT MAX(odr_date) FROM orders GROUP BY odr_customer_no HAVING TIMESTAMPDIFF(DAY,MAX(odr_date),NOW()) >180"
						+ "  AND  odr_customer_no  not in(";
						for (cstLost cs : list2) {
							sql+="'"+cs.getLstCustNo()+"',";
						}
						sql=sql.substring(0, sql.length() - 1);
						sql+= "))";
				con = DBHelper.getcon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				String sql2 = "insert into cst_lost(lst_id,lst_cust_no,lst_cust_name,lst_cust_manager_id,lst_cust_manager_name"
						+ ",lst_last_order_date) values";

				while (rs.next()) {

					String id = UUID.randomUUID().toString().replace("-", "");
					sql2 += "('" + id + "','" + rs.getString("cust_no") + "','" + rs.getString("cust_name") + "','"
							+ rs.getString("cust_manager_id") + "'" + ",'" + rs.getString("cust_manager_name") + "','"
							+ rs.getTimestamp("odr_date") + "'),";
				}
				// 去掉最后一个 ,
				sql2 = sql2.substring(0, sql2.length() - 1);
				ps = con.prepareStatement(sql2);
				int n = ps.executeUpdate();
//				System.out.println(sql);
//				System.out.println(n);

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				DBHelper.myclose(con, ps,rs);
			}
		

		return list;
	}

	public List<cstLost> getlist() {
		List<cstLost> list = new ArrayList<cstLost>();
		try {
			// 流失表不能添加重复用户
			String sql3 = "select lst_cust_no from cst_lost";
			con = DBHelper.getcon();
			ps = con.prepareStatement(sql3);
			rs = ps.executeQuery();
			cstLost cs = null;
			while (rs.next()) {
				cs = new cstLost();
				cs.setLstCustNo(rs.getString(1));
				list.add(cs);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBHelper.myclose(con, ps,rs);
		}
	
		return list;
	}



}
