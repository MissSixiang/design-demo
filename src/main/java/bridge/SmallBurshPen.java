package bridge;

/**
 * 细毛笔实现类
 */
public class SmallBurshPen extends BrushPenAbstraction {
    @Override
    public void draw() {
        System.out.println("Small and " + color.getColor() + " drawing!");
    }
}
