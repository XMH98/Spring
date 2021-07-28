package aop.action;

import aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-12 18:02
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop/spring.xml");

        UserService userService = (UserService) ac.getBean("userService");

        userService.login("admin","123");

        System.out.println(userService.logout());
    }
}
