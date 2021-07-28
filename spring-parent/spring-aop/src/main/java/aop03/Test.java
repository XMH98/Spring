package aop03;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 15:01
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {

        HelloWorld helloWorld = (HelloWorld) Enhancer.create(
                HelloWorld.class,//目标类的类型
                new InvocationHandler() {//交叉业务逻辑
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        //1.打印日志
                        System.out.println(method.getName() + " login at:[" + new Date().getTime() + "]");
                        //2.执行业务
                        Object invoke = method.invoke(new HelloWorld(), args);
                        return invoke;
                    }
                }
        );

        helloWorld.sayHello();
        System.out.println(helloWorld.getClass());

    }
}
