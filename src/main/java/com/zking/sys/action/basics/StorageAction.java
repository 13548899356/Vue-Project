package com.zking.sys.action.basics;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.basics.Storage;
import com.zking.sys.service.basics.IStorageService;
import com.zking.sys.service.impl.basics.storageServiceImpl;

public class StorageAction extends BaseAction implements ModelDriven<Storage> {

	private IStorageService storageService=new storageServiceImpl();;
	private Storage st=new Storage();
	
	public StorageAction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IStorageService getStorageService() {
		return storageService;
	}


	public void setStorageService(IStorageService storageService) {
		this.storageService = storageService;
	}


	@Override
	public Storage getModel() {
		// TODO Auto-generated method stub
		return st;
	}
	
	public String listStorage() {
		try {
			List<Storage> list = storageService.listStorage(st, null);
			super.toJSONObject(true, list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
