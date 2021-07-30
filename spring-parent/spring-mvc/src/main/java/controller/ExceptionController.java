package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 22:24
 * Description: <描述>
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/test1")
    public String test1(){
        int i=5/0;
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(){
        String str=null;
        str.toString();
        return "success";
    }

}
