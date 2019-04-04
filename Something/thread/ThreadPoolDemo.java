package thread;

import java.util.concurrent.*;

/**
 * @authoor linzerong
 * @create 2019-04-03 16:55
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        Future<String> future = pool.submit(new MyCallable());
        if(!future.isDone()){
            System.out.println("Not finish");
        }
        System.out.println(future.get());
        pool.shutdown();
    }
}
