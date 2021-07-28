package aop.service.impl;


import aop.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 12:08
 * Description: <描述>
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void login(String username, String password) {
        System.out.println("UserServiceImpl.login:"+username+","+password);
        //int k=5/0;
    }

    @Override
    public String logout() {
        System.out.println("UserServiceImpl.logout");
        return "byebye";
    }
}
