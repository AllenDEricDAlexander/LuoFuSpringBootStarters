package top.atluofu.middleware.whitelist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: DoWhiteList
 * @description: 自定义注解
 * @author: 有罗敷的马同学
 * @datetime: 2025Year-01Month-17Day-11:28
 * @Version: 1.0
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface DoWhiteList {
    String key() default "";

    String returnJson() default "";
}
