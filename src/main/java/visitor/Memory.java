package visitor;

/**
 * @description 内存
 * @author: yianmou
 **/
public class Memory implements ComputerComponent {
    // 全国标准售价
    public int price = 400;

    @Override
    public int price() {
        return price;
    }

    @Override
    public String version() {
        return "v4";
    }

    @Override
    public String desc() {
        return "金士顿内存";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorMemory(this);
    }
}
