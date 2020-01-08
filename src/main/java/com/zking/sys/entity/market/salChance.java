package com.zking.sys.entity.market;

import java.io.Serializable;

import java.sql.Timestamp;

/**
 * @author TimeDip
 *  营销机会
 */
public class salChance implements Serializable{
	
	private String chcId;//营销机会ID
	private String chcSource;//机会来源
	private String chcCustName;//客户名称
	
	private String chcTitle;//概要
	private Integer chcRate;//成功几率
	private String chcLinkman;//联系人
	
	private String chcTel;//联系人电话
	private String chcDesc;//机会描述
	private String chcCreateId;//创建人ID
	
	private String chcCreateBy;//创建人名字
	private Timestamp chcCreateDate;//创建日期时间
	private Integer chcDueId;//指派人ID
	
	private String chDueTo;//指派人名字
	private Timestamp chcDueDate;//指派日期
	private String chcStatus;//状态  0为已分配  1未分配
	public String getChcId() {
		return chcId;
	}
	public void setChcId(String chcId) {
		this.chcId = chcId;
	}
	public String getChcSource() {
		return chcSource;
	}
	public void setChcSource(String chcSource) {
		this.chcSource = chcSource;
	}
	public String getChcCustName() {
		return chcCustName;
	}
	public void setChcCustName(String chcCustName) {
		this.chcCustName = chcCustName;
	}
	public String getChcTitle() {
		return chcTitle;
	}
	public void setChcTitle(String chcTitle) {
		this.chcTitle = chcTitle;
	}
	public Integer getChcRate() {
		return chcRate;
	}
	public void setChcRate(Integer chcRate) {
		this.chcRate = chcRate;
	}
	public String getChcLinkman() {
		return chcLinkman;
	}
	public void setChcLinkman(String chcLinkman) {
		this.chcLinkman = chcLinkman;
	}
	public String getChcTel() {
		return chcTel;
	}
	public void setChcTel(String chcTel) {
		this.chcTel = chcTel;
	}
	public String getChcDesc() {
		return chcDesc;
	}
	public void setChcDesc(String chcDesc) {
		this.chcDesc = chcDesc;
	}
	public String getChcCreateId() {
		return chcCreateId;
	}
	public void setChcCreateId(String chcCreateId) {
		this.chcCreateId = chcCreateId;
	}
	public String getChcCreateBy() {
		return chcCreateBy;
	}
	public void setChcCreateBy(String chcCreateBy) {
		this.chcCreateBy = chcCreateBy;
	}
	public Timestamp getChcCreateDate() {
		return chcCreateDate;
	}
	public void setChcCreateDate(Timestamp chcCreateDate) {
		this.chcCreateDate = chcCreateDate;
	}
	public Integer getChcDueId() {
		return chcDueId;
	}
	public void setChcDueId(Integer chcDueId) {
		this.chcDueId = chcDueId;
	}
	public String getChDueTo() {
		return chDueTo;
	}
	public void setChDueTo(String chDueTo) {
		this.chDueTo = chDueTo;
	}
	public Timestamp getChcDueDate() {
		return chcDueDate;
	}
	public void setChcDueDate(Timestamp chcDueDate) {
		this.chcDueDate = chcDueDate;
	}
	public String getChcStatus() {
		return chcStatus;
	}
	public void setChcStatus(String chcStatus) {
		this.chcStatus = chcStatus;
	}
	@Override
	public String toString() {
		return "salChance [chcId=" + chcId + ", chcSource=" + chcSource + ", chcCustName=" + chcCustName + ", chcTitle="
				+ chcTitle + ", chcRate=" + chcRate + ", chcLinkman=" + chcLinkman + ", chcTel=" + chcTel + ", chcDesc="
				+ chcDesc + ", chcCreateId=" + chcCreateId + ", chcCreateBy=" + chcCreateBy + ", chcCreateDate="
				+ chcCreateDate + ", chcDueId=" + chcDueId + ", chDueTo=" + chDueTo + ", chcDueDate=" + chcDueDate
				+ ", chcStatus=" + chcStatus + "]";
	}

	
	
	
	
}
