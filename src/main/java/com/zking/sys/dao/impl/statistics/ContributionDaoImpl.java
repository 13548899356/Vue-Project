package com.zking.sys.dao.impl.statistics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.statistics.IContributeDao;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.util.DBHelper;


public class ContributionDaoImpl extends BaseDAO implements IContributeDao {
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	
	
	@Override
	public List<cstCustomer> listContribute(cstCustomer customer) {
		// TODO Auto-generated method stub
		List<cstCustomer> list=new ArrayList<cstCustomer>();
		String sql="SELECT a.cust_name,SUM(c.prod_price*d.odd_count),COUNT(a.cust_name), MAX(b.odr_date) "
				+ "FROM cst_customer a,orders b,product c, order_line d WHERE a.cust_no=b.odr_customer_no "+
				"AND b.odr_id=d.odd_order_id AND d.odd_prod_id=c.prod_id GROUP BY a.cust_no ";
		if(null!=customer.getCustName()) {
			sql+=" HAVING a.cust_name LIKE '%"+customer.getCustName()+"%'";
		}
		
		try {
			con=DBHelper.getcon();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			cstCustomer cu=null;
			while(rs.next()) {
				cu=new cstCustomer();
				cu.setCustName(rs.getString("cust_name"));
				cu.setCustBank(rs.getString(2));
				cu.setCustBankAccount(rs.getString(3));
				cu.setCustZip(rs.getString(4).substring(0, 10));
				list.add(cu);
			}
			System.out.println(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBHelper.myclose(con, ps, rs);
		}
		return list;
	}

}
