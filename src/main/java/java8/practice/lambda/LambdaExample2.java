package java8.practice.lambda;

interface Operation{
	
	public int operation(int x, int y);
}
public class LambdaExample2 {
	
	public static void result(int i, int j , Operation opt) {
		System.out.println(opt.operation(i,j));
	}

	public static void main(String[] args) {
		result(50, 90 ,(a,b)->a+b);//Lambda expression as argument
		result(50, 90 ,(a,b)->a-b);//Operation functional interface
		result(50, 90 ,(a,b)->a*b);//can take 2 arguments and definition
		result(50, 90 ,(a,b)->a/b);//is given here
	}

}
