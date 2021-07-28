package ioc15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 17:04
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc15/spring.xml");

        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean);

        SpringBean springBean2 = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean2);

        System.out.println(springBean==springBean2);
    }
}
