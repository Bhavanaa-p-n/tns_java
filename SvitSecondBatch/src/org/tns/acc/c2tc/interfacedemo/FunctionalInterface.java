package org.tns.acc.c2tc.interfacedemo;

class GreetingsImp implements InterfaceDemo3 {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + " !");
    }
}

public class FunctionalInterface {

	 public static void main(String[] args) {

	        InterfaceDemo3 obj = new GreetingsImp();
	        obj.sayHello("Vishu");
	    }
	}