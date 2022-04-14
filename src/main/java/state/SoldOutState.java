package state;

/**
 * 糖果售卖状态类
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已经售罄。不能投入钱币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退回钱币成功！");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已经售罄。不能扭转曲柄！");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已经售罄。糖果无法出售！");
    }
}
