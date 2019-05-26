package com.lrk.web.controller;

import com.lrk.web.dto.OrderDTO;
import com.lrk.web.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lrk
 * @date 2019/5/26下午8:57
 */
@Controller
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/handle")
    @ResponseBody
    public String handle(OrderDTO dto) {
        return orderService.handle(dto);
    }
}
