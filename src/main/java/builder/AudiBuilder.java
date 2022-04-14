package builder;

public class AudiBuilder implements Builder{
    private Car car;

    public AudiBuilder() {
        car = new Car("Audi普通的发动机",
                "Audi普通标准的齿轮",
                "Audi普通标准的车门",
                "Audi普通标准的轮胎");
    }

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
