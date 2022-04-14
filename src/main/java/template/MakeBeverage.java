package template;

/**
 * @description 饮品制作类
 * @author: yianmou
 **/
public abstract class MakeBeverage {

    // 准备食谱（防止子类覆盖这个方法）
    final void prepareRecipe() {
        /** 第一步：把水煮沸 */
        boilWater();
        /** 第二步：酿造饮品 */
        brew();
        /** 第三步：把饮品倒入杯子中 */
        pourInCup();
        /** 第四步：往饮品中增加调味品 */
        addCondiments();
    }

    // 酿造
    abstract void brew();

    // 往饮品中增加调味品
    abstract void addCondiments();

    protected void boilWater() {
        System.out.println("把水煮沸");
    }

    private void pourInCup() {
        System.out.println("把饮品倒入杯子中");
    }
}
