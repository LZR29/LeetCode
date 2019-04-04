package thread;

/**
 * @authoor linzerong
 * @create 2019-04-03 16:27
 */
public class RunableDemo {
    public static void main(String[] args) {
        Thread mr1 = new Thread(new MyRunnable("mr1"));
        Thread mr2 = new Thread(new MyThread("mr2"));
        mr1.start();
        mr2.start();
    }
}
