package designpatterns.adapter;

/**
 * @author linzerong
 * @create 2019-04-16 13:17
 * 适配器模式（Adapter Pattern）属于结构型模式的一种，把一个类的接口变成客户端所期待的另一种接口，
 * 从而使原本接口不匹配而无法一起工作的两个类能够在一起工作
 * 组合和继承两种方式
 */
public class NoteBook {

    private ThreePlugIf  plug;

    public NoteBook(ThreePlugIf plug){
        this.plug = plug;
    }

    //使用插座充电
    public void charge(){
        plug.powerWithThree();
    }
    public static void main(String[] args) {
        GBTwoPlug two =  new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();
        System.out.println("----------------");

        three = new TwoPlugAdapterExtends();
        nb = new NoteBook(three);
        nb.charge();

    }
}
