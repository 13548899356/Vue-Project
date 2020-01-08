package com.zking.sys.dao.impl.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.user.IsysRoleDao;
import com.zking.sys.entity.user.sysRole;
import com.zking.sys.entity.user.sysUser;
import com.zking.util.DBHelper;

public class sysRoleDaoImpl extends BaseDAO implements IsysRoleDao {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public List<sysRole> listRole(sysRole role) {
		// TODO Auto-generated method stub
		List<sysRole> list=new ArrayList<sysRole>();
		try {

			con = DBHelper.getcon();
			String sql = "SELECT a.*,c.* FROM t_sys_user a ,t_sys_user_role b ,t_sys_role c"
					+ " WHERE a.user_id=b.user_id AND c.role_id=b.role_id ";
			if (null != role.getRoleName()) {
				sql += "AND c.role_name like '%"+role.getRoleName()+"%'";
			}
				ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			sysRole roles=null;
			sysUser user=null;
			while (rs.next()) {
				roles=new sysRole();
				user=new sysUser();
				user.setUserId(rs.getString("user_id"));
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSalt(rs.getString("salt"));
				user.setLocked(rs.getInt("locked"));
				user.setCreateDateTime(rs.getTimestamp("create_datetime"));
				user.setPosition(rs.getInt("position"));
				roles.setUser(user);
				roles.setRoleId(rs.getString("role_id"));
				roles.setRoleName(rs.getString("role_name"));
				roles.setAvailable(rs.getInt("available"));
				roles.setDescription(rs.getString("description"));
				
				list.add(roles);
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
