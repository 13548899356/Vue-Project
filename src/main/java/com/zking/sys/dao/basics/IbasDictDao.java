	package com.zking.sys.dao.basics;

import java.util.List;

import com.zking.sys.entity.basics.basDict;
import com.zking.util.PageBean;

public interface IbasDictDao {

	
	/**
	 * @param 增加数据字典
	 */
	public void addBasDict(basDict dict);
	
	/**
	 * @param 删除数据字典
	 */
	public void delBasDict(basDict dict);
	
	/**
	 * @param 修改数据字典
	 */
	public void editBasDict(basDict dict);
	
	
	/**
	 * @param 根据条件查询数据
	 * @return list集合
	 */
	public List<basDict> listBasDict(basDict dict,PageBean pageBean); 
	
	
	/**
	 * @param 通过类型和字典值获取条目
	 * @return
	 */
	public Object doGetType(basDict dict,String str);
	
	
	
	/**
	 * @param 将数据表中的类型过滤后，形成一个类型集合
	 * @return
	 */
	public List<Object> listType();
	
	
	/**
	 * @param 将所需条件查询出你想要的值
	 * @return
	 */
	public List<Object> listOther(basDict dict,String str);
	
	
}
