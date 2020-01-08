package com.zking.sys.dao.impl.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.user.sysUser2Dao;
import com.zking.sys.entity.user.sysRole;
import com.zking.sys.entity.user.sysUser;
import com.zking.util.DBHelper;

public class sysUser2DaoImpl extends BaseDAO implements sysUser2Dao {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public List<sysUser> listSysUser(sysUser users) {
		// TODO Auto-generated method stub
		List<sysUser> list = new ArrayList<sysUser>();
		try {

			con = DBHelper.getcon();
			String sql = "SELECT a.*,c.* FROM t_sys_user a ,t_sys_user_role b ,t_sys_role c "
					+ "WHERE a.user_id=b.user_id AND c.role_id=b.role_id ";
			if(null!=users.getUserName()) {
				sql+="AND a.username='" + users.getUserName() + "'";
			}
			if(0!=users.getPosition()) {
				sql+="AND a.position="+users.getPosition()+"";
			}
			ps = con.prepareStatement(sql);
			System.out.println(sql);
			rs = ps.executeQuery();
			sysRole roles = null;
			sysUser user = null;
			while (rs.next()) {
				roles = new sysRole();
				user = new sysUser();
				roles.setRoleId(rs.getString("role_id"));
				roles.setRoleName(rs.getString("role_name"));
				roles.setAvailable(rs.getInt("available"));
				roles.setDescription(rs.getString("description"));
				user.setRole(roles);
				user.setUserId(rs.getString("user_id"));
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSalt(rs.getString("salt"));
				user.setLocked(rs.getInt("locked"));
				user.setCreateDateTime(rs.getTimestamp("create_datetime"));
				user.setPosition(rs.getInt("position"));

				list.add(user);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBHelper.myclose(con, ps, rs);
		}

		return list;
	}

	@Override
	public void addUser(sysUser user) {
		// TODO Auto-generated method stub

		try {
			String id1 = UUID.randomUUID().toString().replace("-", "");
			String id2 = UUID.randomUUID().toString().replace("-", "");
			String id3 = UUID.randomUUID().toString().replace("-", "");
			String sql1 = "insert into t_sys_user (user_id,username,password,position) values('" + id1 + "','"
					+ user.getUserName() + "','" + user.getPassword() + "'," + user.getPosition() + ")";
			String sql2 = "insert into t_sys_role(role_id,role_name,description)values('" + id2 + "','"
					+ user.getRoleName() + "','" + user.getDescription() + "')";
			String sql3 = "insert into t_sys_user_role values('" + id3 + "','" + id1 + "','" + id2 + "')";
			super.executeUpdateBatch(new String[] { sql1, sql2, sql3 });
			System.out.println("欧拉拉拉拉");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBHelper.myclose(con, ps, rs);
		}


	}

	@Override
	public void editUser(sysUser user) {
		// TODO Auto-generated method stub
		//
		String sql1 = "update t_sys_user set password='" + user.getPassword() + "',position=" + user.getPosition()
				+ " where user_id='" + user.getUserId() + "'";
		String sql2 = "update t_sys_role set role_name='" + user.getRoleName() + "',description='"
				+ user.getDescription() + "' where role_id='" + user.getSalt() + "'";
		super.executeUpdateBatch(new String[] { sql1, sql2 });
	}

	@Override
	public void delUser(sysUser user) {
		// TODO Auto-generated method stub
		String sql1 = "delete from t_sys_user where user_id ='" + user.getUserId() + "' ";
		String sql2 = "delete from t_sys_role where role_id ='" + user.getRoleName() + "'";
		String sql3 = "delete from t_sys_user_role where user_id='" + user.getUserId() + "'";
		super.executeUpdateBatch(new String[] { sql1, sql2, sql3 });
	}

	@Override
	public void lock(sysUser user) {
		// TODO Auto-generated method stub
		String sql = "update t_sys_user set locked =" + user.getLocked() + " where user_id='" + user.getUserId() + "'";
		super.executeUpdateBatch(new String[] { sql });
	}

	@Override
	public void addRoleModule(sysUser user) {
		// TODO Auto-generated method stub
		System.out.println("addRoleModule");
//		1.删除该用户所有的权限
		String sql1 = "delete from t_sys_role_permission where userPosition=" + user.getPosition() + "";
//		2.添加用户对应的新权限
		String sql2 = "insert into t_sys_role_permission (rrid,userPosition,moduleId) values ";
		String[] moudleIds = user.getModuleId().split(",");
		for (String moduleId : moudleIds) {
			String id = UUID.randomUUID().toString().replace("-", "");
			sql2 += "('" + id + "'," + user.getPosition() + ",'" + moduleId + "'),";
		}
//		去掉最后一个 ,		
		sql2=sql2.substring(0, sql2.length()-1);
		System.out.println(sql2);
		super.executeUpdateBatch(new String[] { sql1,sql2});
	}

	@Override
	public List<String> getRoleModule(sysUser user) {
		// TODO Auto-generated method stub
		List<String> str=new ArrayList<String>();
		try {
//			String sql="select moduleId from t_sys_role_permission where userPosition="+user.getPosition()+"";
			String sql="SELECT id FROM t_module_vue WHERE id IN(" + 
					"SELECT moduleId FROM t_sys_role_permission WHERE userPosition="+user.getPosition()+" )AND pid!=-1";
			con=DBHelper.getcon();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			String a;
			while(rs.next()) {
				a=rs.getString(1);
				str.add(a);
			}
			
		} catch (Exception e) {
		}finally{
			DBHelper.myclose(con, ps, rs);
		}

		
		return str;
	}

}
