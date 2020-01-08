package com.zking.sys.service.service;

import java.util.List;

import com.zking.sys.entity.service.cstService;
import com.zking.util.PageBean;

public interface IcstServiceService {
	/**
	 * 服务创建
	 * @param service
	 */
	public void addService(cstService cstservice);
	/**
	 * 服务分配中的删除操作
	 * @param cstservice
	 */
	public void delService(cstService cstservice);
	/**
	 * 服务编辑
	 * @param cstservice
	 */
	public void editService(cstService cstservice);
	/**
	 * 服务分页查询
	 * @param service
	 * @return
	 */
	public List<cstService> listService(cstService cstservice,PageBean pageBean);
	/**
	 * 服务单个查询
	 * @param cstservice
	 * @return
	 */
	public cstService loadService(cstService cstservice);
	
	
	
	//报表所需
	public List<cstService> listServers(cstService server);
}
