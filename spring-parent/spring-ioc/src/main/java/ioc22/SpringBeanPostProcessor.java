package ioc22;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 16:10
 * Description: <描述>
 */
public class SpringBeanPostProcessor implements BeanPostProcessor {

    //在bean初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("SpringBeanPostProcessor.postProcessBeforeInitialization");
        return bean;//返回处理后的bean
    }

    //在bean初始化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("SpringBeanPostProcessor.postProcessAfterInitialization");
        return bean;
    }
}
