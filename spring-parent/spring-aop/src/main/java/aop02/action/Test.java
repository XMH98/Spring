package aop02.action;

import aop02.service.UserService;
import aop02.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 12:10
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        //调用Proxy类的newProxyInstance()方法动态的生成代理类的实例
        UserService userService= (UserService) Proxy.newProxyInstance(
                UserServiceImpl.class.getClassLoader(),//目标类的类加载器
                new Class[]{UserService.class},//目标类的接口列表
                new InvocationHandler() {//交叉业务逻辑
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //1.打印日志
                        System.out.println(method.getName()+" login at:["+new Date().getTime()+"]");
                        //2.执行业务
                        Object returnValue = method.invoke(new UserServiceImpl(), args);
                        return returnValue;
                    }
                }
        );

        userService.login("admin","123");

        System.out.println("---------------------------------------");

        System.out.println(userService.logout());

        //代理类的类型
        System.out.println(userService.getClass());
    }
}
