package java8.practice.examples;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllEvenList {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=1;i<100;i++) {
			myList.add(i);
		}
		
		int sum = myList.stream().filter(num -> num%2 == 0).mapToInt(Integer::intValue).sum();
		System.out.print(sum);

	}

}
