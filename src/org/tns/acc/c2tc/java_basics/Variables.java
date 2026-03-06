package org.tns.acc.c2tc.java_basics;

public class Variables {



	int a = 10;
	void print() {
		String msg = "hello world";
		System.out.println(msg);
	}
	static String message = "hello students";

	public static void main(String[] args) {
		Variables obj = new Variables();
		System.out.println("the value of a :"+ obj.a);
		obj.print();
		System.out.print(message);
		

	}


}
