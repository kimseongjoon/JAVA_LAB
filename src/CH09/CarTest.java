package CH09;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("===AI자동차===");
        Car myCar = new AICar();
        myCar.run();
        System.out.println("===수동자동차===");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
