package java8.practice.predicatefunctioninterface;

import java.util.ArrayList;
import java.util.List;

import java8.practice.entities.Car;

interface MyPredicate<T> {
	boolean operation(T t);
}

public class TestCustomPredicateFunctionalInterface {

	public static void main(String[] args) {

		List<Car> carList = new ArrayList<>();
		carList.add(new Car("Polo", "Volkswagan", 700000));
		carList.add(new Car("KWID", "Renault", 450000));
		carList.add(new Car("Swift", "Suzuki", 650000));

		// custom predicate which can do the same thing as predicate with method name as
		// operation same as test
		MyPredicate<Car> predicate = x -> (x.getCarPrice() < 700000);
		for (Car c : carList) {
			if (predicate.operation(c)) {
				System.out.println(c.getCarModel() + " " + c.getCarCompany());
			}
		}
	}

}
