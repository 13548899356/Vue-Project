package com.zking.sys.entity.market;

import java.sql.Timestamp;

/**
 * @author zking
 * 营销计划表
 *
 */
public class salPlan {
	private String plaId;//计划Id
	private String plachcId;//营销机会ID
	private Timestamp plaDate;//计划执行日期
	private String plaTodo;//计划内容
	private String plaResult;//计划执行结果
	public String getPlaId() {
		return plaId;
	}
	public void setPlaId(String plaId) {
		this.plaId = plaId;
	}
	public String getPlachcId() {
		return plachcId;
	}
	public void setPlachcId(String plachcId) {
		this.plachcId = plachcId;
	}
	public String getPlaTodo() {
		return plaTodo;
	}
	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}
	public String getPlaResult() {
		return plaResult;
	}
	public void setPlaResult(String plaResult) {
		this.plaResult = plaResult;
	}
	public Timestamp getPlaDate() {
		return plaDate;
	}
	public void setPlaDate(Timestamp plaDate) {
		this.plaDate = plaDate;
	}
	@Override
	public String toString() {
		return "salPlan [plaId=" + plaId + ", plachcId=" + plachcId + ", plaDate=" + plaDate + ", plaTodo=" + plaTodo
				+ ", plaResult=" + plaResult + "]";
	}
	
	

}
