package ioc23;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 16:26
 * Description: <描述>
 */
public class OtherBean {
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OtherBean{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
