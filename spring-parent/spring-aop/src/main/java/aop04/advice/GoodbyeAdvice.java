package aop04.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 17:22
 * Description: <后置通知>
 */
public class GoodbyeAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("GoodbyeAdvice,target"+target+",method:"+method.getName()+",args:"+ Arrays.toString(args)+",returnValue:"+returnValue);

    }
}
