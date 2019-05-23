package thread;

/**
 * @author linzerong
 * @create 2019-04-03 16:21
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("mt1");
        MyThread mt2 = new MyThread("mt2");
        mt1.start();
        mt2.start();
    }
}
