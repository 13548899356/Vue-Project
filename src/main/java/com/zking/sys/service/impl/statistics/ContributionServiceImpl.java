package com.zking.sys.service.impl.statistics;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.impl.statistics.ContributionDaoImpl;
import com.zking.sys.dao.statistics.IContributeDao;
import com.zking.sys.entity.customer.cstCustomer;
import com.zking.sys.service.statistics.IContributionService;

public class ContributionServiceImpl extends BaseService implements IContributionService {

	private IContributeDao contributionDao=new ContributionDaoImpl();
	
	
	@Override
	public List<cstCustomer> listContribute(cstCustomer customer) {
		// TODO Auto-generated method stub
		return contributionDao.listContribute(customer);
	}

}
