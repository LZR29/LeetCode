package thread;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("thread is :" + name + ", i = " + (i+1));
        }
    }
}
