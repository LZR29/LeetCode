package dynamicproxy;

import javax.swing.*;
import java.io.Reader;
import java.lang.reflect.Proxy;

/**
 * @authoor linzerong
 * @create 2019-04-13 15:08
 */
public class DynamicProxyDemo {
    public static void test(Interface i){
        i.doSomething();
        i.doSomethingElse("lzzrrr");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        test(real);
        System.out.println("-----------------");
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        test(proxy);
    }
}
