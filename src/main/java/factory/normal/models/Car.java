package factory.normal.models;

import factory.normal.Vihicle;

public class Car implements Vihicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
