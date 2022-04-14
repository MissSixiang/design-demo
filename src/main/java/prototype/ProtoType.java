package prototype;

/**
 * @description
 * @author: yianmou
 */
public class ProtoType implements Cloneable {
    public static void main(String[] args) {
        ProtoType protoType = new ProtoType();
        System.out.println(protoType);

    }

    public ProtoType() {
        System.out.println("-----Prototype的构造方法被执行了！-----");
    }

    /**
     * 通过clone创建的类不会执行构造方法
     * @return: yianmou
     */
    protected ProtoType clone() {

        try {
            return (ProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
