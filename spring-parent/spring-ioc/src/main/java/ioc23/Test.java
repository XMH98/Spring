package ioc23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 16:33
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc23/spring.xml");

        System.out.println(ac.getBean("springBean"));
        System.out.println(ac.getBean("otherBean"));
    }
}
