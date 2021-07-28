package ioc02.service.ipml;

import ioc02.dao.UserDao;
import ioc02.entity.User;
import ioc02.service.UserService;

/**
 * Author: 徐明皓
 * Date: 2021-05-07 21:37
 * Description: <描述>
 */
public class UserServiceIpml implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String username, String password) {
        User user = userDao.selectByUsername(username);
        if (user!=null){
            return user.getPassword().equals(password);
        }
        return false;
    }
}
