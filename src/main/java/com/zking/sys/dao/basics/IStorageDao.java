package com.zking.sys.dao.basics;

import java.util.List;

import com.zking.sys.entity.basics.Storage;
import com.zking.util.PageBean;

public interface IStorageDao {

	
	public void addStorage(Storage stoage);
	
	public List<Storage> listStorage(Storage sto,PageBean pageBean);
	
	
}
