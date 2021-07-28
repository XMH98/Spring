package ioc18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 18:16
 * Description: <描述>
 */
public class OtherBean {

    public static void showName(){
        //这里不能再创建IoC容器，否则会出现多个IoC容器，效率极低
        //ApplicationContext ac = new ClassPathXmlApplicationContext("ioc18/spring.xml");
        //SpringBean springBean = (SpringBean) ac.getBean("springBean");
        //System.out.println(springBean);


        //ApplicationContext ac = ApplicationContextHolder.getApplicationContext();
        //SpringBean springBean = (SpringBean) ac.getBean("springBean");
        //System.out.println(springBean);

        SpringBean springBean = (SpringBean) ApplicationContextHolder.getBean("springBean");

        System.out.println(springBean.getName());
    }

}
