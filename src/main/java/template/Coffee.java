package template;

/**
 * @description
 * @author: yianmou
 **/
public class Coffee extends MakeBeverage {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("往咖啡中添加糖和牛奶");
    }
}
