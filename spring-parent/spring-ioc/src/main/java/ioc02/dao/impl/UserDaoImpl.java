package ioc02.dao.impl;

import ioc02.dao.UserDao;
import ioc02.entity.User;

/**
 * Author: 徐明皓
 * Date: 2021-05-07 21:31
 * Description: <描述>
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User selectByUsername(String username) {
        System.out.println("使用JDBC查询");
        User user = new User();
        user.setUsername(username);
        user.setPassword("123");
        return user;
    }
}
