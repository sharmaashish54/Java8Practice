package java8.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* Predicate:
Represents a function that takes in an argument of a certain type and returns a boolean result. It has a single abstract method called test().
Example: Predicate<T>

Function:
Represents a function that takes in an argument of one type and produces a result of another type. It has a single abstract method called apply().
Example: Function<T, R>

Consumer:
Represents an operation that takes in an argument of a certain type and performs an action without returning any result. It has a single abstract method called accept().
Example: Consumer<T>

Supplier:
Represents a supplier of results. It does not take any argument and produces a result of a certain type. It has a single abstract method called get().
Example: Supplier<T>

BiPredicate:
Represents a function that takes in two arguments of certain types and returns a boolean result. It has a single abstract method called test().
Example: BiPredicate<T, U>

BiFunction:
Represents a function that takes in two arguments of certain types and produces a result of another type. It has a single abstract method called apply().
Example: BiFunction<T, U, R>

BiConsumer:
Represents an operation that takes in two arguments of certain types and performs an action without returning any result. It has a single abstract method called accept().
Example: BiConsumer<T, U>*/

public class StreamObject {

	public static void main(String[] args) {

		Stream<Object> s1 = Stream.empty();
		s1.forEach(e -> {
			System.out.println("e" + e);
		});

		String names[] = { "Ashish", "Sharma", "Shefali", "Mysha", "Kiara" };
		System.out.println(Stream.of(names).filter(e -> e.startsWith("S")).collect(Collectors.toList()));
		// Filter takes Predicate functional interface which produces output of boolean
		// type.(method test())
		//Stream s2 = Stream.builder().build();

		IntStream s3 = Arrays.stream(new int[] { 2, 3, 4, 54, 764, 786 });

		s3.forEach(e -> System.out.println(e + " "));

		List<Integer> s4 = List.of(48,60,12, 13, 98, 767, 786);
		System.out.println(s4.stream().map(e -> e * e).collect(Collectors.toList()));
		// map takes Function functional interface which takes input of one type and
		// produces output of another type.method(apply()).
		
		s4.stream().forEach(System.out::println);//method reference
		s4.stream().sorted().forEach(System.out::println);
		
		List<Integer> s5 = List.of(5);
		
		System.out.println("max number is :"+s5.stream().max((x,y)->x.compareTo(y)).get());
		
		System.out.println("min number is :"+s4.stream().min((x,y)->x.compareTo(y)).get());
		System.out.println("max number is :"+s4.stream().max((x,y)->x.compareTo(y)).get());
		
	}

}
