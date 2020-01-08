package com.zking.sys.service.basics;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zking.sys.dao.basics.IStorageDao;
import com.zking.sys.dao.impl.basics.StorageDaoImpl;
import com.zking.sys.entity.basics.Storage;
import com.zking.sys.service.BaseTestCase;

public class IStorageServiceTest extends BaseTestCase {

	private IStorageService storageDao =null;
	private Storage st=null;
	
	@Before
	public void setUp() throws Exception {
		storageDao=(IStorageService) getBean("storageService");
		st=new Storage();
	}

	@Test
	public void testAddStorage() {
		for (int i = 0; i <8; i++) {
			st.setStkProdId("1234");
			st.setStkWarehouse("天津-恒源电子c库"+i+1);
			st.setStkWare("北2"+i+"位");
			st.setStkCount(i+3);
			st.setStkMemo("密码武器");
			storageDao.addStorage(st);
		}
		
		
	}

	@Test
	public void testListStorage() {
		List<Storage> listStorage = storageDao.listStorage(st, null);
		for (Storage s : listStorage) {
			System.out.println(s);
		}
		
	}

}
