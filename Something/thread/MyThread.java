package thread;

/**
 * @authoor linzerong
 * @create 2019-04-03 16:19
 */
public class MyThread extends Thread {
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("thread is :" + name + ", i = " + (i+1));
        }
    }
}
