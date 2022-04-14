package builder;

public class Worker {


    Car createA4LCar() {
        return new AudiBuilder().initalEngine("Audi的4缸发动机").initalGear("6速双离合变速箱").getCar();
    }

    Car createR8Car() {
        return new AudiBuilder().initalEngine("16缸跑车引擎").initalDoor("碳纤维轻量级车门").initalGear("7档湿式双离合变速箱").
                initailWheel("米其林Top2竞速级轮胎").getCar();
    }

    Car createCommonBMW() {
        return new BMWBuilder().getCar();
    }
}
