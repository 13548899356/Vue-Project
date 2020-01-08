package com.zking.sys.service.impl.basics;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.basics.IStorageDao;
import com.zking.sys.dao.impl.basics.StorageDaoImpl;
import com.zking.sys.entity.basics.Storage;
import com.zking.sys.service.basics.IStorageService;
import com.zking.util.PageBean;

public class storageServiceImpl extends BaseService implements IStorageService {

	private IStorageDao storageDao=new StorageDaoImpl();
	
	
	
	public storageServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IStorageDao getStorageDao() {
		return storageDao;
	}

	public void setStorageDao(IStorageDao storageDao) {
		this.storageDao = storageDao;
	}

	@Override
	public void addStorage(Storage stoage) {
		// TODO Auto-generated method stub
		storageDao.addStorage(stoage);
	}

	@Override
	public List<Storage> listStorage(Storage sto, PageBean pageBean) {
		// TODO Auto-generated method stub
		return storageDao.listStorage(sto, pageBean);
	}

}
