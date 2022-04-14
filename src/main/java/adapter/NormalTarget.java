package adapter;

/**
 * @description 正常的符合Target接入标准的类
 * @author: yianmou
 **/
public class NormalTarget implements Target {
    public void prepare() {
        System.out.println("NormalTarget prepare()");
    }

    public void execute() {
        System.out.println("NormalTarget execute()");
    }
}
