package org.tns.acc.c2tc.interfacedemo;

public class Cars implements Vehicle1 {

    private String model;

    public Cars(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " is stopping");
    } 
}
