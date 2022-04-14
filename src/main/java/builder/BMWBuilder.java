package builder;

public class BMWBuilder implements Builder{

    private static Car car = new Car("BMW普通的发动机",
            "BMW普通标准的齿轮",
            "BMW普通标准的车门",
            "BMW普通标准的轮胎");

    @Override
    public Builder initalEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder initalGear(String gear) {
        car.setGear(gear);
        return this;
    }

    @Override
    public Builder initalDoor(String door) {
        car.setDoor(door);
        return this;
    }

    @Override
    public Builder initailWheel(String wheel) {
        car.setWheel(wheel);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
