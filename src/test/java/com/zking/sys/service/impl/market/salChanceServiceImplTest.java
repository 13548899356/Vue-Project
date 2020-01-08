package com.zking.sys.service.impl.market;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.market.salChance;
import com.zking.sys.service.BaseTestCase;
import com.zking.sys.service.market.IsalChanceService;
import com.zking.util.PageBean;

public class salChanceServiceImplTest extends BaseTestCase{
	
	private salChance salChance;
	private IsalChanceService is;

	@Before
	public void setUp() throws Exception {
		salChance=new salChance();
		is=(IsalChanceService) getBean("salChanceService");
	}

	@Test
	public void testAddSalChance() {
		salChance.setChcSource("怡宝");
		salChance.setChcCustName("zs");
		salChance.setChcTitle("wertyu");
		salChance.setChcRate(90);
		salChance.setChcLinkman("的风格和健康");
		salChance.setChcTel("110");
		salChance.setChcDesc("1234567");
		salChance.setChcCreateId("1");
		salChance.setChcCreateBy("2345678");
		salChance.setChcDueId(1);
		salChance.setChDueTo("13r");
		salChance.setChcStatus("qwerty");
		
		is.addSalChance(salChance);
	}

	@Test
	public void testEditSalChance() {
		salChance.setChcId("1");
		salChance.setChcSource("hhhh");
		salChance.setChcCustName("zs");
		salChance.setChcTitle("dghhkj");
		salChance.setChcRate(90);
		salChance.setChcLinkman("dfghjk");
		salChance.setChcTel("110");
		salChance.setChcDesc("1234567");
		salChance.setChcCreateId("1");
		salChance.setChcCreateBy("2345678");
		salChance.setChcDueId(1);
		salChance.setChDueTo("13r");
		salChance.setChcStatus("qwerty");
		
		is.editSalChance(salChance);
	}

	@Test
	public void testDelSalChance() {
		salChance.setChcId("1");
		is.delSalChance(salChance);
	}

	@Test
	public void testQuerySalchancePager() {
		PageBean pageBean=new PageBean();
		List<salChance> books=is.querySalchancePager(salChance, pageBean);
		for (salChance salChance : books) {
			System.out.println(salChance);
		}
	}
	
	@Test
	public void testPutaway() {
		PageBean pageBean=new PageBean();
		List<salChance> putaway = is.Noputaway(salChance, pageBean);
		for (salChance sal : putaway) {
			System.out.println(sal);
		}
	}

}
