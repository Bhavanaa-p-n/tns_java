package org.tns.acc.c2tc.interfacedemo;

interface Vehicle
{
	void start();
	void stop();

	int Max_speed=120;

}

class Car5 implements Vehicle1 
{
   private String model;
   
   
   
	public Car5(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("car" + model +" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("car" + model +" is stoping ");
	}
	
}

class Bike implements Vehicle1
{
   private String type;
   
   
   
	public Bike(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("car" +type+" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("car" + type+" is stoping ");
	}
	
}


public class InterfaceDemo2 {

	public static void main(String[] args) {
		Vehicle1 car=new Car5("KIA");
		Vehicle1 bike=new Bike("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("maximun speed of vehicles" +"     " +  Vehicle1.Max_speed );
		
	}

}
