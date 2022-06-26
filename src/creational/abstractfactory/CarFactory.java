package creational.abstractfactory;

public class CarFactory {
    private CarFactory() {}

    public static Car buildCar(CarType type) {
        Car car = null;
        Location location = Location.valueOf(System.getProperty("location.info"));

        switch (location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
        }
        return car;
    }
}
