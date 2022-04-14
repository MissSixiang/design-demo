package mediator;

/**
 * 采购功能
 */
public class Purchase extends AbstractColleague {

    public Purchase(Mediator mediator) {
        super(mediator);
    }

    /** 采购电脑 */
    public void buyComputer(int num) {
        System.out.println();
        super.mediator.purchaseByComputer(num);
    }

    /** 不再采购电脑 */
    public void refuseBuyComputer() {
        System.out.println("不再采购电脑！");
    }
}
