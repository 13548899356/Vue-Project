package com.zking.sys.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Module implements Serializable {

	private int id;
	private int pid;
	private String label;
	private String icon;
	private String url;
	private int sort;
	private List<Module> children = new ArrayList<>();

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public List<Module> getChildren() {
		return children;
	}

	public void setChildren(List<Module> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", pid=" + pid + ", label=" + label + ", icon=" + icon + ", url=" + url + ", sort="
				+ sort + ", children=" + children + "]";
	}

//	public Module(int id, int pid, String text, String icon, String url, int sort) {
//		super();
//		this.id = id;
//		this.pid = pid;
//		this.text = text;
//		this.icon = icon;
//		this.url = url;
//		this.sort = sort;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getPid() {
//		return pid;
//	}
//
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
//
//	public String getText() {
//		return text;
//	}
//
//	public void setText(String text) {
//		this.text = text;
//	}
//
//	public String getIcon() {
//		return icon;
//	}
//
//	public void setIcon(String icon) {
//		this.icon = icon;
//	}
//
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public int getSort() {
//		return sort;
//	}
//
//	public void setSort(int sort) {
//		this.sort = sort;
//	}
//
//
//
//	public List<Module> getChilden() {
//		return childen;
//	}
//
//	public void setChilden(List<Module> childen) {
//		this.childen = childen;
//	}
//
//	@Override
//	public String toString() {
//		return "Module [id=" + id + ", pid=" + pid + ", text=" + text + ", icon=" + icon + ", url=" + url + ", sort="
//				+ sort + ", childen=" + childen + "]";
//	}

}
