package ioc17;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 17:47
 * Description: <描述>
 */
public class OtherBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OtherBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
