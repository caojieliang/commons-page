package com.landian.commons.page;

import java.io.Serializable;
import java.util.List;

public class PageListSupport<T> extends PageSupport implements IPageList<T>, Serializable{
	private long count = 0;
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public long getCount(){
		return count;
	}
}
