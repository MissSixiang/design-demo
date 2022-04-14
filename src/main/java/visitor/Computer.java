package visitor;

/**
 * @description 电脑类
 * @author: yianmou
 **/
public class Computer {
    private ComputerComponent memory;
    private ComputerComponent cpu;

    public Computer() {
        memory = new Memory();
        cpu = new Cpu();
    }

    /**
     * 攒机方法
     *
     * @Visitor 买电脑的客户角色
     */
    public void buildComputer(Visitor visitor) {
        // 买cpu
        cpu.accept(visitor);
        // 买内存
        memory.accept(visitor);
    }

}