package com.zking.sys.service.impl.basics;

import java.util.List;

import com.zking.base.service.BaseService;
import com.zking.sys.dao.basics.IProductDao;
import com.zking.sys.entity.basics.Product;
import com.zking.sys.service.basics.IProductService;
import com.zking.util.PageBean;

public class ProductServiceImpl extends BaseService implements IProductService {

	private IProductDao productDao;
	
	
	public IProductDao getProductDao() {
		return productDao;
	}


	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}


	public ProductServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public List listProduct(Product product,PageBean pageBean) {
		// TODO Auto-generated method stub
		return productDao.listProduct(product,pageBean);
	}


	@Override
	public List<Object> listType(Product product, String str) {
		// TODO Auto-generated method stub
		return productDao.listType(product, str);
	}


	@Override
	public List<Product> listOther(Product product, PageBean p) {
		// TODO Auto-generated method stub
		return productDao.listOther(product, p);
	}

}
