package composite;

import lombok.AllArgsConstructor;

/**
 * 职员类
 */
@AllArgsConstructor
public abstract class AbstractCorp {

    // 职员姓名
    private String name = "";

    // 职员的职位
    private String position = "";

    // 职员的薪水
    private int salary = 0;

    // 获得职员信息
    public String getCorpInfo() {
        return String.format("姓名:%s 职位:%s 薪水:%d", name, position, salary);
    }
}
