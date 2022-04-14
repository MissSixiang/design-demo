package visitor;

/**
 * @description 学生用户（有学生计划活动，打少量折扣）
 * @author: yianmou
 **/
public class StudentVisitor implements Visitor {
    // 总售价
    public int totalPrice;

    @Override
    public void visitorCpu(Cpu cpu) {
        totalPrice += cpu.price() * 0.8;
    }

    @Override
    public void visitorMemory(Memory memory) {
        totalPrice += memory.price() * 0.9;
    }

    @Override
    public int price() {
        return totalPrice;
    }

    @Override
    public String visiterName() {
        return "学生用户";
    }
}
