package memento;

import java.util.Stack;

/**
 * @description 备忘录管理类
 */
public class MementoManager {
    // 记录备忘录信息
    private Stack<Memento> mementoStack = new Stack<>();

    // 保存备忘录
    public void save(Document document) {
        Memento memento = new Memento(document.getContent());
        mementoStack.add(memento);
    }

    // 撤销操作ctrl+z
    public Document cancel() {
        Memento memento = mementoStack.pop();
        Document document = new Document();
        document.setContent(memento.getContent());
        return document;
    }
}
