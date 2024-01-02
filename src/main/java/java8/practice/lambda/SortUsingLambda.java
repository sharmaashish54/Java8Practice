package java8.practice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java8.practice.entities.Employee;

public class SortUsingLambda {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.addAll(Arrays.asList(new Employee(101, "Ashish"), new Employee(102, "bshuh"), new Employee(103, "dsh"),
				new Employee(104, "eshi"), new Employee(105, "zshis")));

		// second argument which is comparator, replaced by lambda expression

		Collections.sort(empList, (Employee e1, Employee e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));

		// Collections.sort(empList, Comparator.comparing(Employee::getEmployeeName));
		// Another way to call the function using ::

		System.out.println(empList);
	}

}
