package com.zking.sys.entity.customer;

import java.io.Serializable;

/**
 * @author TimeDip
 *	订单明细
 */
public class OrderLine implements Serializable{

	
	private String oddId;//订单明细ID
	private String oddOrderId;//订单ID
	private String oddProdId;//产品ID
	
	private int oddCount;//数量
	private String oddUnit;//单位
	private float oddPrice;//价格
	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOddId() {
		return oddId;
	}
	public void setOddId(String oddId) {
		this.oddId = oddId;
	}
	public String getOddOrderId() {
		return oddOrderId;
	}
	public void setOddOrderId(String oddOrderId) {
		this.oddOrderId = oddOrderId;
	}
	public String getOddProdId() {
		return oddProdId;
	}
	public void setOddProdId(String oddProdId) {
		this.oddProdId = oddProdId;
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
	public float getOddPrice() {
		return oddPrice;
	}
	public void setOddPrice(float oddPrice) {
		this.oddPrice = oddPrice;
	}
	@Override
	public String toString() {
		return "OrdersLine [oddId=" + oddId + ", oddOrderId=" + oddOrderId + ", oddProdId=" + oddProdId + ", oddCount="
				+ oddCount + ", oddUnit=" + oddUnit + ", oddPrice=" + oddPrice + "]";
	}
	
	
	
	
	
	
	
	
	
}
