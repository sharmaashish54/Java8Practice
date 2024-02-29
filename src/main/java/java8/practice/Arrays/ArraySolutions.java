package java8.practice.Arrays;

import java.util.Scanner;

public class ArraySolutions {

	public static void main(String[] args) {
        //1.Write an array program in java to add the element of the array.
        int[] array = {10,20,21,22,24,31};
        int sum = 0;
        for (int i : array) {
            sum+=i;
        }
        System.out.println("sum of all elements :"+sum);
        
        //2.Write an array program in java to add the element taken by the user of the array.
        Scanner myObj = new Scanner(System.in);

       System.out.println("Enter the size of array :");
       int arraySize = myObj.nextInt();
       int[] newArray = new int[arraySize];
       int newSum =0;

       for (int i=0;i<arraySize;i++) {
        newArray[i] = myObj.nextInt();
       }
       for (int i : newArray) {
        newSum+=i;
        }
       System.out.println("New sum of elements :"+newSum);


    }
}