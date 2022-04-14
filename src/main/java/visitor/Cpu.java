package visitor;

/**
 * @description CPU
 * @author: yianmou
 **/
public class Cpu implements ComputerComponent {
    // 全国标准售价
    public int price = 100;

    @Override
    public int price() {
        return 100;
    }

    @Override
    public String version() {
        return "v1";
    }

    @Override
    public String desc() {
        return "英特尔CPU";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorCpu(this);
    }
}
