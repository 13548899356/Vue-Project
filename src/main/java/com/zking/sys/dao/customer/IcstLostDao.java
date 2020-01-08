package com.zking.sys.dao.customer;

import java.util.List;

import com.zking.sys.entity.customer.cstLost;
import com.zking.util.PageBean;

public interface IcstLostDao {

	
	/**
	 * @param 暂缓流失
	 */
	public void doStopCstLost(cstLost lost);
	
	
	/**
	 * @param 确认流失
	 */
	public void doSureCstLost(cstLost lost);
	
	
	
	/**
	 * @param 查询
	 * @return
	 */
	public List<cstLost> listCstLost(cstLost lost,PageBean pageBean);
	
	
	/**
	 * @param 添加用户流失信息
	 */
	public void addCstLost(cstLost lost);
	
	
	
	public cstLost doGetLost(String id);
	
	
	
}
