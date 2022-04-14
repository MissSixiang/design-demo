package composite;

/**
 * 基层员工（即：叶子节点职员）
 */
public class LeafCorp extends AbstractCorp {

    public LeafCorp(String name, String position, int salary) {
        super(name, position, salary);
    }
}
