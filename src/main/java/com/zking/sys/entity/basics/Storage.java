package com.zking.sys.entity.basics;

import java.io.Serializable;

public class Storage implements Serializable{

	
	private String stkId;//库存Id	
	private String stkProdId;//产品Id
	private String stkWarehouse;//仓库
	
	private String stkWare;//货位
	private int stkCount;//件数
	private String stkMemo;//备注
	
	private String prodName;//产品名称
	public Storage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStkId() {
		return stkId;
	}
	public void setStkId(String stkId) {
		this.stkId = stkId;
	}
	public String getStkProdId() {
		return stkProdId;
	}
	public void setStkProdId(String stkProdId) {
		this.stkProdId = stkProdId;
	}
	public String getStkWarehouse() {
		return stkWarehouse;
	}
	public void setStkWarehouse(String stkWarehouse) {
		this.stkWarehouse = stkWarehouse;
	}
	public String getStkWare() {
		return stkWare;
	}
	public void setStkWare(String stkWare) {
		this.stkWare = stkWare;
	}
	public int getStkCount() {
		return stkCount;
	}
	public void setStkCount(int stkCount) {
		this.stkCount = stkCount;
	}
	public String getStkMemo() {
		return stkMemo;
	}
	public void setStkMemo(String stkMemo) {
		this.stkMemo = stkMemo;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "Storage [stkId=" + stkId + ", stkProdId=" + stkProdId + ", stkWarehouse=" + stkWarehouse + ", stkWare="
				+ stkWare + ", stkCount=" + stkCount + ", stkMemo=" + stkMemo + ", prodName=" + prodName + "]";
	}
	
	
	
	
}
