package com.zking.sys.service.basics;

import java.util.List;

import com.zking.sys.entity.basics.Storage;
import com.zking.util.PageBean;

public interface IStorageService {

	public void addStorage(Storage stoage);
	
	public List<Storage> listStorage(Storage sto,PageBean pageBean);
	
}
