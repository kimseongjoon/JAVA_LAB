package CH12;

import java.util.HashMap;

public class CarFactory {
    private static HashMap<String, Car> carHashMaps;
    private static CarFactory carFactory = new CarFactory();

    public CarFactory() {
        carHashMaps = new HashMap<>();
    }

    public static CarFactory getInstance() {
        return carFactory;
    }

    protected static Car createCar(String carName) {
        if (carHashMaps.containsKey(carName)) {
            return carHashMaps.get(carName);
        }

        Car car = new Car(carName);

        carHashMaps.put(carName, car);

        return car;
    }
}
