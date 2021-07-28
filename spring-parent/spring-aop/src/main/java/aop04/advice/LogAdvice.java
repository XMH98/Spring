package aop04.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 15:49
 * Description: <前置通知，增强类>
 */
public class LogAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        //1.打印日志
        System.out.println(method.getName() + " login at:[" + new Date().getTime() + "]，args"+ Arrays.toString(args)+",target:"+target);
    }
}
