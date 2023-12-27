package java8.practice.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8.practice.hackerrank.model.Person;

public class StreamsPersonExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 35),
                new Person("Ashish", 35),
                new Person("eztech", 25)
                
        );
		
		List<Integer> myList = Arrays.asList(11, 12, 12, 14, 15);
		System.out.println(
				myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
						.stream().filter(x -> x.getValue() > 1).map(x->x.getKey()).collect(Collectors.toList()));

//		myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
//				.stream().filter(x -> x.getValue() > 1).map(Integer::x.getKey()).collect(Collectors.tosList());
		 // Filtering: Get people older than 25
		System.out.println(people.stream().filter(p-> p.getAge()>25).toList());
		
		// Mapping: Get names of people
		people.stream().map(p -> p.getName()).forEach(System.out::println);
		//people.stream().map(Person::getName).forEach(System.out::println);
		
		// Reduction: Get the average age of people
		System.out.println(people.stream().mapToDouble(Person::getAge).average().orElse(.0));
		
		 // Sorting: Sort people by age in ascending order
		System.out.println(people.stream().sorted(Comparator.comparing(Person::getAge)).toList());
		Map<Integer, List<Person>> personMap = people.stream().collect(Collectors.groupingBy(Person::getAge));
		personMap.forEach((k,v)->System.out.println("Age: "+k+" Person Name: "+v));
	}

}
