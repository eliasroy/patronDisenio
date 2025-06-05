package factory.normal.models;

import factory.normal.Vihicle;

public class Motocicle implements Vihicle {
    @Override
    public void start() {
        System.out.println("Motocicle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motocicle is stopping");
    }

    @Override
    public void drive() {
        System.out.println("Motocicle is driving");
    }
}
