package ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 16:18
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc04/spring.xml");
        System.out.println(ac.getBean("springBean"));
    }
}
