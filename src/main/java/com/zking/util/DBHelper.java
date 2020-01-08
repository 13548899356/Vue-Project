package com.zking.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {

	private static String url;
	private static String driver;
	private static String user;
	private static String pwd;
	
	
	
	static {
		 try {
			 InputStream is= DBHelper.class.getResourceAsStream("DBHelpe.properties");
			 Properties pr=new Properties();
			 pr.load(is);
			 url=pr.getProperty("url");
			 driver=pr.getProperty("driver");
			 user=pr.getProperty("user");
			 pwd=pr.getProperty("pwd");
			 Class.forName(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	public static Connection getcon() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void myclose(Connection con,PreparedStatement ps,ResultSet rs) {
		try {
			if(con!=null&&!con.isClosed()) {
				con.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(rs!=null) {
				rs.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static void myclose(Connection con,PreparedStatement ps) {
		try {
			if(con!=null&&!con.isClosed()) {
				con.close();
			}
			if(ps!=null) {
				ps.close();
			}
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public static void myclose(Connection con) {
		try {
			if(con!=null&&!con.isClosed()) {
				con.close();
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(getcon());
		
	}
	
}
