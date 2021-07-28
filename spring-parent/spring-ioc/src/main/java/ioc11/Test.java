package ioc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Map;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 14:20
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc11/spring.xml");

        Calendar calendar = (Calendar) ac.getBean("calendar");
        System.out.println(calendar);

        //Map<String, String> getenv = System.getenv();
        //System.out.println(getenv);

        String javaHome = (String) ac.getBean("javaHome");
        System.out.println(javaHome);
    }
}
