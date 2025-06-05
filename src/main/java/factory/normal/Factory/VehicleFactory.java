package factory.normal.Factory;

import factory.normal.*;
import factory.normal.models.Car;
import factory.normal.models.Motocicle;
import factory.normal.models.Plane;
import factory.normal.models.Truck;

public class VehicleFactory {

    public Vihicle createVehicle(String type) {
        if (type.equalsIgnoreCase(typeVehicle.CAR.toString())) {
            return new Car();
        }
        if (type.equalsIgnoreCase(typeVehicle.TRUCK.name())) {
            return new Motocicle();
        }
        if (type.equalsIgnoreCase("plane")) {
            return new Plane();
        }
        if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        return null;
    }
}
