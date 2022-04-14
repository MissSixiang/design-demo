package template;

/**
 * @description
 * @author: yianmou
 **/
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("-----------开始冲泡茶叶-----------");
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("-----------开始冲泡咖啡-----------");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
