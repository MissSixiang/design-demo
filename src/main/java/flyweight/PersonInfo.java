package flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 人员信息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonInfo {

    // 姓名
    private String name;

    // 居住的详细地址
    private String address;

    // 核酸医院或网点唯一标识
    private Integer nucleicId;
}
