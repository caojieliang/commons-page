package com.landian.commons.page;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageRequestSupport implements PageRequest , Serializable {
	private int pageIndex = 0;
	private int pageSize = 10;

	public static PageRequestSupport maxPageSizePageSupport(){
		return new PageRequestSupport(0,Integer.MAX_VALUE);
	}

	public PageRequestSupport(){}

	public PageRequestSupport(int pageIndex, int pageSize){
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public int getPageStart() {
		return pageIndex * pageSize; //起始分页位置
	}
}
