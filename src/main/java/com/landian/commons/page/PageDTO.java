package com.landian.commons.page;

import lombok.Data;

import java.util.List;

@Data
public class PageDTO<T> {
    /**
     *
     */
    private int total = 0;
    /**
     *
     */
    private List<T> rows;


}
