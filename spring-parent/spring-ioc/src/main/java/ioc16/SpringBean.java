package ioc16;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 17:22
 * Description: <描述>
 */
public class SpringBean extends ParentBean{
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "age=" + age +
                '}'+super.toString();
    }
}
