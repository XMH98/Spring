package aop05.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 20:06
 * Description: <环绕通知>
 */
public class MethodResultCacheAdvice implements MethodInterceptor {

    Map<Key,Object> cache = new HashMap<Key,Object>();


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        Method method = invocation.getMethod();
        Object[] args = invocation.getArguments();
        Object target = invocation.getThis();
        Key key = new Key();
        key.setMethod(method);
        key.setArgs(args);
        key.setTarget(target);

        //判断方法是否执行过，如果执行过，则直接返回结果
        if (cache.containsKey(key)){
            return cache.get(key);
        }

        //如果未执行过，则调用执行业务方法
        Object proceed = invocation.proceed();

        //将结果添加到缓存中
        cache.put(key,proceed);

        return proceed;
    }
}
