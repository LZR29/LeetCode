package test;

import java.util.concurrent.CyclicBarrier;

/**
 * @author linzerong
 * @create 2019-09-26 19:41
 */
public class CyclicBarrierTest {
    private static CyclicBarrier cyclicBarrier;

    static class CyclicBarrierThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "到了");
            //等待
            try {
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "到了2");
        }
    }

    public static void main(String[] args){
        cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("人到齐了，开会吧....");
            }
        });

        for(int i = 0 ; i < 5 ; i++){
            new CyclicBarrierThread().start();
        }
    }
}
