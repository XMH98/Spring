package ioc16;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 17:22
 * Description: <描述>
 */
public class OtherBean extends ParentBean{
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "OtherBean{" +
                "sex='" + sex + '\'' +
                '}'+super.toString();
    }
}
