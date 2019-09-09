package dynamicproxy.staticproxy;

/**
 * @author linzerong
 * @create 2019-08-09 22:31
 */
public class StaticProxy implements Person {
    private Person obj;

    StaticProxy(Person obj){
        this.obj = obj;
    }

    @Override
    public void sayHello() {
        System.out.println("Proxy say hello!");
        obj.sayHello();
    }

    @Override
    public void sayBye() {
        System.out.println("Proxy say bye!");
        obj.sayBye();
    }

    public static void main(String[] args) {
        Student s = new Student();
        StaticProxy proxy = new StaticProxy(s);
        proxy.sayHello();
        proxy.sayBye();
    }
}
