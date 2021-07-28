package ioc12;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 14:40
 * Description: <描述>
 */
public class SpringBeanFactory {

    public SpringBean getSpringBean(){
        System.out.println("SpringBeanFactory.getSpringBean");
        return new SpringBean();
    }

    public SpringBean getSpringBean(String name){
        System.out.println("SpringBeanFactory.getSpringBean(String)");
        SpringBean springBean = new SpringBean();
        springBean.setName(name);
        return springBean;
    }
}
