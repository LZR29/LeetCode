package thread;

/**
 * @authoor linzerong
 * @create 2019-04-03 23:24
 */
public class WaitSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread A is runing");
                synchronized (lock){
                    System.out.println("Thread A enter SYN");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread A is done");
                }
            }
        }).start();
        Thread.sleep(10);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread B is runing");
                synchronized (lock){
                    System.out.println("Thread B enter SYN");
                    try {
                        lock.wait(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread B is done");
                }
            }
        }).start();
    }
}
