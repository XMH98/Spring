package ioc21;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 15:19
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) throws IOException {

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc21/spring.xml");
        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        Resource resource = springBean.getResource();

        //Resource resource = new FileSystemResource("D:/programme/Spring/spring-parent/spring-ioc/src/main/resources/ioc21/spring.xml");
        //Resource resource2 = new ClassPathResource("ioc21/spring.xml");

        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
        System.out.println(resource.exists());

        InputStream inputStream = resource.getInputStream();
        StreamUtils.copy(inputStream,new FileOutputStream("E:/1.xml"));




    }
}
