package thread;

/**
 * @author linzerong
 * @create 2019-04-03 16:37
 */
public class CycleWait implements Runnable {
    static String data;
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        data = "mydata";
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new CycleWait());
        t.start();
        t.join();
        System.out.println(data);
    }
}
