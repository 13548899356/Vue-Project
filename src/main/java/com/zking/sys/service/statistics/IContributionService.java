package com.zking.sys.service.statistics;

import java.util.List;

import com.zking.sys.entity.customer.cstCustomer;

public interface IContributionService {

	public List<cstCustomer> listContribute(cstCustomer customer);
}
