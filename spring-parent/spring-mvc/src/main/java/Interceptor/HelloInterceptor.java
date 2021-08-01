package Interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Author: 徐明皓
 * Date: 2021-08-01 15:22
 * Description: <描述>
 */
public class HelloInterceptor implements HandlerInterceptor {
    //调用目标处理方法之前执行，可以权限、日志等
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Object bean = handlerMethod.getBean();
            Method method = handlerMethod.getMethod();
            System.out.println("HelloInterceptor.preHandle,bean:"+bean.getClass()+",method:"+method.getName()+
                    ",args:"+ Arrays.toString(method.getParameterTypes()));
        }
        return true;//true表示继续调用后续的拦截器或目标方法
    }

    //调用目标处理方法之后执行，渲染视图之前，可以对数据模型或视图进行修改
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("HelloInterceptor.postHandle");
    }


    //渲染视图之后，可以用来释放资源
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("HelloInterceptor.afterCompletion");
    }
}
