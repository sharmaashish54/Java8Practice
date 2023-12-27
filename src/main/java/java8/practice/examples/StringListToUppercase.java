package java8.practice.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListToUppercase {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("ashish","shamra","addreSS");
		
		stringList = stringList.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(stringList);
		
		stringList.replaceAll(String::toUpperCase);
		System.out.println(stringList);
	}

}
