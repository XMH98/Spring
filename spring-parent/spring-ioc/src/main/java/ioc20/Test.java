package ioc20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 12:03
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc20/spring.xml");

        Date date1 = (Date) ac.getBean("dateFactoryBean");
        Date date2 = (Date) ac.getBean("double11");

        System.out.println(date1);
        System.out.println(date2);
    }
}
