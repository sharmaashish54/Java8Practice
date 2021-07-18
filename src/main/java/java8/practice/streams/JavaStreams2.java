package java8.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.practice.entities.Employee;

public class JavaStreams2 {

	public static void main(String[] args) {

		Stream.generate(Math::random).limit(10).forEach(System.out::println);

		// List to map with Streams:

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Ashish"));
		employeeList.add(new Employee(102, "Ankur"));
		employeeList.add(new Employee(103, "Deepak"));

		System.out.println(
				employeeList.stream().collect(Collectors.toMap(Employee::getEmployeeId, Employee::getEmployeeName)));
	}

}
