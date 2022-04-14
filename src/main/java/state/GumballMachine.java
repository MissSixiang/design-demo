package state;

import lombok.Data;

/**
 * 糖果售卖机
 */
@Data
public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State state = soldOutState; // 糖果机默认状态为售罄状态
    int count = 0; // 糖果库存量

    public GumballMachine(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState; // 如果采购了糖果球（numberGumballs>0），则糖果机的状态为未投币状态
        }
    }

    // 投入钱币
    public void insertQuarter() {
        state.insertQuarter();
    }

    // 退出钱币
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // 扭转曲柄
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    // 减少库存
    public void releaseBall() {
        if (count > 0) {
            System.out.println("一个糖果球正在出库");
            --count;
        } else {
            System.out.println("库存不足，一个糖果球无法出库");
        }
    }

    // 设置状态
    void setState(State state) {
        this.state = state;
    }
}
