package creational.abstractfactory;

public class SportsCar extends Car {
    public SportsCar(Location location) {
        super(CarType.SPORTS, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Sports car");
        // add accessories
    }
}
