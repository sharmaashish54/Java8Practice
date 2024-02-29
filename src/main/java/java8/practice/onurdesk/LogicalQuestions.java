package java8.practice.onurdesk;

import java.util.Map;
import java.util.stream.Collectors;

public class LogicalQuestions {

    public static void main(String[] args) {
        
    
    //1.Write a program in java to find a duplicate character.
    String str = "My name is Ashish Sharma";

     // Create a map where each character is mapped to its count of occurrences
     Map<Character, Long> charCountMap = str.chars()
     .mapToObj(c -> (char) c)
     .collect(Collectors.groupingBy(c -> c, Collectors.counting()));



// Print characters that have more than 1 occurrence (i.e., duplicates)
System.out.println("Duplicate characters in the string '" + str + "':");
charCountMap.entrySet().stream()
     .filter(entry -> entry.getValue() > 1)
     .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

    }
    
}
