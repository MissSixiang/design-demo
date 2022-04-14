package state;

/**
 * 状态模式测试类
 */
public class StateTest {
    public static void main(String[] args) {
        System.out.println("-----向糖果机中放入1枚糖果-----");
        GumballMachine machine = new GumballMachine(1);

        System.out.println("-----第一次购买糖果-----");
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println("-----第二次购买糖果-----");
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("-----第三次购买糖果-----");
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();
    }
}
