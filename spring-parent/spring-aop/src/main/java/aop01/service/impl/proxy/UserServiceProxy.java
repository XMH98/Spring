package aop01.service.impl.proxy;

import aop01.service.UserService;
import aop01.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 12:12
 * Description: <静态代理>
 *     代理三要素：
 *     1.目标类的接口
 *     2.目标类的实例
 *     3.交叉业务逻辑，要执行的操作
 */
public class UserServiceProxy implements UserService {

    private UserService userService = new UserServiceImpl();

    @Override
    public void login(String username, String password) {
        //System.out.println("login start at:["+new Date().getTime()+"]");
        //userService.login(username, password);
        try {
            Method method = userService.getClass().getMethod("login", String.class, String.class);
            invoke(method,username,password);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String logout() {
        //System.out.println("logout start at:["+new Date().getTime()+"]");
        //return userService.logout();
        try {
            Method method = userService.getClass().getMethod("logout");
            return invoke(method).toString();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    //封装到公共方法中，统一入口，模块化
    private Object invoke(Method method,Object...args){
        //1.打印日志
        System.out.println(method.getName()+" start at:["+new Date().getTime()+"]");
        //2.执行业务
        try {
            return method.invoke(userService,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


}
