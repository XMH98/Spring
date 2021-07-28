package ioc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 13:58
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        //不使用Spring
        //SpringBean springBean = SpringBeanFactory.getSpringBean();
        //springBean.setName("tom");

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc10/spring.xml");

        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean);

        System.out.println(ac.getBean("springBean2"));
    }
}
