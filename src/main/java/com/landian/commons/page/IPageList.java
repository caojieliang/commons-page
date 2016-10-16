package com.landian.commons.page;

import java.util.List;

public interface IPageList<T> extends PageRequest{
	List<T> getList();

	void setList(List<T> list);
}
