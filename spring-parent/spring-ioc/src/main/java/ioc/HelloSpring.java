package ioc;

/**
 * Author: 徐明皓
 * Date: 2021-05-07 20:49
 * Description: <描述>
 */
public class HelloSpring {
    private String name;

    public String getName() {
        return name;
    }

    //本质上是通过setter方法注入的
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello "+name);
    }
}
