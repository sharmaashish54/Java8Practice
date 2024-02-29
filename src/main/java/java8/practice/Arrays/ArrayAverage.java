package java8.practice.Arrays;

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double avg = 0;
        for (int i : marks) {
            avg = (i + avg) / marks.length;

        }
        System.out.println("marks array avg :" + avg);

        // Scanner scanner = new Scanner(System.in);
        // scanner.nextLine();
    }

}
