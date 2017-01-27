package com.landian.commons.page;

import lombok.Data;

import java.io.Serializable;

@Data
@Deprecated
/**
 * @see PageRequestSupport
 */
public class PageSupportBak implements PageRequest , Serializable {
	private int pageIndex = 0;
	private int pageSize = 10;

	public static PageSupportBak maxPageSizePageSupport(){
		return new PageSupportBak(0,Integer.MAX_VALUE);
	}

	public PageSupportBak(){}

	public PageSupportBak(int pageIndex, int pageSize){
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public int getPageStart() {
		return pageIndex * pageSize; //起始分页位置
	}
}
