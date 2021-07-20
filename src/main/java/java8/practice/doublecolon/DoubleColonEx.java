package java8.practice.doublecolon;

import java8.practice.functionalinterface.FunctionalInterfaceEx;

//Used for method reference or constructor reference 
//it can replace lambda expression to have code reusability
public class DoubleColonEx {

	public static void method1() {
		System.out.println("This can be called with double colon");
	}

	public void method2() {
		System.out.println("This also can be called with double colon");
	}

	public static void main(String[] args) {

		// Refer method1 implementation to functional interface method()- this is method
		// reference
		// If we have implementation of abstract method of our Functional interface we
		// can go for memthod reference else lambda expression
		FunctionalInterfaceEx ob = DoubleColonEx::method1;// static method, left end side should be functional interface
		ob.method();

		FunctionalInterfaceEx ob2 = new DoubleColonEx()::method2;// non static method
		ob2.method();

	}

}
