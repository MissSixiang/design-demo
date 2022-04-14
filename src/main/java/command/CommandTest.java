package command;

/**
 * @description
 * @author: yianmou
 **/
public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteController controller = new RemoteController();
        controller.addCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        // 按下遥控器，第一排的ON按钮
        controller.pushOnButton(0);
        // 按下遥控器，第一排的OFF按钮
        controller.pushOffButton(0);
    }
}
