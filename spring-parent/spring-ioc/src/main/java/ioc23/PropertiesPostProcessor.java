package ioc23;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 16:35
 * Description: <描述>
 */
public class PropertiesPostProcessor implements BeanPostProcessor {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields){
            Class<?> type = field.getType();
            if(type==String.class){
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    String str = field.get(bean).toString();
                    String value = reValue(str);
                    field.set(bean,value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                throw new RuntimeException("不支持的注入类型");
            }
        }


        return bean;
    }

    private String reValue(String value){//读取${}
        Pattern pattern = Pattern.compile("\\$\\{(.*)\\}");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()){
            String key = matcher.group(1);
            return getProperty(key);
        }
        return value;
    }

    private String getProperty(String key){
        Properties p = new Properties();
        try {
            p.load(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (p.containsKey(key)){
            return p.getProperty(key);
        }else {
            throw new RuntimeException("未找到对应的key");
        }
    }
}
