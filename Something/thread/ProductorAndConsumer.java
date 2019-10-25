package thread;

/**
 * @author linzerong
 * @create 2019-09-30 15:17
 * 生成者消费者模型
 */
public class ProductorAndConsumer {

    public static void main(String[] args) {
        Store store = new Store();
        Productor pro = new Productor(store);
        Consumer con = new Consumer(store);
        new Thread(pro, "生产者 A").start();
        new Thread(con, "消费者 B").start();

        new Thread(pro, "生产者 AA").start();
        new Thread(con, "消费者 BB").start();
    }


}

/**
*商店
 */
class Store{

    private int product = 0;

    /**
     进货
     */
    public synchronized void get(){
        while (product >= 10){
            //为了避免虚假唤醒问题，应该总是使用在循环中
            System.out.println("商品已满！");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + ++product);
        this.notifyAll();

    }

    /**
     卖货
     */
    public synchronized void sale(){
        while (product <= 0){
            System.out.println("商品已空！");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + --product);
        this.notifyAll();

    }
}
class Productor implements Runnable{

    private Store store;

    public Productor(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.get();
        }
    }
}

class Consumer implements Runnable{

    private Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.sale();
        }
    }
}