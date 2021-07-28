package ioc13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 14:58
 * Description: <描述>
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        //ApplicationContext ac = new ClassPathXmlApplicationContext("ioc13/spring.xml");
        //System.out.println(ac.getBean("date"));

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/greatecommunity", "root", "123456");
        PreparedStatement ps = connection.prepareStatement("select * from user ");
        System.out.println(ps);

    }
}
