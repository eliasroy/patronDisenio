package factory.normal;

import factory.normal.Factory.VehicleFactory;

public class main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vihicle car = vehicleFactory.createVehicle("car");
        if (car != null) {
            car.start();
            car.drive();
            car.stop();
        } else {
            System.out.println("Vehicle type not recognized.");
        }
        Vihicle motocicle = vehicleFactory.createVehicle("motocicle");
        if (motocicle != null) {
            motocicle.start();
            motocicle.drive();
            motocicle.stop();
        } else {
            System.out.println("Vehicle type not recognized.");
        }
        Vihicle plane = vehicleFactory.createVehicle("plane");
        if (plane != null) {
            plane.start();
            plane.drive();
            plane.stop();
        } else {
            System.out.println("Vehicle type not recognized.");
        }
    }
}
