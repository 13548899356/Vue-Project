package com.zking.sys.service.market;

import java.util.List;

import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.entity.market.salPlan;
import com.zking.util.PageBean;

public interface IsalPlanService {
		/**
		 * @param salPlan
		 * 增加
		 */
		public void addSalPlan(salPlan salPlan);
		
		/**
		 * @param salPlan
		 * 修改
		 */
		public void editSalPlan(salPlan salPlan);
		
		
		/**
		 * @param salPlan
		 * 删除
		 */
		public void delSalPlan(salPlan salPlan);
		
		
		
		/**
		 * @param salPlan
		 * @param pageBean
		 * @return 查询全部分页
		 */
		public List<salPlan> querySalPlanPager(salPlan salPlan,PageBean pageBean);
		
		

	}
