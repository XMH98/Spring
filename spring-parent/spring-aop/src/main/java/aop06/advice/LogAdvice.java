package aop06.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 20:58
 * Description: <描述>
 */
public class LogAdvice {
    //前置通知
    public void log(JoinPoint joinpoint){
        Signature signature = joinpoint.getSignature();//签名
        String methodName = signature.getName();//方法名
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        Object[] args = joinpoint.getArgs();//方法参数
        //Object target = joinpoint.getThis();//目标对象
        Object target = joinpoint.getTarget();

        System.out.println("LogAdvice.log,methodName"+methodName+",args:"+ Arrays.toString(args) +",target:"+target);
    }

    //后置通知
    public void log2(JoinPoint joinpoint,Object returnValue){
        System.out.println("LogAdvice.log2"+returnValue);
    }

    //异常通知
    public void log3(JoinPoint joinpoint,Exception e){
        System.out.println("LogAdvice.log3,e:"+e);
    }

    //环绕通知
    public Object log4(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行前。。。");

        Object proceed = joinPoint.proceed();

        System.out.println("方法执行后。。。");

        return proceed;

    }
}
