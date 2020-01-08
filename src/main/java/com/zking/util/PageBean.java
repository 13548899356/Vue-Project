package com.zking.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageBean {

	private int page = 1;// 页码
	private int rows = 10;// 页大小
	private int total = -1;// 总记录数

	private boolean pagination = true;// 是否分页

	private String url;
	private Map<String, String[]> parameterMap;

	public PageBean() {
		super();
	}

	public void setRequest(HttpServletRequest req) {
		// 对系统的公共参数赋值
		String page = req.getParameter("page");
		String rows = req.getParameter("rows");
		String pagination = req.getParameter("pagination");
		this.setPage(page);
		this.setRows(rows);
		this.setPagination(pagination);

		this.url = req.getContextPath() + req.getServletPath();
		this.parameterMap = req.getParameterMap();
	}

	public String getUrl() {
		return url;
	}

	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}

	public boolean isPagination() {
		return pagination;
	}

	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}

	public void setPagination(String pagination) {
		if ("false".equals(pagination)) {
			this.pagination = false;
		}
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPage(String page) {
		if (null != page && !"".equals(page)) {
			this.page = Integer.valueOf(page);
		}
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public void setRows(String rows) {
		if (null != rows && !"".equals(rows)) {
			this.rows = Integer.valueOf(rows);
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTotal(String total) {
		this.total = Integer.valueOf(total);
	}

	/**
	 * 获得起始记录下标
	 * 
	 * @return
	 */
	public int getStartIndex() {
		return (page - 1) * rows;
	}

	/**
	 * 下一页
	 * 
	 * @return
	 */
	public int getNextPage() {
		int nextPage = this.page + 1;
		if (nextPage > getMaxPage()) {
			nextPage = getMaxPage();
		}
		return nextPage;
	}

	/**
	 * 上一页
	 * 
	 * @return
	 */
	public int getPreviousPage() {
		int previousPage = this.page - 1;
		if (previousPage == 0) {
			previousPage = 1;
		}
		return previousPage;
	}

	/**
	 * 最大页数
	 * 
	 * @return
	 */
	public int getMaxPage() {
		int maxPage = this.total / this.rows;
		if (total % rows != 0) {
			maxPage = maxPage + 1;
		}
		return maxPage;
	}

	@Override
	public String toString() {
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
	}

}
