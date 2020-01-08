package com.zking.sys.action.basics;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.zking.base.action.BaseAction;
import com.zking.sys.entity.basics.basDict;
import com.zking.sys.service.basics.IbasDictService;
import com.zking.util.PageBean;

public class basDictAction extends BaseAction implements ModelDriven<basDict> {

	private IbasDictService basDictService;
	private PageBean pageBean = new PageBean();
	private basDict bas = new basDict();

	public IbasDictService getBasDictService() {
		return basDictService;
	}

	public void setBasDictService(IbasDictService basDictService) {
		this.basDictService = basDictService;
	}

	public basDictAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public basDict getModel() {
		// TODO Auto-generated method stub
		return bas;
	}

	public String addBasDict() {
		try {
			basDictService.addBasDict(bas);
			super.toJsonMessage("数据字典添加成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("数据字典添加失败", false);
			e.printStackTrace();
		}
		
		
		return null;
	}

	public String delBasDict() {
		try {
			System.out.println(bas);
			basDictService.delBasDict(bas);
			super.toJsonMessage("删除成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("删除失败", false);
			e.printStackTrace();
		}
		return null;
	}

	public String editBasDict() {
		try {
			basDictService.editBasDict(bas);
			super.toJsonMessage("修改成功", true);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("修改失败", false);
			e.printStackTrace();
		}
		return null;
	}

	public String listBasDict() {
		try {
			pageBean.setRequest(request);
			List<basDict> listBasDict = basDictService.listBasDict(bas, pageBean);
			super.toJSONPager("ok", true, pageBean.getTotal(), listBasDict);
		} catch (Exception e) {
			super.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}

	public String doGetType() {
		try {
			
			Object type = basDictService.doGetType(bas,"dictItem");
			super.toJSONObject(true, type);
		} catch (Exception e) {
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String listType() {
		try {
			List<Object> listType = basDictService.listType();
			super.toJSONObject(true, listType);
		} catch (Exception e) {
			// TODO: handle exception
			super.toJsonMessage("", false);
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String listOther() {
		try {
			List<Object> list = basDictService.listOther(bas, "dictItem");	
			super.toJSONObject(true, list);
		} catch (Exception e) {
			super.toJSONObject(false, null);
			e.printStackTrace();
		}
		return null;
	}
	
}
