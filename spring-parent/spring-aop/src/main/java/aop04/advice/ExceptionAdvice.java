package aop04.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 17:55
 * Description: <异常通知>
 */
public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex){
        System.out.println("ExceptionAdvice.afterThrowing");
    }

}
