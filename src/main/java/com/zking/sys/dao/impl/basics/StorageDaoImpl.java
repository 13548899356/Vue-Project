package com.zking.sys.dao.impl.basics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.basics.IStorageDao;
import com.zking.sys.entity.basics.Storage;
import com.zking.util.DBHelper;
import com.zking.util.PageBean;

public class StorageDaoImpl extends BaseDAO implements IStorageDao {
	
	@Override
	public void addStorage(Storage stoage) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(stoage);
	}

	@Override
	public List<Storage> listStorage(Storage sto,PageBean pageBean) {
		// TODO Auto-generated method stub
		List<Storage> list=new ArrayList<>();
		String sql="SELECT * FROM STORAGE a,product b WHERE a.stk_prod_id=b.prod_id ";
		try {
			Connection con=DBHelper.getcon();
			if(null!=sto.getStkProdId()) {
				sql+="and b.prod_name like '%"+sto.getStkProdId()+"%'";
			}
			if(null!=sto.getStkWarehouse()) {
				sql+=" and a.stk_warehouse like '%"+sto.getStkWarehouse()+"%'";
			}
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			Storage st=null;
			while(rs.next()) {
				st=new Storage();
				st.setStkId(rs.getString("stk_id"));
				st.setStkProdId(rs.getString("stk_prod_id"));
				st.setStkWarehouse(rs.getString("stk_warehouse"));
				st.setStkWare(rs.getString("stk_ware"));
				st.setStkCount(rs.getInt("stk_count"));
				st.setStkMemo(rs.getString("stk_memo"));
				st.setProdName(rs.getString("prod_name"));
				list.add(st);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

}
