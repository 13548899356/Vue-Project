package com.zking.sys.dao.statistics;

import java.util.List;

import com.zking.sys.entity.customer.cstCustomer;

/**
 * @author TimeDip
 *	客户贡献分析
 */
public interface IContributeDao {

	public List<cstCustomer> listContribute(cstCustomer customer);
	
	
}
