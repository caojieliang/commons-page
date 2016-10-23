package com.landian.commons.page;

import lombok.Data;


@Data
public class PageResult {
	private int pageIndex = 1;
	private int size = 10;
	private long total = 0l;

	public Integer getTotalPage() {
		int totalPage = (int) ((this.total + this.size - 1) / this.size);
		if (totalPage == 0) {
			totalPage = 1;
		}
		return totalPage;
	}
	public boolean isPageFirst(){
		if(pageIndex == 1){
			return true;
		}
		return false;
	}
	public boolean isPageEnd(){
		if(this.getTotalPage().equals(pageIndex)){
			return true;
		}
		return false;
	}
}
