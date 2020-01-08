package com.zking.sys.entity.customer;

import java.io.Serializable;
import java.sql.Timestamp;

public class cstLost implements Serializable{

	private String lstId;//客户流失ID
	private String lstCustNo;//客户编号
	private String lstCustName;//客户名称
	
	private String lstCustManagerId;//客户经理ID
	private String lstCustManagerName;//客户经理名称
	private Timestamp lstLastOrderDate;//上次下单时间
	
	private Timestamp lstLostDate;//流失时间
	private String lstDelay;//暂缓措施
	private String lstReason;//流失原因
	
	private String lstStatus;//状态

	public cstLost() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLstId() {
		return lstId;
	}

	public void setLstId(String lstId) {
		this.lstId = lstId;
	}

	public String getLstCustNo() {
		return lstCustNo;
	}

	public void setLstCustNo(String lstCustNo) {
		this.lstCustNo = lstCustNo;
	}

	public String getLstCustName() {
		return lstCustName;
	}

	public void setLstCustName(String lstCustName) {
		this.lstCustName = lstCustName;
	}

	public String getLstCustManagerId() {
		return lstCustManagerId;
	}

	public void setLstCustManagerId(String lstCustManagerId) {
		this.lstCustManagerId = lstCustManagerId;
	}

	public String getLstCustManagerName() {
		return lstCustManagerName;
	}

	public void setLstCustManagerName(String lstCustManagerName) {
		this.lstCustManagerName = lstCustManagerName;
	}

	public Timestamp getLstLastOrderDate() {
		return lstLastOrderDate;
	}

	public void setLstLastOrderDate(Timestamp lstLastOrderDate) {
		this.lstLastOrderDate = lstLastOrderDate;
	}

	public Timestamp getLstLostDate() {
		return lstLostDate;
	}

	public void setLstLostDate(Timestamp lstLostDate) {
		this.lstLostDate = lstLostDate;
	}

	public String getLstDelay() {
		return lstDelay;
	}

	public void setLstDelay(String lstDelay) {
		this.lstDelay = lstDelay;
	}

	public String getLstReason() {
		return lstReason;
	}

	public void setLstReason(String lstReason) {
		this.lstReason = lstReason;
	}

	public String getLstStatus() {
		return lstStatus;
	}

	public void setLstStatus(String lstStatus) {
		this.lstStatus = lstStatus;
	}

	@Override
	public String toString() {
		return "cstLost [lstId=" + lstId + ", lstCustNo=" + lstCustNo + ", lstCustName=" + lstCustName
				+ ", lstCustManagerId=" + lstCustManagerId + ", lstCustManagerName=" + lstCustManagerName
				+ ", lstLastOrderDate=" + lstLastOrderDate + ", lstLostDate=" + lstLostDate + ", lstDelay=" + lstDelay
				+ ", lstReason=" + lstReason + ", lstStatus=" + lstStatus + "]";
	}
	
	
	
	
	
	
	
	
	
}
