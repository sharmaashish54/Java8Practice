package java8.practice.lambda;

import java.util.function.BiConsumer;

import java8.practice.functionalinterface.FunctionalInterfaceEx;
import java8.practice.functionalinterface.FunctionalInterfaceEx2;

public class LambdaExample {

	public static void main(String[] args) {
		/*
		 * Usage of lambda function with functional interface by giving the defination
		 * here for method() functional interface is return type of lambda expression
		 */
		FunctionalInterfaceEx ex = () -> System.out.println("This is lambda function");
		ex.method();

		/*
		 * There is no need to specify type , it will understand by itself what type is
		 * matching - type Inference
		 */
		FunctionalInterfaceEx2 ex2 = (a, b) -> System.out.println("sum is " + (a + b));
		ex2.sum(50, 98);
		
		
		BiConsumer<Integer,Integer> biconsumer = (a,b)-> System.out.println(a+b);
		biconsumer.accept(40, 50);
	}

}
