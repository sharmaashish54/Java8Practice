package java8.practice.lambda;

import java8.practice.functionalinterface.FunctionalInterfaceEx;
import java8.practice.functionalinterface.FunctionalInterfaceEx2;

public class LambdaExample {

	public static void main(String[] args) {
		/*
		 * Usage of lambda function with functional interface by giving the
		 * defination here for method()
		 */ 
		FunctionalInterfaceEx ex = () -> System.out.println("This is lambda function");
		ex.method();
		
		/*
		 * There is no need to specify type , it will understand by itself what type
		 * is matching
		 */		
		FunctionalInterfaceEx2 ex2 = (a, b) -> System.out.println("sum is "+(a+b));
		ex2.sum(50, 98);
	}

}
