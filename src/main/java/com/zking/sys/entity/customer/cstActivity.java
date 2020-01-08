package com.zking.sys.entity.customer;

import java.io.Serializable;
import java.sql.Timestamp;

public class cstActivity implements Serializable {

	private String atvId;//交往记录ID
	private String atvCustNo;//客户编号
	private String atvCustName;//客户姓名
	
	private Timestamp atvDate;//交往日期
	private String atvPlace;//交往地点
	private String atvTitle;//概要
	
	private String atvRemark;//备注
	private String atvDesc;//详情
	public cstActivity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAtvId() {
		return atvId;
	}
	public void setAtvId(String atvId) {
		this.atvId = atvId;
	}
	public String getAtvCustNo() {
		return atvCustNo;
	}
	public void setAtvCustNo(String atvCustNo) {
		this.atvCustNo = atvCustNo;
	}
	public String getAtvCustName() {
		return atvCustName;
	}
	public void setAtvCustName(String atvCustName) {
		this.atvCustName = atvCustName;
	}
	public Timestamp getAtvDate() {
		return atvDate;
	}
	public void setAtvDate(Timestamp atvDate) {
		this.atvDate = atvDate;
	}
	public String getAtvPlace() {
		return atvPlace;
	}
	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}
	public String getAtvTitle() {
		return atvTitle;
	}
	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}
	public String getAtvRemark() {
		return atvRemark;
	}
	public void setAtvRemark(String atvRemark) {
		this.atvRemark = atvRemark;
	}
	public String getAtvDesc() {
		return atvDesc;
	}
	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}
	@Override
	public String toString() {
		return "cstActivity [atvId=" + atvId + ", atvCustNo=" + atvCustNo + ", atvCustName=" + atvCustName
				+ ", atvDate=" + atvDate + ", atvPlace=" + atvPlace + ", atvTitle=" + atvTitle + ", atvRemark="
				+ atvRemark + ", atvDesc=" + atvDesc + "]";
	}
	
	
	
	
	
	
	
}
