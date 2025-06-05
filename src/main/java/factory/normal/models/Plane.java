package factory.normal.models;

import factory.normal.Vihicle;

public class Plane implements Vihicle {
    @Override
    public void start() {
        System.out.println("Plane is starting");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping");
    }

    @Override
    public void drive() {
        System.out.println("Plane is flying");
    }

    public void fly() {
        System.out.println("Plane is taking off");
    }
}
