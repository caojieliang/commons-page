package com.landian.commons.page;

public interface PageRequest {
	/**
	 * 从0开始
	 * @return
	 */
	int getPageIndex();
	int getPageSize();
}
