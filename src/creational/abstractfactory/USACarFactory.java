package creational.abstractfactory;

public class USACarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SPORTS:
                car = new SportsCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            default:
        }
        return car;
    }
}
