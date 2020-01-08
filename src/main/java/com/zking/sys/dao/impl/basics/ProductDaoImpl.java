package com.zking.sys.dao.impl.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zking.base.dao.BaseDAO;
import com.zking.sys.dao.basics.IProductDao;
import com.zking.sys.entity.basics.Product;
import com.zking.util.PageBean;

public class ProductDaoImpl extends BaseDAO implements IProductDao {

	public ProductDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	
	public List<Product> listProduct(Product product,PageBean pageBean) {
		// TODO Auto-generated method stub
		String hql="from Product a where 1=1";
		Map<String, Object> map=new HashMap<String,Object>();
		if(product.getProdName().length()!=0) {
			hql+="  and a.prodName like :name";
			map.put("name","%"+product.getProdName()+"%");
		}
		if(product.getProdType().length()!=0) {
			hql+=" and a.prodType =:type";
			map.put("type", product.getProdType());
		}
		if(product.getProdBatch().length()!=0) {
			hql+=" and a.prodBatch =:batch";
			map.put("batch", product.getProdBatch());
		}
		
		
		return (List<Product>) super.executeQuery(hql, map, null);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Object> listType(Product product, String str) {
		// TODO Auto-generated method stub
		String hql="select a."+str+" from Product a group by "+str+"";
		return (List<Object>) this.executeQuery(hql, null, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listOther(Product product, PageBean p) {
//		String hql="from Product a where 1=1";
//		Map<String, Object> map=new HashMap<String,Object>();
//		if(null!=product.getProdId()) {
//			hql+=" and a.prodId =:id";
//			map.put("id", product.getProdId());
//		}
		String hql="from Product a where a.prodId in(" + 
				"select ol.oddProdId from Orders o,OrderLine ol where o.odrId=ol.oddOrderId and o.odrId="+product.getProdId()+")";
		
//		String hql="select Product,OrderLine from Product a ,OrderLine b where a.prodId in(" + 
//				"select ol.oddProdId from Orders o,OrderLine ol where o.odrId=ol.oddOrderId and o.odrId=1234 )" + 
//				"and a.prodId=b.oddProdId";
		
		
		return (List<Product>) super.executeQuery(hql, null, null);
	}

}
