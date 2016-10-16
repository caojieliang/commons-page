package com.landian.commons.page;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageSupport implements PageRequest , Serializable {
	private int pageIndex = 0;
	private int pageSize = 10;

	public static PageSupport maxPageSizePageSupport(){
		return new PageSupport(0,Integer.MAX_VALUE);
	}

	public PageSupport(){}

	public PageSupport(int pageIndex, int pageSize){
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public int getPageStart() {
		return pageIndex * pageSize; //起始分页位置
	}
}
