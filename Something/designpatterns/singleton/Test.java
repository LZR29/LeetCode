package designpatterns.singleton;

/**
 * @author linzerong
 * @create 2019-04-15 22:26
 */
public class Test {
    public static void main(String[] args) {
        Singleton4 i1 = Singleton4.getInstance();
        Singleton4 i2 = Singleton4.getInstance();
        System.out.println(i1 == i2);
    }
}
