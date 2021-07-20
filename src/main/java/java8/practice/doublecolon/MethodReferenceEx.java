package java8.practice.doublecolon;

import java8.practice.functionalinterface.MethodReferenceIterface;

public class MethodReferenceEx {

	public static void main(String[] args) {

		//Using lambda function
		MethodReferenceIterface itrObj1 = (a, b)->a+b;
		System.out.println(itrObj1.sum(31, 13));
		
		//Instead of using lambda function, use method reference to increase code re-usability
		 MethodReferenceIterface itrObj2 = MethodReferenceImplSum::doSum;
		 itrObj2.sum(4, 22);
		 
	}

}
