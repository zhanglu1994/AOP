package com.zhangl.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangl on 2018/10/29.
    切点注解
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //RUNTIME 运行时 xUtils；CLASS 编译时注解 ButterKnife
public @interface CheckNet {



}
