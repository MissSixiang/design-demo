package proxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("-----RealSubject 开始执行业务操作-----");
    }
}
