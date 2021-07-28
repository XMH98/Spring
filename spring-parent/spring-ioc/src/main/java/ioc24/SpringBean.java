package ioc24;

import ioc24.editor.BirthdayEditor;

import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 19:21
 * Description: <描述>
 */
public class SpringBean {
    private Address address;

    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
