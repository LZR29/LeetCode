package easy;

import java.util.concurrent.Semaphore;

/**
 * @author linzerong
 * @create 2019-09-12 9:49
 */
public class Foo {
    Semaphore sf;
    Semaphore ss;
    Semaphore st;
    public Foo() {
        sf = new Semaphore(1);
        ss = new Semaphore(0);
        st = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        sf.acquire();
        printFirst.run();
        ss.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        ss.acquire();
        printSecond.run();
        st.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        st.acquire();
        printThird.run();
        sf.release();
    }
}
