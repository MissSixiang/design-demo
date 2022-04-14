package proxy;

public class Proxy implements Subject{

    // 被代理的对象
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        beforeProcessor();
        subject.request();
        afterProcessor();
    }

    private void beforeProcessor() {
        System.out.println("-----Proxy before processor-----");
    }

    private void afterProcessor() {
        System.out.println("-----Proxy after processor-----");
    }
}
