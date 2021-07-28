package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-12 15:38
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ioc/spring.xml");

        SpringBean springBean = (SpringBean) ac.getBean("sb");

        System.out.println(springBean);

        ac.destroy();
        //System.out.println(ac.getBean("otherBean"));
    }
}
