package org.tns.acc.c2tc.interfacedemo;

public class VehicleMain {
	 public static void main(String[] args) {

	        Vehicle1 car = new Cars("KIA");
	        Vehicle1 bike = new Bike1("Royal Enfield");

	        car.start();
	        car.stop();

	        bike.start();
	        bike.stop();

	        System.out.println("Maximum speed of vehicles: " + Vehicle1.MAX_SPEED);
	    }
	}

