package designpatterns.singleton;

/**
 * @authoor linzerong
 * @create 2019-04-15 21:47
 * 单例模式Singleton
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式(指全局的单例实例在类装载时构建)、懒汉模式(指全局的单例实例在第一次被使用时构建。)
 *饿汉方式(线程安全)
 * 所谓 “饿汉方式” 就是说JVM在加载这个类时就马上创建此唯一的单例实例，不管你用不用，先创建了再说，
 * 如果一直没有被使用，便浪费了空间，典型的空间换时间，每次调用的时候，就不需要再判断，节省了运行时间。
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){ }
    public static Singleton getInstance(){
        return instance;
    }
}
