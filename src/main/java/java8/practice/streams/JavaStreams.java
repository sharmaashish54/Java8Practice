package java8.practice.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {

		// Map takes argument as function , public interface Function<T, R> { … },
		// recieves one value and returns another
		
		Stream.of("JavaScript", "Java", "Python").filter(x -> x.contains("J")).map(String::toUpperCase)
				.forEach(System.out::println);
		
		//Another example of function 
		Map<String, Integer> nameMap = new HashMap<>();
		//map.computeIfAbsent(key, k -> new Value(f(k)));
		Integer value1 = nameMap.computeIfAbsent("John", s -> s.length());
		System.out.println(value1);
		//use :: in place of lambda
		Integer value2 = nameMap.computeIfAbsent("John", String::length);
		System.out.println(value2);
		
		List<Integer> list1 = new ArrayList<Integer>(4);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		System.out.println("list 1 :" + list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2 = list1.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("list 2 :" + list2);

		int sumOfAllElements = list2.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("sumOfAllElements" + sumOfAllElements);

		Set<Integer> set = new HashSet<>();
		set = list2.stream().filter(x -> (x % 3 == 0)).collect(Collectors.toSet());
		System.out.println("set :" + set);

		set = list2.stream().filter(x -> (x % 6 == 0)).collect(Collectors.toSet());
		System.out.println("set :" + set);

		List<String> languageList = new ArrayList<String>();
		languageList.add("Java");
		languageList.add("Ansible");
		languageList.add("Groovy");
		languageList.add("Unix");

		System.out.println("Unsorted list" + languageList);
		// Sorting
		List<String> languageSortedList = languageList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list" + languageSortedList);

		// Iterate over collection
		languageSortedList.stream().forEach(y -> System.out.println("element :" + y));
	}

}
