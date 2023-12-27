package java8.practice.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.practice.entities.Employee;

public class FlatMapEx {

	public static void main(String[] args) {

		List<Employee> employeeList1 = new ArrayList<>();
		employeeList1.add(new Employee(101, "Ashish"));
		employeeList1.add(new Employee(102, "Ankur"));
		employeeList1.add(new Employee(103, "Deepak"));

		List<Employee> employeeList2 = new ArrayList<>();
		employeeList2.add(new Employee(104, "Piyush"));
		employeeList2.add(new Employee(12323, "Azhar"));
		employeeList2.add(new Employee(1033, "Faith"));

		List<Employee> employeeList3 = new ArrayList<>();
		employeeList3.add(new Employee(1012, "Amber"));
		employeeList3.add(new Employee(1023, "Mahesh"));
		employeeList3.add(new Employee(1093, "Mukesh"));

		// we can combine these 3 lists using flat map

		// Returns a stream consisting of the results of replacing each element of this
		// stream with the contents of a mapped stream produced by applying the provided
		// mapping function to each element. Each mapped stream is closed after its
		// contents have been placed into this stream. (If a mapped stream is null an
		// empty stream is used, instead.)

		System.out.println(Stream.of(employeeList1, employeeList2, employeeList3).flatMap(List::stream)
				.collect(Collectors.toList()));

		System.out.println(Stream.of(employeeList1, employeeList2, employeeList3).collect(Collectors.toList()));

	}

}
