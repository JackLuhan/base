package cn.houyi.base.common.annotation;

import cn.houyi.base.common.enums.LogType;

import java.lang.annotation.*;

/**
 * 系统日志自定义注解
 * @author houyi
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})//作用于参数或方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {

        /**
         * 日志名称
         * @return
         */
        String description() default "";

        /**
         * 日志类型
         * @return
         */
        LogType type() default LogType.OPERATION;
}
