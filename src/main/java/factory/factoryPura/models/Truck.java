package factory.factoryPura.models;


import factory.factoryPura.Vihicle;

public class Truck implements Vihicle {
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}
