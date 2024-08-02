package Basics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Program 3: Factorial of a Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int number = sc.nextInt();
        int fact = 1 ;
        System.out.println(fact);
        for (int i = number; i > 0 ; i--) {
            fact *= i;
        }
    }
}
