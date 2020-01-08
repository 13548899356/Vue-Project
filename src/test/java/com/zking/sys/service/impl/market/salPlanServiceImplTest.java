package com.zking.sys.service.impl.market;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zking.sys.entity.market.salChance;
import com.zking.sys.entity.market.salPlan;
import com.zking.sys.service.BaseTestCase;
import com.zking.sys.service.market.IsalChanceService;
import com.zking.sys.service.market.IsalPlanService;
import com.zking.util.PageBean;

public class salPlanServiceImplTest extends BaseTestCase{
	
	private salPlan salPlan;
	private IsalPlanService is;

	@Before
	public void setUp() throws Exception {
		salPlan=new salPlan();
		is=(IsalPlanService) getBean("salPlanService");
	}

	@Test
	public void testAddSalPlan() {
		salPlan.setPlachcId("3");
		salPlan.setPlaTodo("斯蒂芬规划局");
		salPlan.setPlaResult("开发成功");
		is.addSalPlan(salPlan);
	}
	
	@Test
	public void testEditSalPlan() {
		salPlan.setPlaId("4028ab2d6dd4d512016dd4d516070000");
		salPlan.setPlachcId("3S");
		salPlan.setPlaTodo("cvbnmmmm");
		salPlan.setPlaResult("开发失败");
		is.editSalPlan(salPlan);
	}

	@Test
	public void testDelSalPlan() {
		salPlan.setPlaId("4028ab2d6dd4d512016dd4d516070000");
		is.delSalPlan(salPlan);
	}

	@Test
	public void testQuerySalPlanPager() {
		PageBean pageBean=new PageBean();
		List<salPlan> putaway = is.querySalPlanPager(salPlan, pageBean);
		for (salPlan sal : putaway) {
			System.out.println(sal);
		}
	}

}
