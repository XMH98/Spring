package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: 徐明皓
 * Date: 2021-07-28 17:41
 * Description: <描述>
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String name = request.getParameter("name");

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Hello "+name);
        mav.setViewName("hello");

        return mav;






    }
}
