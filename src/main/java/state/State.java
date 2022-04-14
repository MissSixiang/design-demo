package state;

/**
 * 状态接口类
 */
public interface State {

    // 投入硬币操作
    void insertQuarter();

    // 退出硬币操作
    void ejectQuarter();

    // 扭转曲柄操作
    void turnCrank();

    // 发放糖果操作
    void dispense();
}
