package aop04.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 17:34
 * Description: <环绕通知>
 */
public class TimeAdvice implements MethodInterceptor {
    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();//方法
        Object[] args = invocation.getArguments();//参数
        Object target = invocation.getThis();//目标对象

        //方法执行前
        long startTime = System.currentTimeMillis();
        System.out.println("方法执行前。。。。。。");

        Object proceed = invocation.proceed();//执行业务逻辑，其实就是调用业务方法，返回值表示执行业务方法后返回的结果

        //方法执行前
        long endTime = System.currentTimeMillis();
        System.out.println("方法执行后。。。。。。，执行"+method.getName()+"花费："+(endTime-startTime)+"ms");

        if (endTime-startTime>time){
            //发送短信
            System.out.println("!!!警报：发送信息！");
        }

        return null;
    }
}
