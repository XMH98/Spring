package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: 徐明皓
 * Date: 2021-07-29 13:42
 * Description: <描述>
 */
@Controller
public class ReturnController {

    @RequestMapping("/showLogin2")
    public String showLogin2(){
        System.out.println("ReturnController.showLogin2");
        return "login";
    }

    @RequestMapping("/login2")
    public String login(String username, String password, Model model){
        if("admin".equals(username)&&"123".equals(password)){
            model.addAttribute("username",username);
            return "success";
        }else {
            model.addAttribute("login","username or password error");
            //return "login";
            //return "forward:showLogin2";//转发
            return "redirect:showLogin2";//重定向
        }
    }

}
