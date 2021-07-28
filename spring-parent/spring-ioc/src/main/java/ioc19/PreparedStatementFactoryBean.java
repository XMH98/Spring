package ioc19;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Author: 徐明皓
 * Date: 2021-05-09 21:36
 * Description: <描述>
 */
public class PreparedStatementFactoryBean implements FactoryBean<PreparedStatement> {

    //生成实例的过程
    @Override
    public PreparedStatement getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/greatecommunity", "root", "123456");
        PreparedStatement ps = connection.prepareStatement("select * from user ");
        return ps;
    }

    //生成实例的类型
    @Override
    public Class<?> getObjectType() {
        return PreparedStatement.class;
    }

    //生成实例是否为单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
