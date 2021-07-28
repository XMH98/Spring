package aop06.action;

import aop06.service.ProductService;
import aop06.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 20:56
 * Description: <描述>
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop06/spring.xml");

        UserService userService = (UserService) ac.getBean("userService");

        userService.login("tom","123");
        System.out.println(userService.logout());
        System.out.println("--------------------------------");

        ProductService productService = (ProductService) ac.getBean("productService");
        productService.add();
        productService.deleteById(2);
        productService.deleteByName("name");
    }

}
