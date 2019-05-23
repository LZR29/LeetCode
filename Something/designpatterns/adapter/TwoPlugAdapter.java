package designpatterns.adapter;

/**
 * @author linzerong
 * @create 2019-04-16 13:18
 * 二相转三相的插座适配器
 * 组合方式
 */
public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug){
        this.plug = plug;
    }
    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();

    }
}
