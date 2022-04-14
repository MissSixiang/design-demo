package visitor;

/**
 * @description 访问者接口
 * @author: yianmou
 **/
public interface Visitor {

    void visitorCpu(Cpu cpu);

    void visitorMemory(Memory memory);

    int price();

    String visiterName();

}
