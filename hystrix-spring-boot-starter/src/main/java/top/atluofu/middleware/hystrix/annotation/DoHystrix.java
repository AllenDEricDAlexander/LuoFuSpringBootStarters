package top.atluofu.middleware.hystrix.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: LuoFuSpringBootStarters
 * @BelongsPackage: top.atluofu.middleware.hystrix.annotation
 * @ClassName: DoHystrix
 * @Author: atluofu
 * @CreateTime: 2025Year-06Month-17Day-11:11
 * @Description: TODO
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoHystrix {

    // 失败结果 JSON
    String returnJson() default "";

    // 超时熔断
    int timeoutValue() default 0;
}
