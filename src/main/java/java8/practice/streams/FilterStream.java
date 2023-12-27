package java8.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= List.of(1,2,3,4,5,6,7);
		//list.add(45);//cannot be done as this list is immutable
		System.out.println(list);
		
		
		List<Integer> list2 = Arrays.asList(23,234,32,12,11,28); // this is also immutable
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(23);
		list3.add(243);
		list3.add(276);
		list3.add(78);
		list3.add(55);
		list3.add(43);
		
		//without stream: no of line of code is much more
		List<Integer> evenlist = new ArrayList<>();
		for(Integer i: list) {
			if(i%2==0) {
				evenlist.add(i);
			}
		}
		System.out.println(evenlist);
		
		evenlist.addAll(list2.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println(evenlist);
		
		
		evenlist.addAll(list3.stream().filter(i->i>100).collect(Collectors.toList()));
		System.out.println(evenlist);
		
	}

}
