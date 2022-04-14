package command;

/**
 * @description
 * @author: yianmou
 **/
public class NoCommand implements Command {
    public void execute() {
        System.out.println("Doing nothing!");
    }
}
