package top.atluofu.middleware.hystrix;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import top.atluofu.middleware.hystrix.annotation.DoHystrix;
import top.atluofu.middleware.hystrix.valve.IValveService;
import top.atluofu.middleware.hystrix.valve.impl.HystrixValveImpl;

import java.lang.reflect.Method;

/**
 * @BelongsProject: LuoFuSpringBootStarters
 * @BelongsPackage: top.atluofu.middleware.hystrix
 * @ClassName: DoHystrixPoint
 * @Author: atluofu
 * @CreateTime: 2025Year-06Month-17Day-11:07
 * @Description: 服务治理，超时熔断
 * @Version: 1.0
 */
public class DoHystrixPoint {

    @Pointcut("@annotation(top.atluofu.middleware.hystrix.annotation.DoHystrix)")
    public void aopPoint() {
    }

    @Around("aopPoint() && @annotation(doGovern)")
    public Object doRouter(ProceedingJoinPoint jp, DoHystrix doGovern) throws Throwable {
        IValveService valveService = new HystrixValveImpl();
        return valveService.access(jp, getMethod(jp), doGovern, jp.getArgs());
    }

    private Method getMethod(JoinPoint jp) throws NoSuchMethodException {
        Signature sig = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) sig;
        return jp.getTarget().getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
    }


}