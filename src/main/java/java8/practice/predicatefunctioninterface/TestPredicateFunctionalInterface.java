package java8.practice.predicatefunctioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java8.practice.entities.Car;

public class TestPredicateFunctionalInterface {

	public static void main(String[] args) {

		List<Car> carList = new ArrayList<>();
		carList.add(new Car("Polo","Volkswagan",700000));
		carList.add(new Car("KWID","Renault",450000));
		carList.add(new Car("Swift","Suzuki",650000));
		
		//We can write our custom predicate which can do the same thing
		Predicate<Car> predicate = x-> (x.getCarPrice() > 500000);
		for(Car c : carList) {
			if(predicate.test(c)) {
			System.out.println(c.getCarModel()+" "+c.getCarCompany());
			}
		}
	}

}
