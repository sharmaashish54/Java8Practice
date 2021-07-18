package java8.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.practice.entities.Car;

public class StreamWithPredicateFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> carList = new ArrayList<>();
		carList.add(new Car("Polo", "Volkswagan", 700000));
		carList.add(new Car("KWID", "Renault", 450000));
		carList.add(new Car("Swift", "Suzuki", 650000));
		//Filter takes predicate as argument
		List<Car> filteredList = carList.stream().filter(x -> x.getCarCompany().contains("a"))
				.collect(Collectors.toList());
		System.out.println(filteredList);
	}

}
