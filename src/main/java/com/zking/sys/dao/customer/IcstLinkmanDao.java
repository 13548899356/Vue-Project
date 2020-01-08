package com.zking.sys.dao.customer;

import java.util.List;

import com.zking.sys.entity.customer.cstLinkman;
import com.zking.util.PageBean;

public interface IcstLinkmanDao {

	
	/**
	 * @param 新建联系人
	 */
	public void addLinkman(cstLinkman linkman);
	
	/**
	 * @param 删除联系人
	 */
	public void delLinkman(cstLinkman linkman);
	
	
	/**
	 * @param 修改联系人
	 */
	public void editLinkman(cstLinkman linkman);
	
	
	/**
	 * @param 根据客户编号查询联系人
	 * @return
	 */
	public List<cstLinkman> listLinkman(cstLinkman linkman,PageBean pageBean);
	
	/**
	 * @param 单个联系人详情
	 * @return
	 */
	public cstLinkman doGetLinkman(cstLinkman linkman);
	
	
	
	
	
	
}
