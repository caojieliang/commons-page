package com.landian.commons.page;



import java.util.ArrayList;
import java.util.List;

public class PageListSupportBuilder{


	public static PageListSupport build(List dataList, PageRequest page, long count){
		PageListSupport pageListSupport = new PageListSupport();
		pageListSupport.setList(dataList);
		pageListSupport.setPageSize(page.getPageSize());
		pageListSupport.setCount(count);
		pageListSupport.setPageIndex(page.getPageIndex());
		return pageListSupport;
	}

	/**
	 * 假分页处理(有开源就用开源工具)
	 * @param beanList 快照明细
	 * @param pageRequest 分页上下文
	 */
	public static<T> PageListSupport fakePageListSupport(List<T> beanList, PageRequest pageRequest){
		PageListSupport pageListSupport = new PageListSupport();
		pageListSupport.setPageIndex(pageRequest.getPageIndex());
		pageListSupport.setPageSize(pageRequest.getPageSize());
		Long count = 0l;
		List<T> dataList = new ArrayList<T>();
		if(null != beanList && beanList.size() > 0){
			Integer size = beanList.size();
			count = size.longValue();
			int start = pageListSupport.getPageStart();
			int pageLastIndex = start + pageRequest.getPageSize();
			for(int i = start; i<size && i< pageLastIndex; i++){
				dataList.add(beanList.get(i));
			}
		}
		pageListSupport.setCount(count);
		pageListSupport.setList(dataList);
		return pageListSupport;
	}
}
