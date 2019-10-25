package thread;

/**
 * @author linzerong
 * @create 2019-09-30 21:07
 * 死锁代码示例，注意string类型可能会引起只有一个锁对象，所以使用new String();
 */
public class Deadlock {
    public static String lock1 = new String("lock");
    public static String lock2 = new String("lock");

    public static void main(String[] args) {
        //线程1
        Thread thread1 = new Thread(() -> {
                synchronized (lock1){
                    System.out.println(Thread.currentThread().getName()+"锁住 lock1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println(Thread.currentThread().getName()+"锁住 lock2");
                    }
                }

        });

        //线程2
        Thread thread2 = new Thread(() -> {
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getName()+"锁住 lock2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println(Thread.currentThread().getName()+"锁住 lock1");
                    }
                }

        });
        thread1.start();
        thread2.start();
    }
}
