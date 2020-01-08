package com.zking.sys.dao.market;

import java.util.List;

import com.zking.sys.entity.market.salChance;
import com.zking.util.PageBean;

/**
 * @author zking
 * 营销管理DAO
 *
 */
public interface IsalChanceDao {
	
	/**
	 * @param salChance
	 * 增加
	 */
	public void addSalChance(salChance salChance);
	
	/**
	 * @param salChance
	 * 修改
	 */
	public void editSalChance(salChance salChance);
	
	
	/**
	 * @param salChance
	 * 删除
	 */
	public void delSalChance(salChance salChance);
	
	
//	public Book get(Book book);
	
	/**
	 * @param salChance
	 * @param pageBean
	 * @return 查询全部分页
	 */
	public List<salChance> querySalchancePager(salChance salChance,PageBean pageBean);
	

	/**
	 * @param salChance
	 * @param pageBean
	 * @return 查询已分配
	 */
	public List<salChance> Putaway(salChance salChance,PageBean pageBean);
	
	/**
	 * @param salChance
	 * @param pageBean
	 * @return 查询未分配
	 */
	public List<salChance> Noputaway(salChance salChance,PageBean pageBean);
	
}
