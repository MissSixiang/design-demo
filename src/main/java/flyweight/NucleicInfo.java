package flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 核酸医院和网点信息信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NucleicInfo {
    // 唯一标识
    private Integer id;

    // 核酸医院网点名称
    private String name;
}
