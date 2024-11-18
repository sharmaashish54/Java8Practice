package java8.practice.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Find the Minimum value element in an Array
		int []intArray = {10,13,8,4, 19,12};
		OptionalInt minOptional = Arrays.stream(intArray).min();
		int min = minOptional.isPresent()?minOptional.getAsInt():0;
		System.out.println("Minimum of array is : "+min);
		
		
		
	}

}
