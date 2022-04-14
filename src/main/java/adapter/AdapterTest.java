package adapter;

/**
 * @description
 * @author: yianmou
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("------------NormalTarget------------");
        client.setTarget(new NormalTarget());
        client.work();

        System.out.println("------------Adaptee------------");
        client.setTarget(new Adapter(new Adaptee())); // 适配器转换
        client.work();
    }
}
