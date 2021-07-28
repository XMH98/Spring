package ioc17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 17:51
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc17/spring.xml");

        SpringBean springBean = (SpringBean) ac.getBean("springBean");

        System.out.println(springBean.getOtherBean());
    }
}
