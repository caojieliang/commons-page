package com.landian.commons.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
