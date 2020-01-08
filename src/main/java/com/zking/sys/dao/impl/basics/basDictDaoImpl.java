package com.zking.sys.dao.impl.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.basics.IbasDictDao;
import com.zking.sys.entity.basics.basDict;
import com.zking.util.PageBean;

public class basDictDaoImpl extends BaseDAO implements IbasDictDao {

	public basDictDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBasDict(basDict dict) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dict);
	}

	@Override
	public void delBasDict(basDict dict) {
		// TODO Auto-generated method stub
		basDict bas = this.getHibernateTemplate().get(basDict.class, dict.getDictId());
		if(null!=bas) {
			this.getHibernateTemplate().delete(bas);
		}
		
	}

	@Override
	public void editBasDict(basDict dict) {
			this.getHibernateTemplate().update(dict);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<basDict> listBasDict(basDict dict,PageBean pageBean) {
		// TODO Auto-generated method stub
		String hql="from basDict  where 1=1 ";
		Map<String, Object> map=new HashMap<String, Object>();
		if(null!=dict.getDictItem()) {
			hql+=" and dictItem like :item";
			map.put("item",  "%"+dict.getDictItem()+"%");
		}
		if(null!=dict.getDictType()) {
			hql+=" and dictType like :type";
			map.put("type",  "%"+dict.getDictType()+"%");
		}
		System.out.println(dict);
		return (List<basDict>) this.executeQuery(hql, map, pageBean);
	}

	@Override
	public Object doGetType(basDict dict,String str) {
		String hql="select a."+str+" from basDict a where 1=1 ";
		Map<String, Object>map=new HashMap<String, Object>();
		if(null!=dict.getDictType()) {
			hql+="and a.dictType=:type ";
			map.put("type", dict.getDictType());
		}
		if(null!=dict.getDictValue()) {
			hql+="and a.dictValue=:value";
			map.put("value", dict.getDictValue());
		}
		Object obj = this.executeQuery(hql, map, null).get(0);
		return obj;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> listType() {
		String hql="select a.dictType from basDict a group by a.dictType";
		return (List<Object>) this.executeQuery(hql, null, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> listOther(basDict dict, String str) {
		// TODO Auto-generated method stub
		String hql="from basDict a where 1=1 ";
		Map<String, Object> map=new HashMap<String,Object>();
		if(null!=dict.getDictType()) {
			hql+="and a.dictType=:type ";
			map.put("type", dict.getDictType());
		}		
		
		return (List<Object>) this.executeQuery(hql, map, null);
	}

}
