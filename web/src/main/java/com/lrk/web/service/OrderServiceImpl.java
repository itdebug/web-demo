package com.lrk.web.service;

import com.lrk.web.dto.OrderDTO;
import com.lrk.web.handler.AbstractHandler;
import com.lrk.web.handler.HandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lrk
 * @date 2019/5/26下午8:37
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler abstractHandler = handlerContext.getInstance(dto.getType());
        return abstractHandler.handle(dto);
    }
}
