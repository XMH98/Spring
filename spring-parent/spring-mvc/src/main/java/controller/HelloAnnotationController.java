package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: 徐明皓
 * Date: 2021-07-28 21:02
 * Description: <描述>
 */
@Controller
public class HelloAnnotationController {

    @RequestMapping("/hello")
    public ModelAndView sayHello(String name){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","你好 "+name);
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/hello2")
    public ModelAndView sayHi(String name){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","你的名字 "+name);
        mav.setViewName("hello");
        return mav;
    }

}
