package com.zking.sys.entity.customer;

import java.io.Serializable;

/**
 * @author TimeDip
 * 联系人类
 */
public class cstLinkman implements Serializable {

	private String lkmId;//联系人ID
	private String lkmCustNo;//客户编号
	private String lkmCustName;//客户名称
	
	private String lkmName;//联系人名字
	private String lkmSex;//性别
	private String lkmPostion;//职位
	
	private String lkmTel;//办公电话
	private String lkmMobile;//手机
	private String likMemo;//备注
	public cstLinkman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLkmId() {
		return lkmId;
	}
	public void setLkmId(String lkmId) {
		this.lkmId = lkmId;
	}
	public String getLkmCustNo() {
		return lkmCustNo;
	}
	public void setLkmCustNo(String lkmCustNo) {
		this.lkmCustNo = lkmCustNo;
	}
	public String getLkmCustName() {
		return lkmCustName;
	}
	public void setLkmCustName(String lkmCustName) {
		this.lkmCustName = lkmCustName;
	}
	public String getLkmName() {
		return lkmName;
	}
	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}
	public String getLkmSex() {
		return lkmSex;
	}
	public void setLkmSex(String lkmSex) {
		this.lkmSex = lkmSex;
	}
	public String getLkmPostion() {
		return lkmPostion;
	}
	public void setLkmPostion(String lkmPostion) {
		this.lkmPostion = lkmPostion;
	}
	public String getLkmTel() {
		return lkmTel;
	}
	public void setLkmTel(String lkmTel) {
		this.lkmTel = lkmTel;
	}
	public String getLkmMobile() {
		return lkmMobile;
	}
	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}
	public String getLikMemo() {
		return likMemo;
	}
	public void setLikMemo(String likMemo) {
		this.likMemo = likMemo;
	}
	@Override
	public String toString() {
		return "cstLinkman [lkmId=" + lkmId + ", lkmCustNo=" + lkmCustNo + ", lkmCustName=" + lkmCustName + ", lkmName="
				+ lkmName + ", lkmSex=" + lkmSex + ", lkmPostion=" + lkmPostion + ", lkmTel=" + lkmTel + ", lkmMobile="
				+ lkmMobile + ", likMemo=" + likMemo + "]";
	}
	
	
	
	
	
	
}
