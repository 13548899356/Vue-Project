package com.zking.sys.action.basics;

import java.util.List; 

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.basics.Product;
import com.zking.sys.service.basics.IProductService;
import com.zking.util.PageBean;

public class ProductAction extends BaseAction implements ModelDriven<Product>{

	private Product product=new Product();
	private IProductService productService;
	private PageBean pageBean=new PageBean();
	
	
	public ProductAction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IProductService getProductService() {
		return productService;
	}


	public void setProductService(IProductService productService) {
		this.productService = productService;
	}


	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	public String listProduct() {
		try {
			pageBean.setRequest(request);
			List<Product> list = productService.listProduct(product,pageBean);
			System.out.println(list);
			super.toJSONPager("ok", true, pageBean.getTotal(), list);
		} catch (Exception e) {
			super.toJsonMessage(null, false);
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	public String listType() {
		try {
			List<Object> type = productService.listType(product, "prodName");
			super.toJSONObject(true, type);
		} catch (Exception e) {
			super.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	public String listOther() {
		try {
			List<Product> list = productService.listOther(product, null);
			super.toJSONObject(true, list);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
	
}
