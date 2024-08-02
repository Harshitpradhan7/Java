package Basics;

import java.util.Scanner;

public class simpleInterestCalculator {
    public static void main(String[] args) {
        // Program 5: Simple Interest Calculator:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Value: ");
        float p = sc.nextFloat();
        System.out.println("Enter Rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter Time in Years: ");
        int t = sc.nextInt();

        float interest = (p*r*t)/100;
        float total = p+interest;
        System.out.println("Interest: "+interest);
        System.out.println("Amount Recieved: "+ total);
        sc.close();
    }
}
