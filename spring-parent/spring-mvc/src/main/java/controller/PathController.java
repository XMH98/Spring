package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Author: 徐明皓
 * Date: 2021-07-29 15:42
 * Description: <描述>
 */
@Controller
@RequestMapping("/path")
public class PathController{

    /**
     * 基本用法
     */

    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("PathController.showLogin");
        return "login";
    }

    @RequestMapping("forward")
    public String forward(){
        System.out.println("PathController.forward");
        //return "forward:showLogin";//相对路径
        return "forward:/showLogin";//绝对路径
    }

    /**
     * Ant风格(较少使用）
     */

    @RequestMapping("/test1/*")
    public String test1(){
        return "hello";
    }

    @RequestMapping("/test2/**")
    public String test2(){
        return "hello";
    }

    @RequestMapping("/test3/?")
    public String test3(){
        return "hello";
    }

    @RequestMapping("/test4/?/aa/*/b?c/**/b")
    public String test4(){
        return "hello";
    }

    /**
     * Rest风格
     */
    @RequestMapping("/test5/{id}/{name}")
    public String test5(@PathVariable String id,@PathVariable("name") String username){
        System.out.println("PathController.test5,id:"+id+",username:"+username);
        return "hello";
    }

    /**
     * 固定写法
     */
    //@RequestMapping("/test6")
    //@RequestMapping(path="/test6")
    //@RequestMapping(value="/test6")
    @RequestMapping(value={"/test6","t6"})
    public String test6(){
        System.out.println("PathController.test6");
        return "hello";
    }

    /**
     * 根据请求方式访问
     */
    @RequestMapping(path="/test7",method = RequestMethod.POST)
    public String test7(){
        return "hello";
    }

    //@RequestMapping(path = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String delectUser(@PathVariable Integer id){
        System.out.println("PathController.delectUser");
        return "hello";
    }

    //@RequestMapping(path = "/user/{id}",method = RequestMethod.POST)
    @PostMapping("/user/{id}")
    public String selectUser(@PathVariable Integer id){
        System.out.println("PathController.selectUser");
        return "hello";
    }

    /**
     * 其他属性
     */
    @RequestMapping(path="/test8",params = {"id","username=admin","password!=123"})
    public String test8(){
        return "hello";
    }

    @RequestMapping(path = "/test9",headers = {"Cookie","Accept-Language=zh-CN,zh;q=0.9"})
    public String test9(){
        return "hello";
    }

}
