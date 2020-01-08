package com.zking.sys.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.entity.basics.basDict;
import com.zking.sys.service.BaseTestCase;
import com.zking.sys.service.basics.IbasDictService;
import com.zking.util.PageBean;

public class basDictServiceImplTest extends BaseTestCase{
	private IbasDictService bd;
	private basDict b;
	private PageBean pageBean;
	
	@Before
	public void before()  {
		bd=(IbasDictService) getBean("basDictService");
		b=new basDict();
		pageBean=new PageBean();
	}

	@Test
	public void testAddBasDict() {
		b.setDictType("客户状态");
		b.setDictValue("2");
		Object type = bd.doGetType(b,"dictItem");
		System.out.println(type);
	}

	@Test
	public void testDelBasDict() {
		List<Object> list = bd.listType();
		for (Object object : list) {
			System.out.println(object);
		}
	}

	@Test
	public void testother() {
		b.setDictType("企业客户等级");
		List<Object> list = bd.listOther(b, "dictItem");
		for (Object object : list) {
			System.out.println(object);
		}
	}
	@Test
	public void testEditBasDict() {
		b.setDictId("1");
		b.setDictIsEditable(1);
		b.setDictType("企业客户等级");
		b.setDictItem("普通客户2");
		b.setDictValue("1");
		bd.editBasDict(b);
		
	}

	@Test
	public void testListBasDict() {
//		b.setDictItem("企业");
		List<basDict> list = bd.listBasDict(b, pageBean);
		for (basDict bb : list) {
//			bb.setDictIsEditable((byte) (bb.getDictIsEditable()-48));
			System.out.println(bb);
		}
	}

}
