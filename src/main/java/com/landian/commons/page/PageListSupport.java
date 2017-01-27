package com.landian.commons.page;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class PageListSupport<T> extends PageRequestSupport implements IPageList<T>, Serializable{

	@Setter @Getter
	private long count = 0;
	@Setter @Getter
	private List<T> list;

	/**
	 * 历史遗留问题
	 */
	public void setCount(Long count) {
		this.count = count;
	}

}
