package com.zking.sys.dao.customer;

import java.util.List;

import com.zking.sys.entity.customer.cstActivity;
import com.zking.util.PageBean;

public interface IcstActivityDao {

	
	/**
	 * @param 新建联系人
	 */
	public void addActivity(cstActivity activity);
	
	/**
	 * @param 删除联系人
	 */
	public void delActivity(cstActivity activity);
	
	/**
	 * @param 编辑联系人
	 */
	public void editActivity(cstActivity activity);
	
	/**
	 * @param 根据客户查询联系人
	 * @return list集合
	 */
	public List<cstActivity> listActivity(cstActivity activity,PageBean pageBean);
	
	/**
	 * @param 查看详情
	 * @return cstActivity对象
	 */
	public cstActivity doGetActivity(cstActivity activity);
	
}
