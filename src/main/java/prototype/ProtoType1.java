package prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProtoType1 implements Cloneable{
    private String name;

    private List<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ProtoType1 prototype1 = new ProtoType1();
        prototype1.setName("orign object");
        prototype1.setValue("orign object");

        ProtoType1 clonePrototype1 = prototype1.clone();
        clonePrototype1.setName("clone object");
        /** 发现添加了执行了clone对象的setValue之后，也修改了prototype1中的arrayList中数据 */
        clonePrototype1.setValue("clone object");
        System.out.println(prototype1);
        System.out.println(clonePrototype1);
    }
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    /**
     * 浅拷贝
     * @return
     */
    @Override
    protected ProtoType1 clone() {
        try {
            return (ProtoType1)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深拷贝
     * @return
     */
//    @Override
//    protected Prototype1 clone() {
//        Prototype1 prototype1 = null;
//        try {
//            prototype1 = (Prototype1)super.clone();
//            prototype1.setArrayList(new ArrayList<>());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return prototype1;
//    }

}
