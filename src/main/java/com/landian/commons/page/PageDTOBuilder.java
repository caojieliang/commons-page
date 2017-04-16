package com.landian.commons.page;

import java.util.List;

public class PageDTOBuilder{

    public static <T> PageDTO<T> build(PageListSupport<T> pageListSupport){
        PageDTO pageDTO = new PageDTO<T>();
        Long longVal = pageListSupport.getCount();
        List<T> list = pageListSupport.getList();
        pageDTO.setTotal(longVal.intValue());
        pageDTO.setRows(list);
//        return PageDTO.builder().total(longVal.intValue()).rows(list).build();
        return pageDTO;
    }

    public static <T> PageDTO<T> build(long total, List<T> list){
        Long longVal = total;
        return build(longVal.intValue(),list);
    }

    public static <T> PageDTO<T> build(int total, List<T> list){
        PageDTO pageDTO = new PageDTO<T>();
        pageDTO.setTotal(total);
        pageDTO.setRows(list);
        return pageDTO;
    }
}
