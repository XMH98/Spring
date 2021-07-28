package ioc14;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 15:23
 * Description: <描述>
 */
public class SpringBean {
    private String name;

    public SpringBean() {
        System.out.println("SpringBean.SpringBean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
