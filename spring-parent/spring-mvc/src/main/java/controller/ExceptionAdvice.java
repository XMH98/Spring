package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 22:33
 * Description: <描述>
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(ArithmeticException.class)
    public String arithmatic(Exception e){
        System.out.println("警报，程序出现异常："+e.getMessage());
        return "error/arithmetic";
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullpoint(Exception e){
        System.out.println("警报，程序出现异常："+e.getMessage());
        return "error/nullpoint";
    }

    @ExceptionHandler(Exception.class)
    public String exception(Exception e){
        System.out.println("警报，程序出现异常："+e.getMessage());
        return "error/exception";
    }

}
