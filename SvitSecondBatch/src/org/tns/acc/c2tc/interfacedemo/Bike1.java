package org.tns.acc.c2tc.interfacedemo;

public class Bike1 implements Vehicle1 {

    private String type;

    public Bike1(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Bike " + type + " is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + type + " is stopping");
    } 

}
