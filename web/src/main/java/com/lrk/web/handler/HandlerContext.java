package com.lrk.web.handler;

import com.lrk.web.util.BeanUtil;

import java.util.Map;

/**
 * @author lrk
 * @date 2019/5/26下午8:52
 */
public class HandlerContext {

    private Map<String, Class> handlerMap;


    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {

        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) BeanUtil.getBean(clazz);
    }
}
