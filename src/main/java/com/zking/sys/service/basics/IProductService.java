package com.zking.sys.service.basics;

import java.util.List;

import com.zking.sys.entity.basics.Product;
import com.zking.util.PageBean;

public interface IProductService{

	/**
	 * @param 产品信息查询
	 * @return
	 */
	public List<Product> listProduct(Product product,PageBean pageBean);
	
	
	/**
	 * @return 将产品信息的型号种类进行分类后存入集合中
	 */
	public List<Object> listType(Product  product,String str);
	
	
	public List<Product> listOther(Product product,PageBean p);

}
