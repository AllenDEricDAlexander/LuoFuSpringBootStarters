package top.atluofu.middleware.hystrix.valve;

import org.aspectj.lang.ProceedingJoinPoint;
import top.atluofu.middleware.hystrix.annotation.DoHystrix;

import java.lang.reflect.Method;

/**
 * @BelongsProject: LuoFuSpringBootStarters
 * @BelongsPackage: top.atluofu.middleware.hystrix.valve
 * @ClassName: IValveService
 * @Author: atluofu
 * @CreateTime: 2025Year-06Month-17Day-11:10
 * @Description: 熔断服务接口
 * @Version: 1.0
 */
public interface IValveService {
    Object access(ProceedingJoinPoint jp, Method method, DoHystrix doHystrix, Object[] args) throws Throwable;
}
