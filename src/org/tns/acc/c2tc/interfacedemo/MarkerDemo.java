package org.tns.acc.c2tc.interfacedemo;

public class MarkerDemo {

	 public static void main(String[] args) {

	        Registerable s = new Student(101, "Neha", 12000, "Java");

	        if (s instanceof Registerable) {
	            System.out.println("Student is registered for the course");
	        } else {
	            System.out.println("Student is not registered");
	        }
	    }
	}

