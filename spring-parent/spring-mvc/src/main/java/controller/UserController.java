package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.UserVo;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 15:26
 * Description: <描述>
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/regist")
    public String regist(@Valid UserVo userVo, Errors errors){
        //手动进行服务端数据校验
        //if(userVo.getAge()<0||userVo.getAge()>120){
        //    errors.reject("年龄只能在0-120之间");//手动添加错误消息
        //}

        //判断是否有错误
        if(errors.hasErrors()){
            System.out.println(errors);
            return "regist";
        }
        System.out.println("UserController.regist,userVo:"+userVo);
        return "success";
    }

    @ModelAttribute("types")
    public List<String> getTypes(){
        System.out.println("UserController.getTypes");
        List<String> list = Arrays.asList("服装","数码","食品");
        return list;
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("UserController.test");
        return "result";
    }

}
