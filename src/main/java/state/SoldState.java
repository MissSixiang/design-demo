package state;

/**
 * 糖果售卖状态类
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果正在出货中，请稍等。无须再次投入钱币！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果正在出货中，请稍等。不能退回钱币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果正在出货中，请稍等。不需要再次扭转曲柄！");
    }

    @Override
    public void dispense() {
        if (gumballMachine.getCount() > 0) {
            System.out.println("糖果正在出货中，请稍等！");
            gumballMachine.releaseBall();
            gumballMachine.setState(gumballMachine.getNoQuarterState()); // 状态流转
        } else {
            System.out.println("糖果库存不足，无法出货！");
            gumballMachine.setState(gumballMachine.getSoldOutState()); // 状态流转
        }
    }
}
