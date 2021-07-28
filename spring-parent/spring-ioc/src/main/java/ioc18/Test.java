package ioc18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 18:22
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc18/spring.xml");
        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean);

        OtherBean.showName();

    }
}
