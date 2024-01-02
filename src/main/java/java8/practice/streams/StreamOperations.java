package java8.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

		System.out.println(myList.stream().filter(e->e%2==0).collect(Collectors.toList())); 

        //Square of each element of list
		System.out.println(myList.stream().map(e->e*e).collect(Collectors.toList()));
        //filter out list of items >2
		System.out.println(myList.stream().filter(i->(i>2)).collect(Collectors.toList()));
        //average of list items
        System.out.println(myList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
        System.out.println(myList.stream().sorted().collect(Collectors.toList()));

        //Write a convert a list of strings to uppercase or lowercase using streams.

        List<String> strList = Arrays.asList("ashish","Sharma", "Shefali", "sharMa");

        strList.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());

        //Write a calculate the sum of all even, odd numbers in a list using streams
        System.out.println(myList.stream().filter(e->(e%2==0)).mapToInt(Integer::intValue).sum());
        System.out.println(myList.stream().filter(e->(e%2!=0)).mapToInt(Integer::intValue).sum());


        //remove all duplicate elements from a list using streams.
        Set<Integer> mySet = new HashSet<>();
        myList.stream().forEach(e -> {if(!mySet.contains(e)){mySet.add(e);}});
        System.out.println(mySet);

        List < Integer > distinctNumbers = myList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);

        //count the number of strings in a list that start with a specific letter
        System.out.println(strList.stream().filter(e-> e.startsWith("S")).count());
        //sort a list of strings in alphabetical order, ascending and descending using streams.
        List < String > ascendingOrder = strList.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);
        List < String > descendingOrder = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingOrder);

        //find the maximum and minimum values in a list of integers using streams.
        System.out.println(myList.stream().mapToInt(Integer::intValue).max().orElse(0));
        System.out.println(myList.stream().mapToInt(Integer::intValue).min().orElse(0));

        //find the second smallest and largest elements in a list of integers using streams.
        System.out.println("secondSmallest "+distinctNumbers.stream().sorted().collect(Collectors.toList()).get(1));
        System.out.println("Largest "+distinctNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0));
        Integer secondSmallest = myList.stream().distinct().sorted()
        .skip(1)
        .findFirst()
        .orElse(null);
  
      // Find the second largest element
      Integer secondLargest = myList.stream().distinct().sorted((a, b) -> Integer.compare(b, a))
        .skip(1)
        .findFirst()
        .orElse(null);

        System.out.println("secondSmallest :"+secondSmallest+" "+"secondLargest :"+secondLargest);
    
    
    }                                                                                                                                           
    
}

