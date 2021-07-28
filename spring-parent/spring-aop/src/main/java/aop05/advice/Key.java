package aop05.advice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 20:08
 * Description: <自定义的Key>
 *     用来封装判断方法是否执行的三要素：method、args、target
 */
public class Key {
    private Method method;
    private Object[] args;
    private Object target;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    //判断唯一性时，会自动调用这两个方法，所以需要重写这两个方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(method, key.method) && Arrays.equals(args, key.args) && Objects.equals(target, key.target);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(method, target);
        result = 31 * result + Arrays.hashCode(args);
        return result;
    }
}
