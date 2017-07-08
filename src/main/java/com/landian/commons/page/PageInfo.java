package com.landian.commons.page;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo implements PageRequest{
	@ApiModelProperty(value = "第几页(默认1)")
	int page = 1;

	@ApiModelProperty(value = "分页大小(默认10)")
	int pageSize = 10;

	public static PageInfo newInstance(int page, int pageSize){
		return new PageInfo(page,pageSize);
	}

	public static PageInfo maxPageInfo(){
		return new PageInfo(1,Integer.MAX_VALUE);
	}

	@Override
	public int getPageIndex() {
		return page - 1;
	}
}
