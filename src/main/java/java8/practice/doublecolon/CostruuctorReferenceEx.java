package java8.practice.doublecolon;

import java8.practice.entities.Student;
import java8.practice.functionalinterface.ConstructorReferenceInterface;

public class CostruuctorReferenceEx {

	public static void main(String[] args) {
		
		ConstructorReferenceInterface obj1 = ()->{ return new Student();};//Using lambda expression
		
		Student obj2 = obj1.getStudent();
		obj2.display();

		//Classname::new - constructor reference
		ConstructorReferenceInterface obj3  = Student::new;//constructor reference instead of lambda
		Student obj4 = obj3.getStudent();
		obj4.display();
	}

}
