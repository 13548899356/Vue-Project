package com.zking.sys.entity.basics;

import java.io.Serializable;

/**
 * @author TimeDip
 *
 */
public class basDict implements Serializable{
	
	private static final long serialVersionUID = -7774501711316423164L;
	private String dictId;//编号
	private String dictType;//类型
	private String dictItem;//条目
	private String dictValue;//字典值
	private Integer dictIsEditable;//是否可编辑
	public basDict() {
		super();
		// TODO Auto-generated constructor stub
	}
	public basDict(String dictId, String dictType, String dictItem, String dictValue, Integer dictIsEditable) {
		super();
		this.dictId = dictId;
		this.dictType = dictType;
		this.dictItem = dictItem;
		this.dictValue = dictValue;
		this.dictIsEditable = dictIsEditable;
	}
	
	public String getDictId() {
		return dictId;
	}
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getDictType() {
		return dictType;
	}
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	public String getDictItem() {
		return dictItem;
	}
	public void setDictItem(String dictItem) {
		this.dictItem = dictItem;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public Integer getDictIsEditable() {
		return dictIsEditable;
	}
	public void setDictIsEditable(Integer dictIsEditable) {
		this.dictIsEditable = dictIsEditable;
	}
	@Override
	public String toString() {
		return "basDict [dictId=" + dictId + ", dictType=" + dictType + ", dictItem=" + dictItem + ", dictValue="
				+ dictValue + ", dictIsEditable=" + dictIsEditable + "]";
	}
	
	
	
}
