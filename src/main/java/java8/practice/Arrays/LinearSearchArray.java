package java8.practice.Arrays;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the numbers of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int search = scanner.nextInt();
        linearSearch(arr, search);
    }

    private static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at index : " + i);
                return i;
            } 
        }
        System.out.println("Not found -1");
        return -1;
    }

}
