package ioc02.dao;

import ioc02.entity.User;

/**
 * Author: 徐明皓
 * Date: 2021-05-07 21:29
 * Description: <描述>
 */
public interface UserDao {
    public User selectByUsername(String username);
}
