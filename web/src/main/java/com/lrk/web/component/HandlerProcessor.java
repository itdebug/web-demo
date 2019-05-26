package com.lrk.web.component;

import com.google.common.collect.Maps;
import com.lrk.web.common.HandlerType;
import com.lrk.web.handler.HandlerContext;
import com.lrk.web.util.ClassScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lrk
 * @date 2019/5/26下午8:47
 */
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
        throws BeansException {
        Map<String, Class> handlerMap = Maps.newHashMapWithExpectedSize(3);
        ClassScanner.scan("com.lrk.web.handler", HandlerType.class).forEach(clazz -> {
            String type = clazz.getAnnotation(HandlerType.class).value();
            handlerMap.put(type, clazz);
        });

        HandlerContext handlerContext = new HandlerContext(handlerMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(), handlerContext);
    }
}
