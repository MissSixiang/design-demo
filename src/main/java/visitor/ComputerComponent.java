package visitor;

/**
 * @description 电脑组件
 * @author: yianmou
 **/
public interface ComputerComponent {

    // 售价
    int price();

    // 硬件版本
    String version();

    // 描述
    String desc();

    void accept(Visitor visitor);

}
