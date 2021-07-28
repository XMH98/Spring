package aop04.action;

import aop04.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 15:47
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop04/spring.xml");
        UserService userService = (UserService) ac.getBean("userService");
        System.out.println(userService.getClass());//class com.sun.proxy.$Proxy4    表示使用的是jdk的动态代理

        userService.login("admin","123");
        System.out.println("-------------------------");
        System.out.println(userService.logout());
    }
}
