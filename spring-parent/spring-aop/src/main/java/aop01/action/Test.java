package aop01.action;

import aop01.service.UserService;
import aop01.service.impl.UserServiceImpl;
import aop01.service.impl.proxy.UserServiceProxy;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 12:10
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        //UserService userService=new UserServiceImpl();
        UserService userService=new UserServiceProxy();

        userService.login("admin","123");
        System.out.println(userService.logout());
    }
}
