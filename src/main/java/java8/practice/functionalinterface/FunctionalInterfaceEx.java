package java8.practice.functionalinterface;

/*This interface can be called as functional interface
 *  since it can have only one abstract method i.e. 
 *  there is no body only declaration while this 
 *  interface can have n number of static and default methods
 *  Using Functional interface methods can now be passed as 
 *  arguments with java8
 *  functional interface is return type of lambda expression*/

@FunctionalInterface
public interface FunctionalInterfaceEx {

	public void method();

	public static void staticMethod() {
		System.out.println("Hello i am Static method");
	}
	
	default void method2() {
		System.out.println("This is default method");
	}
}
