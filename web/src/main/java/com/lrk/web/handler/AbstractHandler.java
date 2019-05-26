package com.lrk.web.handler;

import com.lrk.web.dto.OrderDTO;

/**
 * @author lrk
 * @date 2019/5/26下午8:38
 */
public abstract class AbstractHandler {

    abstract public String handle(OrderDTO dto);
}
