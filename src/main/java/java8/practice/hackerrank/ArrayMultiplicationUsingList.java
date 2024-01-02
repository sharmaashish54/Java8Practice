package java8.practice.hackerrank;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//Multiply the elements in an array using java 8 features- reduce

public class ArrayMultiplicationUsingList {

	public static void main(String[] args) {
		//Integer[] intArray = {1,2,3,4,5};
		
		//List<Integer> intList = Arrays.asList(intArray);
		List<Integer> range = IntStream.rangeClosed(1,15)
					    .boxed().collect(Collectors.toList());
		System.out.println(range);
		Optional<Integer> multiply = range.stream().reduce((a,b)->a*b);
		if(multiply.isPresent()){
			System.out.println(multiply.get());
		}else {
			System.out.println("nothing");
		}
		
	}

}
