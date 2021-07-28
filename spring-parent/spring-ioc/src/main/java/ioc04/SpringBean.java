package ioc04;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 16:15
 * Description: <描述>
 */
public class SpringBean {
    private int age;
    private byte bt;
    private Double price;
    private String username;
    private Class clazz;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getBt() {
        return bt;
    }

    public void setBt(byte bt) {
        this.bt = bt;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "age=" + age +
                ", bt=" + bt +
                ", price=" + price +
                ", username='" + username + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
