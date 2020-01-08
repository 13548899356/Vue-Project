package com.zking.util;

import java.io.Serializable;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.PersistentIdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;




public class MyKey implements IdentifierGenerator,Configurable{
	
	//表名
	private String tableName;
	//表中的主键列名
	private String pk;
	//拼接后的sql语句
	private String sql;
	
	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		
		tableName = params.getProperty(PersistentIdentifierGenerator.TABLE);
		pk= params.getProperty(PersistentIdentifierGenerator.PK);
		sql="select max("+this.pk+") from "+this.tableName;
		String a = params.getProperty("sql");
		System.out.println(a+"年后");
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		Serializable id = this.nextVal(session.connection());
		System.out.println(id+"iii");
		return id;
	}
	
	
	private String nextVal(Connection con) {
		int count=0;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				count=Integer.parseInt(rs.getObject(1).toString());
				count=count+2;
			}
			return "KHD712020"+count;
			
		} catch (Exception e) {
			 throw new RuntimeException(); 
		}
		
	}
	

}
