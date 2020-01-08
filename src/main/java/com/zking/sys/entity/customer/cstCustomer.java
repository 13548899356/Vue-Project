package com.zking.sys.entity.customer;

import java.io.Serializable;

/**
 * @author TimeDip
 * 客户信息
 */
public class cstCustomer implements Serializable{

		private String custNo;//客户编号
		private String 	custName; //客户名称--
		private String custRegion; //地区--
		
		private Integer custManagerId;//客户经理编号--
		private String custManagetName;//客户经理姓名--
		private Integer custLevel;//客户级别--
		
		private String custLevelLabel;//客户级别标志--
		private Integer custSatisfy;//客户满意度--
		private Integer custCredit;//客户信用度--
		
		private String custAddr; //地址
		private String custZip;//邮政编码
		private String custTel;//电话--
		
		private String custFax;//传真
		private String custWebsite;//网站
		private String custLicenceNo;//营业执照
		
		private String custChieftain;//法人
		private float custBankroll;//注册资金
		private float custTurnover;//年营业额
		
		private String custBank;//开户银行
		private String custBankAccount;//银行账号
		private String custLocalTaxNo;//地税登记号
		
		private String custNationalTaxNo;//国税登记号
		private String custStatus;//客户状态	--
		public cstCustomer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getCustNo() {
			return custNo;
		}
		public void setCustNo(String custNo) {
			this.custNo = custNo;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustRegion() {
			return custRegion;
		}
		public void setCustRegion(String custRegion) {
			this.custRegion = custRegion;
		}
		public Integer getCustManagerId() {
			return custManagerId;
		}
		public void setCustManagerId(Integer custManagerId) {
			this.custManagerId = custManagerId;
		}
		public String getCustManagetName() {
			return custManagetName;
		}
		public void setCustManagetName(String custManagetName) {
			this.custManagetName = custManagetName;
		}
		public Integer getCustLevel() {
			return custLevel;
		}
		public void setCustLevel(Integer custLevel) {
			this.custLevel = custLevel;
		}
		public String getCustLevelLabel() {
			return custLevelLabel;
		}
		public void setCustLevelLabel(String custLevelLabel) {
			this.custLevelLabel = custLevelLabel;
		}
		public Integer getCustSatisfy() {
			return custSatisfy;
		}
		public void setCustSatisfy(Integer custSatisfy) {
			this.custSatisfy = custSatisfy;
		}
		public Integer getCustCredit() {
			return custCredit;
		}
		public void setCustCredit(Integer custCredit) {
			this.custCredit = custCredit;
		}
		public String getCustAddr() {
			return custAddr;
		}
		public void setCustAddr(String custAddr) {
			this.custAddr = custAddr;
		}
		public String getCustZip() {
			return custZip;
		}
		public void setCustZip(String custZip) {
			this.custZip = custZip;
		}
		public String getCustTel() {
			return custTel;
		}
		public void setCustTel(String custTel) {
			this.custTel = custTel;
		}
		public String getCustFax() {
			return custFax;
		}
		public void setCustFax(String custFax) {
			this.custFax = custFax;
		}
		public String getCustWebsite() {
			return custWebsite;
		}
		public void setCustWebsite(String custWebsite) {
			this.custWebsite = custWebsite;
		}
		public String getCustLicenceNo() {
			return custLicenceNo;
		}
		public void setCustLicenceNo(String custLicenceNo) {
			this.custLicenceNo = custLicenceNo;
		}
		public String getCustChieftain() {
			return custChieftain;
		}
		public void setCustChieftain(String custChieftain) {
			this.custChieftain = custChieftain;
		}
		public float getCustBankroll() {
			return custBankroll;
		}
		public void setCustBankroll(float custBankroll) {
			this.custBankroll = custBankroll;
		}
		public float getCustTurnover() {
			return custTurnover;
		}
		public void setCustTurnover(float custTurnover) {
			this.custTurnover = custTurnover;
		}
		public String getCustBank() {
			return custBank;
		}
		public void setCustBank(String custBank) {
			this.custBank = custBank;
		}
		public String getCustBankAccount() {
			return custBankAccount;
		}
		public void setCustBankAccount(String custBankAccount) {
			this.custBankAccount = custBankAccount;
		}
		public String getCustLocalTaxNo() {
			return custLocalTaxNo;
		}
		public void setCustLocalTaxNo(String custLocalTaxNo) {
			this.custLocalTaxNo = custLocalTaxNo;
		}
		public String getCustNationalTaxNo() {
			return custNationalTaxNo;
		}
		public void setCustNationalTaxNo(String custNationalTaxNo) {
			this.custNationalTaxNo = custNationalTaxNo;
		}
		public String getCustStatus() {
			return custStatus;
		}
		public void setCustStatus(String custStatus) {
			this.custStatus = custStatus;
		}
		@Override
		public String toString() {
			return "cstCustomer [custNo=" + custNo + ", custName=" + custName + ", custRegion=" + custRegion
					+ ", custManagerId=" + custManagerId + ", custManagetName=" + custManagetName + ", custLevel="
					+ custLevel + ", custLevelLabel=" + custLevelLabel + ", custSatisfy=" + custSatisfy
					+ ", custCredit=" + custCredit + ", custAddr=" + custAddr + ", custZip=" + custZip + ", custTel="
					+ custTel + ", custFax=" + custFax + ", custWebsite=" + custWebsite + ", custLicenceNo="
					+ custLicenceNo + ", custChieftain=" + custChieftain + ", custBankroll=" + custBankroll
					+ ", custTurnover=" + custTurnover + ", custBank=" + custBank + ", custBankAccount="
					+ custBankAccount + ", custLocalTaxNo=" + custLocalTaxNo + ", custNationalTaxNo="
					+ custNationalTaxNo + ", custStatus=" + custStatus + "]";
		}
		
		
	
	
	
	
	
	
	
	
	
}
