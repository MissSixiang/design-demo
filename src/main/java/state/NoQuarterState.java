package state;

/**
 * 没有投放钱币状态类
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入钱币成功！");
        gumballMachine.setState(gumballMachine.getHasQuarterState()); // 状态流转
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你还没有投入钱币，不能退回钱币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("你还没有投入钱币，不能扭转曲柄！");
    }

    @Override
    public void dispense() {
        System.out.println("你还没有投入钱币，糖果不可以发放！");
    }
}
