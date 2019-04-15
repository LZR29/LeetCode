package designpatterns.singleton;

/**
 * @authoor linzerong
 * @create 2019-04-15 22:15
 * 懒汉式(双重检查加锁版本)
 * 利用双重检查加锁（double-checked locking），
 * 首先检查是否实例已经创建，如果尚未创建，“才”进行同步。这样以来，只有一次同步，这正是我们想要的效果。
 */
public class Singleton3 {
    //使用volatile保证了此实例对其他线程的可见性
    private static volatile  Singleton3 instance;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        //检查实例，如果不存在，就进入同步代码块
        if(instance == null){
            //锁住类
            synchronized (Singleton3.class){
                //进入同步块，只有第一次进入才能创建实例
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
