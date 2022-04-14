package builder;

public interface Builder {
    // 安装引擎
    Builder initalEngine(String engine);

    // 安装齿轮
    Builder initalGear(String gear);

    // 安装车门
    Builder initalDoor(String door);

    // 安装轮胎
    Builder initailWheel(String wheel);

    // 获得构建后的汽车
    Car getCar();
}
