package memento;

/**
 * 备忘录测试类
 */
public class MementoTest {
    public static void main(String[] args) {
        MementoManager mementoManager = new MementoManager();
        System.out.println("-----执行文档修改操作-----");
        Document document = new Document();
        document.setContent("a");
        document.print();
        mementoManager.save(document);

        document.setContent("b");
        document.print();
        mementoManager.save(document);

        document.setContent("c"); // 修改后，发现写错了，想要回撤到上一个保存点
        document.print();

        System.out.println("-----执行第一次撤销操作-----");
        document = mementoManager.cancel();
        document.print();

        System.out.println("-----执行第二次撤销操作-----");
        document = mementoManager.cancel();
        document.print();
    }
}
