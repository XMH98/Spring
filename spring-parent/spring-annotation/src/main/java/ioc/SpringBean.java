package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

/**
 * Author: 徐明皓
 * Date: 2021-05-12 15:37
 * Description: <描述>
 */
//默认bean的id为类名首字母小写，如果不同包下存在同名的类，则可以修改id
@Component("sb")
@Lazy
@Scope("prototype")
public class SpringBean {

    @Value("666")
    private int num;

    @Value("true")
    private Boolean flag;

    @Value("${jdbc.username}")
    private String username;

    @Value("java.lang.String")
    private Class clazz;

    @Value("classpath:ioc/spring.xml")
    private Resource resource;

    /**
     * 方式1：使用@Autowired，Spring提供
     *      自动装配，默认按byType，如果有多个同类型的bean，则按byName
     *      结合@Qualifier按指定byName注入
     * 方式2：@javax.annotation.Resource，javaEE提供
     */
    @Autowired
    //@Qualifier
    //@javax.annotation.Resource
    private OtherBean otherBean;


    //集合的装配，使用@javax.annotation.Resource注解，按byName注入
    @javax.annotation.Resource(name = "as")
    private Integer[] arrays;

    @javax.annotation.Resource
    private List<OtherBean> list;

    @javax.annotation.Resource
    private Set<OtherBean> set;

    @javax.annotation.Resource
    private Map<OtherBean,Class> map;

    @javax.annotation.Resource
    private Properties properties;


    public SpringBean() {
        System.out.println("SpringBean.SpringBean");
    }

    //相当于init-method=""
    @PostConstruct
    public void init(){
        System.out.println("SpringBean.init");
    }

    //相当于destroy-method=""
    @PreDestroy
    public void destroy(){
        System.out.println("SpringBean.destroy");
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "num=" + num +
                ", flag=" + flag +
                ", username='" + username + '\'' +
                ", clazz=" + clazz +
                ", resource=" + resource +
                ", otherBean=" + otherBean +
                ", arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
