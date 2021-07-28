package ioc09;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 13:33
 * Description: <描述>
 */
public class SpringBean {
    private String username;
    private String password;
    private Integer age;

    public SpringBean() {
        System.out.println("SpringBean.SpringBean");
    }

    public SpringBean(String name, String psw, Integer age) {
        System.out.println("SpringBean(String,String,Integer)");
        this.username = name;
        this.password = psw;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
