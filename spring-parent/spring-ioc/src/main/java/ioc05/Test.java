package ioc05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 16:29
 * Description: <描述>
 */public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc05/spring.xml");
        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean);
    }
}
