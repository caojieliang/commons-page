package com.landian.commons.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "PageOffsetLimit", description = "PageOffsetLimit")
public class PageOffsetLimit implements PageRequest , Serializable {
	@ApiModelProperty(value = "分页起始游标(由0开始)", required = true)
	private int offset = 0;
	@ApiModelProperty(value = "分页大小", required = true)
	private int limit = 10;

	public static PageOffsetLimit newInstance(int offset, int limit){
		return new PageOffsetLimit(offset,limit);
	}

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
