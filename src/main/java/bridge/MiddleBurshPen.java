package bridge;

/**
 * 中毛笔实现类
 */
public class MiddleBurshPen extends BrushPenAbstraction {
    @Override
    public void draw() {
        System.out.println("Middle and " + color.getColor() + " drawing!");
    }
}
