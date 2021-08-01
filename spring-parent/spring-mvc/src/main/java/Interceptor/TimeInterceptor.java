package Interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: 徐明皓
 * Date: 2021-08-01 15:53
 * Description: <描述>
 */
public class TimeInterceptor implements HandlerInterceptor {
    private long startTime,endTime;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        startTime = System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        endTime = System.currentTimeMillis();
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println("执行目标方法："+handlerMethod.getMethod().getName()+"花费的时间："+(endTime-startTime)+"ms");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
