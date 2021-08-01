package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-08-01 16:40
 * Description: <描述>
 */
@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @RequestMapping("/test1")
    public void test1(HttpServletResponse resp) throws IOException {
        resp.getWriter().write("success");
    }

    @RequestMapping("test2")
    @ResponseBody//将返回值写到响应体中，并不是跳转视图
    public String test2(){
        return "sucess2";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){
        User user = new User(1001, "湯姆", "123", 19);
        return user;
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1001, "湯姆", "123", 19));
        users.add(new User(1002, "jack", "123", 13));
        users.add(new User(1003, "alice", "123", 16));
        return users;
    }

}
