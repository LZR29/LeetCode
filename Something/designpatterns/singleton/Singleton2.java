package designpatterns.singleton;

/**
 * @author linzerong
 * @create 2019-04-15 22:10
 * 懒汉模式（非线程安全版本）
 * 所谓 “ 懒汉式” 就是说单例实例在第一次被使用时构建，而不是在JVM在加载这个类时就马上创建此唯一的单例实例。
 * 如果多个线程同时访问getInstance()方法时就会出现问题。
 * 如果想要保证线程安全，一种比较常见的方式就是在getInstance() 方法前加上synchronized关键字
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
    /*
    但是在程序中每次使用getInstance() 都要经过synchronized加锁这一层，
    这难免会增加getInstance()的方法的时间消费，而且还可能会发生阻塞。
     */
    /*public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }*/
}

