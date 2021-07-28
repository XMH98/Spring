package ioc17;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 17:47
 * Description: <描述>
 */
public class SpringBean {
    private OtherBean otherBean;

    public SpringBean(OtherBean otherBean) {
        System.out.println("SpringBean.SpringBean(OtherBean)");
        this.otherBean = otherBean;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }
}
