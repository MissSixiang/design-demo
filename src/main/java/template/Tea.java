package template;

/**
 * @description
 * @author: yianmou
 **/
public class Tea extends MakeBeverage {

    @Override
    protected void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("往茶叶中添加柠檬");
    }
}
