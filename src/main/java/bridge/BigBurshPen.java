package bridge;

/**
 * 粗毛笔实现类
 */
public class BigBurshPen extends BrushPenAbstraction {
    @Override
    public void draw() {
        System.out.println("Big and " + color.getColor() + " drawing!");
    }
}
