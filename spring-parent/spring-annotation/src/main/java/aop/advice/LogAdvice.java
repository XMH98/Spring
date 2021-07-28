package aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author: 徐明皓
 * Date: 2021-05-12 17:50
 * Description: <描述>
 */
@Component
@Aspect//表示这是一个切面
public class LogAdvice {

    //定义切点表达式
    @Pointcut("execution(* aop.service.impl.*ServiceImpl.*(..))")
    public void pc(){}

    @Pointcut("execution(* aop.service.impl.*.*(..))")
    public void pc2(){}

    //前置通知
    @Before("pc()")//后面的小括号不能省略
    public void before(JoinPoint joinPoint){
        System.out.println("LogAdvice,name"+joinPoint.getSignature().getName()+",args:"+joinPoint.getArgs()+",target:"+joinPoint.getThis());
    }

    //后置通知
    @AfterReturning(value = "pc()",returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint,Object returnValue){
        System.out.println("LogAdvice.afterReturning,returnValue:"+returnValue);
    }

    //异常通知
    @AfterThrowing(value = "pc2()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        System.out.println("LogAdvice.afterThrowing,e:"+e);
    }

    //环绕通知
    @Around("pc()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务。。。");

        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
            System.out.println("提交事务。。。");
        } catch (Throwable throwable) {
            System.out.println("回滚事务。。。");
            throw throwable;
        }

        return proceed;
    }
}
