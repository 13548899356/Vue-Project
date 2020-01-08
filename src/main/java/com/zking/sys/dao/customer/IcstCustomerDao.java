package com.zking.sys.dao.customer;

import java.util.List;

import com.zking.sys.entity.customer.cstCustomer;
import com.zking.util.PageBean;

/**
 * @author TimeDip
 *
 */
public interface IcstCustomerDao {

	
	/**
	 * @param 查询所有客户信息
	 * @return list集合
	 */
	public List<cstCustomer> listCstCustmoer(cstCustomer cs,PageBean pageBean); 
	
	
	/**
	 * @param 查询单个
	 * @return
	 */
	public cstCustomer doGetCustomer(cstCustomer cs);
	
	
	/**
	 * @param 删除
	 */
	public void delCustomer(cstCustomer cs);
	
	/**
	 * @param 修改
	 */
	public void editCustomer(cstCustomer cs);
	
	
	/**
	 * @param 新增
	 */
	public void addCustomer(cstCustomer cs);
	
	
	/**
	 * @param 开发成功自动添加客户数据
	 */
	public void addCustomer2(cstCustomer customer);
	
}
