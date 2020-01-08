package com.zking.util;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {

	private static final String 
			HIBERNATE_CONFIG_FILE="spring.xml";

	//本地线程
	private static ThreadLocal<Session> threadLocal=
			new ThreadLocal<Session>();
	
	//创建数据库的会话工厂
	private static SessionFactory sessionFactory;
	
	//读取hibernate核心配置
	private static Configuration configuration;
	
	static {
		try {
			configuration=new Configuration();
			configuration.configure(HIBERNATE_CONFIG_FILE);
			//创建Session会话工厂
			sessionFactory=configuration.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Session openSession() {
		Session session = threadLocal.get();
		if(null==session) {
			session=sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	
	public static void closeSession() {
		Session session = threadLocal.get();
		if(null!=session) {
			if(session.isOpen())
				session.close();
			threadLocal.set(null);
		}
	}
	
	public static void main(String[] args) {
		Session session = SessionFactoryUtils.openSession();
		System.out.println("Session状态："+session.isOpen());
		System.out.println("Session会话已打开");
		SessionFactoryUtils.closeSession();
		System.out.println("Session会话已关闭");
	}
}












