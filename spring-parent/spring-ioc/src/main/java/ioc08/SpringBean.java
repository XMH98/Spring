package ioc08;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 20:48
 * Description: <描述>
 */
public class SpringBean {

    private String username;
    private String password;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //初始化
    public void init(){
        this.username=reValue(this.username);
        this.password=reValue(this.password);
        this.email=reValue(this.email);
    }

    private String reValue(String value) {
        //判断是否为空
        if (value==null||"".equals(value)){
            return value;
        }
        //方式一：字符串截取
        //if(value.startsWith("${")&&value.endsWith("}")){
        //    String key = value.substring(2, value.length() - 1);
        //    return getProperty(key);
        //}
        //方式二：使用正则表达式
        Pattern pattern = Pattern.compile("\\$\\{(.*)\\}");
        Matcher matcher = pattern.matcher(value);
        if(matcher.matches()){
            String key = matcher.group(1);
            return getProperty(key);
        }
        return value;
    }

    //根据key获取value
    private String getProperty(String key) {
        Properties p = new Properties();
        try {
            p.load(SpringBean.class.getClassLoader().getResourceAsStream("ioc08/info.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(p.containsKey(key)){
            return p.getProperty(key);
        }else {
            throw new RuntimeException("could not found key:"+key+" in properties");
        }
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
