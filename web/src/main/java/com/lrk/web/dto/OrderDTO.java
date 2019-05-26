package com.lrk.web.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lrk
 * @date 2019/5/26下午8:35
 */
@Data
public class OrderDTO {

    private String code;

    private BigDecimal price;

    /**
     * 订单类型
     *
     * @author lrk
     * @date 2019/5/26 下午8:36
     */
    private String type;
}
