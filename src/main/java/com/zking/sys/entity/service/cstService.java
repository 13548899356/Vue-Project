package com.zking.sys.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 客户服务实体类
 * @author Administrator
 *
 */
public class cstService implements Serializable{
	private static final long serialVersionUID = 1L;
/*	svr_id			VARCHAR(40)NOT NULL PRIMARY KEY  COMMENT '服务ID',
	svr_type		VARCHAR(20)NOT NULL COMMENT '服务类型',//由数据字典维护
	svr_title		VARCHAR(500)NOT NULL COMMENT '概要',
	svr_cust_no		CHAR(17) COMMENT '客户编号',
	svr_cust_name	VARCHAR(100)NOT NULL COMMENT '客户名字',
	svr_status	    VARCHAR (10)NOT NULL DEFAULT '新创建' COMMENT '服务状态',  //默认新创建 svr_status 新创建，已分配，已处理，已归档
	svr_request		VARCHAR(3000)NOT NULL COMMENT '服务请求',
	svr_create_id	VARCHAR(40) NOT NULL COMMENT '创建人ID',
	svr_create_by	VARCHAR(50)NOT NULL COMMENT '创建人姓名',
	svr_create_date	DATETIME NOT NULL COMMENT '创建日期时间', //默认系统当前时间
	svr_due_id		VARCHAR(40) COMMENT '分配人ID',
	svr_due_to		VARCHAR(50)COMMENT '分配人名字',
	svr_due_date	DATETIME COMMENT '指派日期时间',
	svr_deal	  	VARCHAR(3000)COMMENT '服务处理',
	svr_deal_id		VARCHAR(40) COMMENT '处理人ID',
	svr_deal_by		VARCHAR(50)COMMENT '处理人名字',
	svr_deal_date	DATETIME COMMENT '处理日期',
	svr_result  	VARCHAR(500)COMMENT '处理结果',
	svr_satisfy	INT COMMENT '满意度'*/
	
	private String svrId;//服务ID
	private String svrType;//服务类型
	private String svrTitle;//概要
	private String svrCustNo;//客户编号
	
	private String svrCustName;//客户名字
	private String svrStatus;//服务状态
	private String svrRequest;//服务请求
	private String svrCreateId;//创建人ID
	
	private String svrCreateBy;//创建人姓名
	private String svrCreateDate;//创建日期时间
	private String svrDueId;//派给人ID
	private String svrDueTo;//派给人名字
	
	private String svrDueDate;//指派日期时间
	private String svrDeal;//服务处理方法
	private String svrDealId;//处理人ID
	private String svrDealBy;//处理人名字
	
	private String svrDealDate;//处理日期
	private String svrResult;//处理结果
	private Integer svrSatisfy;//满意度
	
	
	
	public cstService() {
		super();
	}



	public cstService(String svrId, String svrType, String svrTitle, String svrCustNo, String svrCustName,
			String svrStatus, String svrRequest, String svrCreateId, String svrCreateBy, String svrCreateDate,
			String svrDueId, String svrDueTo, String svrDueDate, String svrDeal, String svrDealId, String svrDealBy,
			String svrDealDate, String svrResult, Integer svrSatisfy) {
		super();
		this.svrId = svrId;
		this.svrType = svrType;
		this.svrTitle = svrTitle;
		this.svrCustNo = svrCustNo;
		this.svrCustName = svrCustName;
		this.svrStatus = svrStatus;
		this.svrRequest = svrRequest;
		this.svrCreateId = svrCreateId;
		this.svrCreateBy = svrCreateBy;
		this.svrCreateDate = svrCreateDate;
		this.svrDueId = svrDueId;
		this.svrDueTo = svrDueTo;
		this.svrDueDate = svrDueDate;
		this.svrDeal = svrDeal;
		this.svrDealId = svrDealId;
		this.svrDealBy = svrDealBy;
		this.svrDealDate = svrDealDate;
		this.svrResult = svrResult;
		this.svrSatisfy = svrSatisfy;
	}



	public String getSvrId() {
		return svrId;
	}



	public void setSvrId(String svrId) {
		this.svrId = svrId;
	}



	public String getSvrType() {
		return svrType;
	}



	public void setSvrType(String svrType) {
		this.svrType = svrType;
	}



	public String getSvrTitle() {
		return svrTitle;
	}



	public void setSvrTitle(String svrTitle) {
		this.svrTitle = svrTitle;
	}



	public String getSvrCustNo() {
		return svrCustNo;
	}



	public void setSvrCustNo(String svrCustNo) {
		this.svrCustNo = svrCustNo;
	}



	public String getSvrCustName() {
		return svrCustName;
	}



	public void setSvrCustName(String svrCustName) {
		this.svrCustName = svrCustName;
	}



	public String getSvrStatus() {
		return svrStatus;
	}



	public void setSvrStatus(String svrStatus) {
		this.svrStatus = svrStatus;
	}



	public String getSvrRequest() {
		return svrRequest;
	}



	public void setSvrRequest(String svrRequest) {
		this.svrRequest = svrRequest;
	}



	public String getSvrCreateId() {
		return svrCreateId;
	}



	public void setSvrCreateId(String svrCreateId) {
		this.svrCreateId = svrCreateId;
	}



	public String getSvrCreateBy() {
		return svrCreateBy;
	}



	public void setSvrCreateBy(String svrCreateBy) {
		this.svrCreateBy = svrCreateBy;
	}



	public String getSvrCreateDate() {
		return svrCreateDate;
	}



	public void setSvrCreateDate(String svrCreateDate) {
		this.svrCreateDate = svrCreateDate;
	}



	public String getSvrDueId() {
		return svrDueId;
	}



	public void setSvrDueId(String svrDueId) {
		this.svrDueId = svrDueId;
	}



	public String getSvrDueTo() {
		return svrDueTo;
	}



	public void setSvrDueTo(String svrDueTo) {
		this.svrDueTo = svrDueTo;
	}



	public String getSvrDueDate() {
		return svrDueDate;
	}



	public void setSvrDueDate(String svrDueDate) {
		this.svrDueDate = svrDueDate;
	}



	public String getSvrDeal() {
		return svrDeal;
	}



	public void setSvrDeal(String svrDeal) {
		this.svrDeal = svrDeal;
	}



	public String getSvrDealId() {
		return svrDealId;
	}



	public void setSvrDealId(String svrDealId) {
		this.svrDealId = svrDealId;
	}



	public String getSvrDealBy() {
		return svrDealBy;
	}



	public void setSvrDealBy(String svrDealBy) {
		this.svrDealBy = svrDealBy;
	}



	public String getSvrDealDate() {
		return svrDealDate;
	}



	public void setSvrDealDate(String svrDealDate) {
		this.svrDealDate = svrDealDate;
	}



	public String getSvrResult() {
		return svrResult;
	}



	public void setSvrResult(String svrResult) {
		this.svrResult = svrResult;
	}



	public Integer getSvrSatisfy() {
		return svrSatisfy;
	}



	public void setSvrSatisfy(Integer svrSatisfy) {
		this.svrSatisfy = svrSatisfy;
	}



	@Override
	public String toString() {
		return "cstService [svrId=" + svrId + ", svrType=" + svrType + ", svrTitle=" + svrTitle + ", svrCustNo="
				+ svrCustNo + ", svrCustName=" + svrCustName + ", svrStatus=" + svrStatus + ", svrRequest=" + svrRequest
				+ ", svrCreateId=" + svrCreateId + ", svrCreateBy=" + svrCreateBy + ", svrCreateDate=" + svrCreateDate
				+ ", svrDueId=" + svrDueId + ", svrDueTo=" + svrDueTo + ", svrDueDate=" + svrDueDate + ", svrDeal="
				+ svrDeal + ", svrDealId=" + svrDealId + ", svrDealBy=" + svrDealBy + ", svrDealDate=" + svrDealDate
				+ ", svrResult=" + svrResult + ", svrSatisfy=" + svrSatisfy + "]";
	}




	
}
