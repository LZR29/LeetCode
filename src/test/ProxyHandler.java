package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author linzerong
 * @create 2019-08-09 22:47
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;
    ProxyHandler(Object o){
        object = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("in proxy");
        return method.invoke(object, args);
    }
}
