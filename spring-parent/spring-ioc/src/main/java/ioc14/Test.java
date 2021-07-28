package ioc14;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 15:25
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("ioc14/spring.xml");
        //SpringBean springBean = (SpringBean) ac.getBean("springBean");
        //System.out.println(springBean.getName());

        Resource resource = new ClassPathResource("ioc14/spring.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        //Object springBean = factory.getBean("springBean");
    }
}
