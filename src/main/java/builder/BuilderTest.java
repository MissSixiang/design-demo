package builder;

public class BuilderTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Car audiR8 = worker.createR8Car();
        Car audiA4L = worker.createA4LCar();
        Car commonBMW = worker.createCommonBMW();

        System.out.println("audiR8=" + audiR8);
        System.out.println("audiA4L=" + audiA4L);
        System.out.println("commonBMW=" + commonBMW);
    }
}
