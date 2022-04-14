package memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description 文档类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    // 文档的内容
    private String content;

    public void print() {
        System.out.println("content=" + content);
    }
}
