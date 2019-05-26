package com.lrk.web.common;

import java.lang.annotation.*;

/**
 * @author lrk
 * @date 2019/5/26下午8:41
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();
}
