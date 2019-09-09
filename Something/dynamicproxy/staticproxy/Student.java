package dynamicproxy.staticproxy;

/**
 * @author linzerong
 * @create 2019-08-09 22:30
 */
public class Student implements Person {
    @Override
    public void sayHello() {
        System.out.println("Student say hello!");
    }

    @Override
    public void sayBye() {
        System.out.println("Student say bye!");
    }
}
