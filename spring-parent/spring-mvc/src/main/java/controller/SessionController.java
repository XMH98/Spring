package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import vo.UserVo;

import javax.servlet.http.HttpSession;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 21:54
 * Description: <描述>
 */
@Controller
@RequestMapping("/session")
@SessionAttributes("userVo")
public class SessionController {

    @RequestMapping("/step1")
    public String step1(){
        return "step1";
    }

    @RequestMapping("/step2")
    public String step2(UserVo userVo){
        System.out.println("SessionController.step2,"+userVo);
        return "step2";
    }

    @RequestMapping("/step3")
    public String step3(UserVo userVo){
        System.out.println("SessionController.step3,"+userVo);
        return "step3";
    }

    @RequestMapping("/regist")
    public String regist(UserVo userVo, HttpSession session){
        System.out.println(session.getAttribute("userVo"));
        System.out.println("SessionController.regist,"+userVo);
        return "success";
    }
}
