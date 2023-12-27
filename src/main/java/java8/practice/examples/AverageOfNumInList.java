package java8.practice.examples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumInList {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,3,4,11,23);
		OptionalDouble d = numList.stream().mapToDouble(s->s).average();
		System.out.print(d);
		
	}

}
