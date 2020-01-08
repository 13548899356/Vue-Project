package com.zking.sys.service;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.dao.service.IcstServiceDao;
import com.zking.sys.entity.service.cstService;
import com.zking.sys.service.service.IcstServiceService;

public class IcstServiceServiceTest extends BaseTestCase{

	private cstService cs;
	private IcstServiceService iss;
	@Before
	public void Before(){
		cs=new cstService();
		iss=(IcstServiceService)getBean("cstServiceService");
	}

	@Test
	public void addService() {
		cs.setSvrType("服务类型");
		cs.setSvrTitle("服务概要");
		cs.setSvrCustName("客户名字");
		cs.setSvrRequest("服务请求");
		cs.setSvrCreateId("222");
		cs.setSvrCreateBy("创建人");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String format = sdf.format(new Date());
		cs.setSvrCreateDate(format);
		iss.addService(cs);
	}
	
	@Test
	public void delService() {
		cs.setSvrId("4028ab0e6d591d6e016d591d71b00000");
		iss.delService(cs);
	}
	
	@Test
	public void editService() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String format = sdf.format(new Date());
		cs.setSvrId("4028ab0e6dce10b8016dce10bd2d0000");
		cs.setSvrType("服务类型");
		cs.setSvrTitle("服务概要");
		cs.setSvrCustName("客户名字");
		cs.setSvrRequest("服务请求");
		cs.setSvrCreateId("111");
		cs.setSvrCreateBy("创建人");
		//服务分配
//		cs.setSvrDealId("2");
//		cs.setSvrDueTo("小米");
//		cs.setSvrDueDate(format);
//		cs.setSvrStatus("已分配");
		//服务处理   系统自动记录处理人和处理时间
		cs.setSvrDealId("2");
		cs.setSvrDealBy("小明客户经理");
		cs.setSvrDealDate(format);
		cs.setSvrDeal("今天厦门客户有一个问题需要处理，需要当面问他，在今天要必须完成");
//		cs.setSvrStatus("已处理");
		//服务反馈
		cs.setSvrRequest("已经处理完了，还可以");
		cs.setSvrSatisfy(5);
		cs.setSvrStatus("已归档");//如果客户满意度大于等于3，服务单据状态改为“已归档”。如果服务满意度小于3，服务状态改为“已分配”，重新进行处理。
		iss.editService(cs);;
	}
	@Test
	public void listServiCeallocation() {
		List<cstService> list = iss.listService(cs, pageBean);
		for (cstService cstServices : list) {
			System.out.println(cstServices);
		}
	}
	@Test
	public void loadService() {
		cs.setSvrId("4028ab0e6dce10b8016dce10bd2d0000");
		iss.loadService(cs);
	}

}
