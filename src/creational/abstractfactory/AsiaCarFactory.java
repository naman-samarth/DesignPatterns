package creational.abstractfactory;

public class AsiaCarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SPORTS:
                car = new SportsCar(Location.ASIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            default:
        }
        return car;
    }
}
