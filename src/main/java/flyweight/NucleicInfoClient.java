package flyweight;

import java.util.HashMap;

/**
 * 核酸医院和网点信息客户端类
 */
public class NucleicInfoClient {
    // 存储核酸医院和网点的pool
    private HashMap<Integer, NucleicInfo> pool = new HashMap<>();

    // 构造函数中初始化池中数据
    public NucleicInfoClient() {
        NucleicInfo nucleicInfo;
        for (int i = 1; i <=10; i++) {
            nucleicInfo = new NucleicInfo(i, "北京市第"+i+"医院核酸网点");
            pool.put(nucleicInfo.getId(), nucleicInfo);
        }
    }

    public NucleicInfo getNucleicInfo(Integer key) {
        if (key == null || !pool.containsKey(key)) {
            return null;
        }
        return pool.get(key);
    }
}
