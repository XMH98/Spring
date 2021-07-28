package ioc02.action;

import ioc02.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-07 21:42
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc02/spring.xml");

        UserService userService = (UserService) ac.getBean("userService");

        boolean flag = userService.login("admin", "123");

        if (flag){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

    }
}
