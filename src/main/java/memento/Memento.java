package memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description 备忘录
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Memento {

    // 文档内容
    public String content;
}
