package com.zking.sys.entity.customer;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author TimeDip
 * 订单类
 */
public class Orders implements Serializable {

	private String odrId;//订单编号
	private String odrCustmoer;//客户名称
	private Timestamp odrDate;//下单日期
	
	private String odrAddr;//送货地址
	private String odrStatus;//订单状态
	private String odrCustomerNo;//客户编号
	
	private cstCustomer customer;//客户信息
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOdrId() {
		return odrId;
	}
	public void setOdrId(String odrId) {
		this.odrId = odrId;
	}
	public String getOdrCustmoer() {
		return odrCustmoer;
	}
	public void setOdrCustmoer(String odrCustmoer) {
		this.odrCustmoer = odrCustmoer;
	}
	public Timestamp getOdrDate() {
		return odrDate;
	}
	public void setOdrDate(Timestamp odrDate) {
		this.odrDate = odrDate;
	}
	public String getOdrAddr() {
		return odrAddr;
	}
	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}
	public String getOdrStatus() {
		return odrStatus;
	}
	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}
	
	public String getOdrCustomerNo() {
		return odrCustomerNo;
	}
	public void setOdrCustomerNo(String odrCustomerNo) {
		this.odrCustomerNo = odrCustomerNo;
	}
	
	
	public cstCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(cstCustomer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Orders [odrId=" + odrId + ", odrCustmoer=" + odrCustmoer + ", odrDate=" + odrDate + ", odrAddr="
				+ odrAddr + ", odrStatus=" + odrStatus + ", odrCustomerNo=" + odrCustomerNo + ", customer=" + customer
				+ "]";
	}
	
	
	
	
	
	
}
