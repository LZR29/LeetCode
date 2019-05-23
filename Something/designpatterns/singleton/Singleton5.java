package designpatterns.singleton;
/**
 * @author linzerong
 * @create 2019-04-15 21:47
 * 饿汉式（枚举方式）
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化
 */
public enum Singleton5 {
    //实例
    Instance;

    public void doSomeThing() {
        System.out.println("枚举方法实现单例");
    }
}
class TestSingleton5{
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.Instance;
        instance.doSomeThing();
    }
}
