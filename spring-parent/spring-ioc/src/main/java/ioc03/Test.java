package ioc03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 15:42
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        //ApplicationContext
        //ApplicationContext ac = new ClassPathXmlApplicationContext("ioc03/spring.xml");
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:/programme/Spring/spring-parent/spring-ioc/src/main/resources/ioc03/spring.xml");
        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean);

        //BeanFactory
        //Resource resource = new ClassPathResource("ioc03/spring.xml");
        Resource resource = new FileSystemResource("D:/programme/Spring/spring-parent/spring-ioc/src/main/resources/ioc03/spring.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        SpringBean springBean1 = (SpringBean) bf.getBean("springBean");
        System.out.println(springBean1);
    }
}
