package java8.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSort {

	public static void main(String[] args) {
		
		Product product1 = new Product(1L,"iPhone 13",39000.0,"Mobile");
		Product product2 = new Product(1L,"iPhone 16",80000.0,"Mobile");
		Product product3 = new Product(1L,"iPhone 14",59000.0,"Mobile");
		Product product4 = new Product(1L,"iPhone 11",19000.0,"Mobile");
		
		List<Product> productList = new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		
		List<Product> productList2 = Arrays.asList(product1,product2,product3,product4);
		
		Collections.sort(productList,(o1,o2)->o1.getName().length()-o2.getName().length());
		productList2.sort(Collections.reverseOrder());
		
		//binary search
		productList2.stream().filter(o-> o.getName().equals("iPhone 16"));
		
		

	}

}
