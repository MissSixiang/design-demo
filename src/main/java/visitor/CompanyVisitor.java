package visitor;

/**
 * @description 公司大客户（因为采购量很大，所以折扣粒度很大）
 * @author: yianmou
 **/
public class CompanyVisitor implements Visitor {
    // 总售价
    public int totalPrice;

    @Override
    public void visitorCpu(Cpu cpu) {
        totalPrice += cpu.price() * 0.5;
    }

    @Override
    public void visitorMemory(Memory memory) {
        totalPrice += memory.price() * 0.4;
    }

    @Override
    public int price() {
        return totalPrice;
    }

    @Override
    public String visiterName() {
        return "公司大客户";
    }
}
