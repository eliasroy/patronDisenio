package factory.factoryPura.factory;

import factory.factoryPura.Vihicle;
import factory.factoryPura.models.Car;

public class CarFactory extends VehicleFactory {

    @Override
    public Vihicle createVehicle() {
        return new Car();
    }

}
