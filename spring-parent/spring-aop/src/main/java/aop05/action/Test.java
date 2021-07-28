package aop05.action;

import aop05.service.CalcService;
import aop05.service.impl.CalcServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 18:10
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop05/spring.xml");

        CalcService calcService = (CalcService) ac.getBean("calcService");
        System.out.println(calcService.add(1,2));
        System.out.println(calcService.add(1,2));
        System.out.println(calcService.add(2,1));
        System.out.println(calcService.minus(1,2));
        System.out.println(calcService.minus(1,2));
        System.out.println(calcService.add(2,1));


    }
}
