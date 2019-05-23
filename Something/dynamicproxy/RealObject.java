package dynamicproxy;

/**
 * @author linzerong
 * @create 2019-04-13 15:18
 */
public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething.....");
        System.out.println(this.hashCode());
    }

    @Override
    public void doSomethingElse(String s) {
        System.out.println(s + " : doSomethingElse.....");
    }
}
