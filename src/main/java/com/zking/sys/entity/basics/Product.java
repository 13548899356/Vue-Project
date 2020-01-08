package com.zking.sys.entity.basics;

import java.io.Serializable;

import com.zking.sys.entity.customer.Orders;
import com.zking.sys.service.customer.IOrderLineService;

public class Product implements Serializable {

	private String prodId;//产品ID
	private String prodName;//名称
	private String prodType;//型号
	
	private String prodBatch;//等级
	private String prodUtil;//单位
	private float prodPrice;//单价
	
	private String prodMemo;//备注
	private int oddCount;
	private String oddUnit;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdBatch() {
		return prodBatch;
	}

	public void setProdBatch(String prodBatch) {
		this.prodBatch = prodBatch;
	}

	public String getProdUtil() {
		return prodUtil;
	}

	public void setProdUtil(String prodUtil) {
		this.prodUtil = prodUtil;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdMemo() {
		return prodMemo;
	}

	public void setProdMemo(String prodMemo) {
		this.prodMemo = prodMemo;
	}

	public int getOddCount() {
		return oddCount;
	}

	public void setOddCount(int oddCount) {
		this.oddCount = oddCount;
	}

	public String getOddUnit() {
		return oddUnit;
	}

	public void setOddUnit(String oddUnit) {
		this.oddUnit = oddUnit;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodType=" + prodType + ", prodBatch="
				+ prodBatch + ", prodUtil=" + prodUtil + ", prodPrice=" + prodPrice + ", prodMemo=" + prodMemo
				+ ", oddCount=" + oddCount + ", oddUnit=" + oddUnit + "]";
	}
	
	
	
	
	
}
