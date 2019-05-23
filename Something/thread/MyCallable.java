package thread;

import java.util.concurrent.Callable;

/**
 * @author linzerong
 * @create 2019-04-03 16:43
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String value = "test callable";
        System.out.println("Start");
        Thread.sleep(1000);
        System.out.println("Finish");
        return value;
    }
}
