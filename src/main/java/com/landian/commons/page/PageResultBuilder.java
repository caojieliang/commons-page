package com.landian.commons.page;

public class PageResultBuilder {

	public static PageResult build(PageRequest pageRequest,long total){
		PageResult pageResult = new PageResult();
		pageResult.setPageIndex(pageRequest.getPageIndex());
		pageResult.setSize(pageRequest.getPageSize());
		pageResult.setTotal(total);
		return pageResult;
	}

}
