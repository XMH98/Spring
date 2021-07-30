package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Map;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 12:23
 * Description: <描述>
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/test1")
    public void test1(HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws IOException {
        System.out.println("ParamController.test1,"+req+","+resp+","+session);

        String username = req.getParameter("username");

        session.setAttribute("username",username);

        PrintWriter out = resp.getWriter();
        out.print("<h1>"+username+"</h1>");
        out.flush();
        out.close();
    }

    @RequestMapping("/test2")
    public void test2(InputStream is ,OutputStream os){
        //相当于如下代码
        //InputStream is = req.getInputStream;
        //OutputStream os = resp.getOutputStream;
        System.out.println("ParamController.test2,"+is+","+os);
    }

    @RequestMapping("/test3")
    public void test3(Reader reader,Writer writer){
        //Reader reader = req.getReader;
        //Writer writer = resp.getWriter;
        System.out.println("ParamController.test3,"+reader+","+writer);
    }


    @RequestMapping("/test4")
    public String test4(Model model, Map map, ModelMap modelMap){
        model.addAttribute("name","tom");
        map.put("age",20);
        modelMap.addAttribute("sex","male");
        modelMap.put("address","nanjing");
        return "result";
    }

    @RequestMapping("/test5")
    public String test5(@RequestParam(name="aaa") String username, int age,@RequestParam(required = false,defaultValue = "180") Double height){
        System.out.println("ParamController.test5,username:"+username+",age:"+age+",height:"+height);
        return "result";
    }

    @RequestMapping("/test6/{id}")
    public String test6(@PathVariable("id") int userid, String name){
        System.out.println("ParamController.test6,id="+userid+",name="+name);
        return "result";
    }

    @RequestMapping("/test7")
    public String test7(@RequestHeader("User-Agent") String userAgent,@RequestHeader("Cookie") String cookie){
        System.out.println("ParamController.test7,userAgent:"+userAgent+",cookie:"+cookie);
        return "result";
    }

    @RequestMapping("setCookie")
    public String setCookie(HttpServletResponse resp){

        //向客户端添加Cookie
        Cookie cookie = new Cookie("username","admin");
        cookie.setMaxAge(7*24*60*60);
        resp.addCookie(cookie);

        return "result";
    }

    @RequestMapping("test8")
    public String test8(@CookieValue String username,@CookieValue("JSESSIONID") String sessionID){
        System.out.println("ParamController.test8,username="+username+",sessionID="+sessionID);
        return "result";
    }

    @RequestMapping("test9")
    public String test9(@RequestBody String requestBody){
        System.out.println("ParamController.test9,requestBody:"+requestBody);
        return "result";
    }

}
