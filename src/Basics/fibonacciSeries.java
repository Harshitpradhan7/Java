package Basics;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {

        System.out.println("Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of terms in Fibonacci Series: ");
        int terms = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        for (int i = 0; i < terms; i++) {
            System.out.print(firstTerm+", ");
            nextTerm= firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        System.out.println(nextTerm);
        System.out.println(firstTerm);
        System.out.println(secondTerm);
    }
}
