package java8.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseBlocks {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
//		String str = "";
//		if (n % 2 == 1 || n == 1) {
//			str = "Weird";
//		} else {
//			if (2 <= n && n <= 5) {
//				str = "Not Weird";
//			} else if (6 <= n && n <= 20) {
//				str = "Weird";
//			} else if (n > 20) {
//				str = "Not Weird";
//			}
//		}
		String str = (n % 2 == 1 || n == 1)?"Weird":(2 <= n && n <= 5)?"Not Weird":(6 <= n 
				&& n <= 20)?"Weird":(n > 20)?"Not Weird":"";
		System.out.println(str);
		bufferedReader.close();
	}
}
