package ioc18;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 18:33
 * Description: <描述>
 */
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextHolder.setApplicationContext");
        ac=applicationContext;
    }

    //一般不直接提供获取ApplicationContext的方法，不安全
    //public static ApplicationContext getApplicationContext(){
    //    return ac;
    //}

    public static Object getBean(String beanName){
        return ac.getBean(beanName);
    }
}
