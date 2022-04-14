package command;

/**
 * @description 遥控器
 * @author: yianmou
 **/
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController() {
        onCommands = new Command[8];
        offCommands = new Command[8];

        for (int i = 0; i < 8; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /** 往遥控器中添加命令 */
    public void addCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /** 按遥控器中某个开启键 */
    public void pushOnButton(int slot) {
        onCommands[slot].execute();
    }

    /** 按遥控器中某个关闭键 */
    public void pushOffButton(int slot) {
        offCommands[slot].execute();
    }
}
