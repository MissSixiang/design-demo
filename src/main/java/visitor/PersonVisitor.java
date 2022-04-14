package visitor;

/**
 * @description 个人用户（不打折）
 * @author: yianmou
 **/
public class PersonVisitor implements Visitor {

    // 总售价
    public int totalPrice;

    @Override
    public void visitorCpu(Cpu cpu) {
        totalPrice += cpu.price();
    }

    @Override
    public void visitorMemory(Memory memory) {
        totalPrice += memory.price();
    }

    @Override
    public int price() {
        return totalPrice;
    }

    @Override
    public String visiterName() {
        return "个人用户";
    }
}
