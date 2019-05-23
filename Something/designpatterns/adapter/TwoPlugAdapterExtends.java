package designpatterns.adapter;

/**
 * @author linzerong
 * @create 2019-04-16 13:19
 * 采用继承方式的插座适配器
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
