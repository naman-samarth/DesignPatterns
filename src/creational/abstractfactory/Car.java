package creational.abstractfactory;

public abstract class Car {
    private CarType model;
    private Location location;

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    // getters and setters

    protected abstract void construct();
}
