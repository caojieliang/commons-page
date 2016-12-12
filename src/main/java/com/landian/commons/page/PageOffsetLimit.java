package com.landian.commons.page;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageOffsetLimit implements PageRequest , Serializable {
	private int offset = 0;
	private int limit = 10;

	public static PageOffsetLimit maxPageOffsetLimit(){
		return new PageOffsetLimit(0,Integer.MAX_VALUE);
	}

	public PageOffsetLimit(){}

	public PageOffsetLimit(int offset, int limit){
		this.offset = offset;
		this.limit = limit;
	}

	public int getPageStart() {
		return offset; //起始分页位置
	}

	@Override
	public int getPageIndex() {
		return offset/limit;
	}

	@Override
	public int getPageSize() {
		return limit;
	}
}
