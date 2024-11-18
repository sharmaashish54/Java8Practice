package java8.practice.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ArrayMax {
	
	public static void main(String []args) {
		
		int []intArray = {20,30,29,9,2,3,4};
		int max = 0;
		
		for(int i =0;i<intArray.length;i++) {
			if(max<intArray[i]) {
				max = intArray[i];
			}
		}
		
		System.out.println("Max element in array is : "+max);
		
		
		OptionalInt maxOptional = Arrays.stream(intArray).max();
		if(maxOptional.isPresent()) {
			System.out.println("java 8 -Max element in array is : "+maxOptional.getAsInt());
		}else {
			System.out.println("Array is Empty");
		}
		
	}
}