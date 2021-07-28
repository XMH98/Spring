package ioc10;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 13:55
 * Description: <描述>
 */
public class SpringBeanFactory {
    public static SpringBean getSpringBean(){
        System.out.println("SpringBeanFactory.getSpringBean");
        return new SpringBean();
    }

    public static SpringBean getSpringBean(String name){
        System.out.println("SpringBeanFactory.getSpringBean(String)");
        SpringBean springBean = new SpringBean();
        springBean.setName(name);
        return springBean;
    }
}
