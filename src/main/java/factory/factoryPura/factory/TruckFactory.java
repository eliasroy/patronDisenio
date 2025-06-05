package factory.factoryPura.factory;

import factory.factoryPura.Vihicle;
import factory.factoryPura.models.Truck;

public class TruckFactory extends VehicleFactory {

    @Override
    public Vihicle createVehicle() {
        return new Truck();
    }
}
