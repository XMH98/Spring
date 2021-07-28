package ioc24;

import ioc24.editor.AddressEditor;
import ioc24.editor.BirthdayEditor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.beans.PropertyEditor;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 19:36
 * Description: <描述>
 */
public class SpringBeanFactoryProcessor implements BeanFactoryPostProcessor {

    private Map<Class,Class<? extends PropertyEditor>> customEditors;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanFactoryProcessor.postProcessBeanFactory");
        //向容器中注册属性编辑器,第一个参数表示要转换的类型，第二个参数表示要使用的属性编辑器
        //beanFactory.registerCustomEditor(Address.class, AddressEditor.class);
        //beanFactory.registerCustomEditor(Date.class, BirthdayEditor.class);

        for (Entry<Class,Class<? extends PropertyEditor>> entry:customEditors.entrySet()){
            beanFactory.registerCustomEditor(entry.getKey(),entry.getValue());
        }
    }

    public Map<Class, Class<? extends PropertyEditor>> getCustomEditors() {
        return customEditors;
    }

    public void setCustomEditors(Map<Class, Class<? extends PropertyEditor>> customEditors) {
        this.customEditors = customEditors;
    }

    @Override
    public String toString() {
        return "SpringBeanFactoryProcessor{" +
                "customEditors=" + customEditors +
                '}';
    }
}
