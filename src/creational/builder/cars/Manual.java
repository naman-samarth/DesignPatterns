package creational.builder.cars;

import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

/**
 * Car Manual is another product. Note that it does not have the same ancestor as
 * a Car. They are not related.
 */
public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType,
                  int seats,
                  Engine engine,
                  Transmission transmission,
                  TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type of car: ").append(carType).append("\n");
        sb.append("Count of seats: ").append(seats).append("\n");
        sb.append("Engine: volume - ").append(engine.getVolume())
                .append("; mileage - ").append(engine.getMileage()).append("\n");
        sb.append("Transmission: ").append(transmission).append("\n");
        if (this.tripComputer != null) {
            sb.append("Trip Computer: Functional\n");
        } else {
            sb.append("Trip Computer: N/A\n");
        }
        if (this.gpsNavigator != null) {
            sb.append("GPS Navigator: Functional\n");
        } else {
            sb.append("GPS Navigator: N/A\n");
        }
        return sb.toString();
    }
}
