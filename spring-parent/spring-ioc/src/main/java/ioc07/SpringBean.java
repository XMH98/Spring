package ioc07;

import java.util.Locale;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 20:10
 * Description: <描述>
 */
public class SpringBean {

    {
        System.out.println("代码块");
    }
    private String name;

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public SpringBean() {
        System.out.println("SpringBean.SpringBean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        System.out.println("SpringBean.setName");
        this.name = name;
    }

    //初始化方法
    public void init(){
        this.name = this.name.toUpperCase(Locale.ROOT)+"_"+this.sex.toUpperCase(Locale.ROOT);
    }

    //销毁方法
    public void destroy(){
        System.out.println("springBean.destroy");
    }
}
