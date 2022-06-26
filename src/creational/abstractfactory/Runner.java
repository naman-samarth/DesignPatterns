package creational.abstractfactory;

public class Runner {
    public static void main(String[] args) {
        CarFactory.buildCar(CarType.SPORTS);
        CarFactory.buildCar(CarType.LUXURY);
    }
}
