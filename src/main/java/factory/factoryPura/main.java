package factory.factoryPura;

import factory.factoryPura.factory.CarFactory;

public class main {
    public static void main(String[] args) {
        Vihicle car = new CarFactory().createVehicle();
        if (car != null) {
            car.start();
            car.drive();
            car.stop();
        } else {
            System.out.println("Vehicle type not recognized.");
        }
    }
}
